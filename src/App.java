import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int tamanho = 10;
        int[] array = new int[tamanho];

        // Estudante[] estudantes = new Estudante[tamanho];

        // int id;
        // String nome;
        // double nota;

        // for (int i = 0; i < estudantes.length; i++) {
        //     System.out.println("Informe o id: ");
        //     id = scan.nextInt();

        //     scan.nextLine();
            
        //     System.out.println("Informe o nome: ");
        //     nome = scan.nextLine();

        //     System.out.println("Informe a nota: ");
        //     nota = scan.nextDouble();

        //     estudantes[i] = new Estudante(id, nome, nota);
        // }

        // int indiceVerificador;

        // for (int i = 0; i < estudantes.length; i++) {
        //     indiceVerificador = i;

        //     for (int j = i + 1; j < estudantes.length; j++) {
        //         if (estudantes[j].getNota() > estudantes[indiceVerificador].getNota()) {
        //             indiceVerificador = j;
        //         } else if (estudantes[j].getNota() == estudantes[indiceVerificador].getNota()) {
        //             if (estudantes[j].getNome().compareTo(estudantes[indiceVerificador].getNome()) < 0) {
        //                 indiceVerificador = j;
        //             } else if (estudantes[j].getNome().compareTo(estudantes[indiceVerificador].getNome()) == 0) {
        //                 if (estudantes[j].getId() < estudantes[indiceVerificador].getId()) {
        //                     indiceVerificador = j;
        //                 }
        //             }
        //         }
        //     }

        //     Estudante estudante = estudantes[indiceVerificador];
        //     estudantes[indiceVerificador] = estudantes[i];
        //     estudantes[i] = estudante;

        //    // id = estudantes[indiceVerificador].getId();
        //    // nome = estudantes[indiceVerificador].getNome();
        //    // nota = estudantes[indiceVerificador].getNota();
        //    // estudantes[indiceVerificador] = estudantes[i];

        //    // estudantes[i] = new Estudante(id, nome, nota);
        // }

        // for(Estudante e: estudantes){
        //     System.out.println(e.getNome());
        // }
        // int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("\nInforme o %dº valor: ", (i + 1));
            array[i] = scan.nextInt();
        }

        // int numero, posicaoNumero = -1;

        // System.out.println("\nInforme o número que deseja buscar: ");
        // numero = scan.nextInt();

        // ** Busca linear:
        // System.out.println("\n*****BUSCA LINEAR*****");

        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == numero) {
        //         posicaoNumero = i;
        //         break;
        //     }
        // }

        // if (posicaoNumero > -1) {
        //     System.out.printf("\nO número %d está na posição [%d] do array.\n", numero, posicaoNumero);
        // } else {
        //     System.out.println("\nElemento não encontrado dentro do array!");
        // }
        // ** FIM: Busca Linear

        System.out.println("\nArray com os elementos antes da ordenação:");
        imprimirArray(array);

        int flag;

        // ** Selection Sort
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    flag = array[i];
                    array[i] = array[j];
                    array[j] = flag;
                }
            }
        }

        System.out.println("\nArray após ordenação dos elementos:");
        imprimirArray(array);
        // ** FIM: Selection Sort

        // ** Busca Binária
        int resultado = -1, inicio = 0, fim = array.length - 1, meio = 0, alvo;
        
        System.out.println("Informe o elemento que deseja encontrar: ");
        alvo = scan.nextInt();

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (array[meio] < alvo) {
                inicio = meio + 1;
            } else if (array[meio] > alvo) {
                fim = meio - 1;
            } else if (array[meio] == alvo) {
                resultado = meio;
                break;
            }
        }

        if (resultado < 0) {
            System.out.println("Elemento não encontrado!");
        } else {
            System.out.printf("\nO elemento %d está na posição %d", alvo, resultado);
        }        
        // ** FIM: Busca Binária

        // ** SELECTION SORT
        // for (int i = 0; i < array.length; i++) {
        //     int indiceDoMenor = i;
        //     for (int j = i + 1; j < array.length; j++) {
        //         if (array[j] < array[indiceDoMenor]) {
        //             indiceDoMenor = j;
        //         }
        //         countTeste++;
        //     }
        //     int temp = array[indiceDoMenor];
        //     array[indiceDoMenor] = array[i];
        //     array[i] = temp;
        //     countTeste++;
        // }
        // int elementoPosterior, count, countVerifica;

        // for (int i = 1; i < array.length; i++) {
        //     count = 0;
        //     countVerifica = 0;
            
        //     while (count < (array.length - 1)) {
        //         if (array[count] > array[count + 1]) {
        //             elementoPosterior = array[count + 1];
        //             array[count + 1] = array[count];
        //             array[count] = elementoPosterior; 
        //             countVerifica++;
        //         }
        //         countTeste++;
        //         count++;
        //     }

        //     countTeste++;

        //     if (countVerifica == 0) {
        //         break;
        //     }
        // }

        scan.close();
    }

    public static void imprimirArray(int[] array) {
        System.out.println("\nNúmeros do array:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

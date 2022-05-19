import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int tamanho = 5;
        // int[] array = new int[tamanho];

        Estudante[] estudantes = new Estudante[tamanho];

        int id;
        String nome;
        double notaEstudante;

        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Informe o id: ");
            id = scan.nextInt();

            scan.nextLine();
            
            System.out.println("Informe o nome: ");
            nome = scan.nextLine();

            System.out.println("Informe a nota: ");
            notaEstudante = scan.nextDouble();

            estudantes[i] = new Estudante(id, nome, notaEstudante);
        }

        int indiceVerificador;

        for (int i = 0; i < estudantes.length; i++) {
            indiceVerificador = i;

            for (int j = i + 1; j < estudantes.length; j++) {
                if (estudantes[j].getNota() > estudantes[indiceVerificador].getNota()) {
                    indiceVerificador = j;
                } else if (estudantes[j].getNota() == estudantes[indiceVerificador].getNota()) {
                    if (estudantes[j].getNome().compareTo(estudantes[indiceVerificador].getNome()) < 0) {
                        indiceVerificador = j;
                    } else if (estudantes[j].getNome().compareTo(estudantes[indiceVerificador].getNome()) == 0) {
                        if (estudantes[j].getId() < estudantes[indiceVerificador].getId()) {
                            indiceVerificador = j;
                        }
                    }
                }
            }

            Estudante estudante = estudantes[indiceVerificador];
            estudantes[indiceVerificador] = estudantes[i];
            estudantes[i] = estudante;

           // id = estudantes[indiceVerificador].getId();
           // nome = estudantes[indiceVerificador].getNome();
           // nota = estudantes[indiceVerificador].getNota();
           // estudantes[indiceVerificador] = estudantes[i];

           // estudantes[i] = new Estudante(id, nome, nota);
        }

        for(Estudante e: estudantes){
            System.out.println(e.getNome());
        }
        // int[] array = new int[10];

        // for (int i = 0; i < array.length; i++) {
        //     System.out.printf("\nInforme o %dº valor: ", (i + 1));
        //     array[i] = scan.nextInt();
        // }

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

        // System.out.println("\nArray com os elementos antes da ordenação:");
        // imprimirArray(array);

        // int flag;

        // // ** Selection Sort
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = i + 1; j < array.length; j++) {
        //         if (array[j] < array[i]) {
        //             flag = array[i];
        //             array[i] = array[j];
        //             array[j] = flag;
        //         }
        //     }
        // }

        // System.out.println("\nArray após ordenação dos elementos:");
        // imprimirArray(array);
        // ** FIM: Selection Sort

        // ** Busca Binária
        int inicio = 0, fim = estudantes.length - 1, meio = 0;
        double nota;
        String resultado = "";
        
        nota = scan.nextDouble();
        
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (estudantes[meio].getNota() < nota) {
                inicio = meio + 1;
            } else if (estudantes[meio].getNota() > nota) {
                fim = meio - 1;
            } else if (estudantes[meio].getNota() == nota) {
                resultado = estudantes[meio].getNome();
                break;
            }
        }
        
        System.out.println(resultado);
        // int inicio = 0, fim = estudantes.length - 1, meio = 0;
        // double alvo;
        // String resultado = "";
        
        // System.out.println("Informe o elemento que deseja encontrar: ");
        // alvo = scan.nextDouble();

        // while (inicio <= fim) {
        //     meio = (inicio + fim) / 2;

        //     if (estudantes[meio].getNota() < alvo) {
        //         inicio = meio + 1;
        //     } else if (estudantes[meio].getNota() > alvo) {
        //         fim = meio - 1;
        //     } else if (estudantes[meio].getNota() == alvo) {
        //         resultado = estudantes[meio].getNome();
        //         break;
        //     }
        // }

        // if (resultado.equals("")) {
        //     System.out.println("Elemento não encontrado!");
        // } else {
        //     System.out.println("Aluno que possui a nota buscada: " + resultado);
        // }        
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

        // ** Tentativa de resposta do ultimo desafio:
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
        // }
        
        
        
        // int inicio = 0, fim = estudantes.length - 1, meio = 0;
        // double nota;
        // String resultado = "";
        
        // nota = scann.nextDouble();
        
        // while (inicio <= fim) {
        //     meio = (inicio + fim) / 2;
        //     if (estudantes[meio].getNota() < nota) {
        //         inicio = meio + 1;
        //     } else if (estudantes[meio].getNota() > nota) {
        //         fim = meio - 1;
        //     } else if (estudantes[meio].getNota() == nota) {
        //         resultado = estudantes[meio].getNome();
        //         break;
        //     }
        // }
        
        // System.out.println(resultado);
    }

    public static void imprimirArray(int[] array) {
        System.out.println("\nNúmeros do array:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

// ** Código completo do ultimo desafio:
// public class App {
//     public static void main(String args[]) {
//         Scanner scann = new Scanner(System.in);
        
//         int tamanho = Integer.parseInt(scann.nextLine());
        
//         Estudante[] estudantes = new Estudante[tamanho];
//         for(int i = 0; i < estudantes.length; i++)
//         {
//             int id = scann.nextInt();
//             String nome = scann.next();
//             double nota = scann.nextDouble();
            
//             estudantes[i] = new Estudante(id, nome, nota);
//         }

//         int id;
//         String nome;
//         double nota;
//         int indiceVerificador;
        
//         for (int i = 0; i < estudantes.length; i++) {
//             indiceVerificador = i;
//             for (int j = i + 1; j < estudantes.length; j++) {
//                 if (estudantes[j].getNota() > estudantes[indiceVerificador].getNota()) {
//                     indiceVerificador = j;
//                 } else if (estudantes[j].getNota() == estudantes[indiceVerificador].getNota()) {
//                     if (estudantes[j].getNome().compareTo(estudantes[indiceVerificador].getNome()) < 0) {
//                         indiceVerificador = j;
//                     } else if (estudantes[j].getNome().compareTo(estudantes[indiceVerificador].getNome()) == 0) {
//                         if (estudantes[j].getId() < estudantes[indiceVerificador].getId()) {
//                             indiceVerificador = j;
//                         }
//                     }
//                 }
//             }

//             id = estudantes[indiceVerificador].getId();
//             nome = estudantes[indiceVerificador].getNome();
//             nota = estudantes[indiceVerificador].getNota();
//             estudantes[indiceVerificador] = estudantes[i];
//             estudantes[i] = new Estudante(id, nome, nota);
//         }
        
//         int inicio = 0, fim = estudantes.length - 1, meio = 0;
        
//         nota = scann.nextDouble();
        
//         while (inicio <= fim) {
//             meio = (inicio + fim) / 2;
//             if (estudantes[meio].getNota() < nota) {
//                 inicio = meio + 1;
//             } else if (estudantes[meio].getNota() > nota) {
//                 fim = meio - 1;
//             } else if (estudantes[meio].getNota() == nota) {
//                 System.out.println(estudantes[meio].getNome());
//                 break;
//             }
//         }

//         scann.close();
//     }
// }
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int tamanho = 5;
        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("\nInforme o %dº valor: ", (i + 1));
            array[i] = scan.nextInt();
        }

        // ** Busca linear:
        // int numero, posicaoNumero = -1;

        // System.out.println("\nInforme o número que deseja buscar: ");
        // numero = scan.nextInt();

        
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

        int flag;

        // // ** Selection Sort que eu fiz
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
        int inicio = 0, fim = array.length - 1, meio = 0, alvo, resultado = -1;
        
        System.out.println("\nInforme o número que deseja buscar: ");
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
            System.out.println("\nNúmero não encontrado!\n");
        } else {
            System.out.printf("\nO número %d está na posição [%d] do array.\n\n", alvo, resultado);
        }        
        // ** FIM: Busca Binária

        // ** Selection Sort
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
        // ** FIM: Selection Sort

        scan.close();
    }

    public static void imprimirArray(int[] array) {
        System.out.println("\nNúmeros do array:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
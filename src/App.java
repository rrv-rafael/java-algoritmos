import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("\nInforme o %dº valor: ", (i + 1));
            array[i] = scan.nextInt();
        }

        int numero, posicaoNumero = -1;

        System.out.println("\nInforme o número que deseja buscar: ");
        numero = scan.nextInt();

        //Busca linear:
        System.out.println("\n*****BUSCA LINEAR*****");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                posicaoNumero = i;
                break;
            }
        }

        if (posicaoNumero > -1) {
            System.out.printf("\nO número %d está na posição [%d] do array.\n", numero, posicaoNumero);
        } else {
            System.out.println("\nElemento não encontrado dentro do array!");
        }

        System.out.println("\nArray com os elementos antes da ordenação:");
        imprimirArray(array);

        //SELECTION SORT
        int elementoPosterior, count, countVerifica;

        for (int i = 1; i < array.length; i++) {
            count = 0;
            countVerifica = 0;
            
            while (count < (array.length - 1)) {
                if (array[count] > array[count + 1]) {
                    elementoPosterior = array[count + 1];
                    array[count + 1] = array[count];
                    array[count] = elementoPosterior; 
                    countVerifica++;
                }

                count++;
            }

            if (countVerifica == 0) {
                break;
            }
        }

        System.out.println("\nArray após ordenação dos elementos:");
        imprimirArray(array);

        scan.close();
    }

    public static void imprimirArray(int[] array) {
        System.out.println("\nNúmeros do array:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

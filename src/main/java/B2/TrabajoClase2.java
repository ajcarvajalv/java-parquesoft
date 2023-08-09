package B2;

import java.util.Scanner;

public class TrabajoClase2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //List<Integer> numPares = new ArrayList<>();
        //List<Integer> numImpares = new ArrayList<>();
        String numPares = "Numeros pares: ";
        String numImpares = "Numeros impares: ";

        System.out.println("Digite el número entero positivo límite");
        int limite = scanner.nextInt();

        for (int i = 0; i <= limite; i++) {
            if (i % 2 == 0){
                numPares = numPares + String.valueOf(i) + " ";
            }else{
                numImpares = numImpares + String.valueOf(i) + " ";
            }
        }

        System.out.println(numPares);
        System.out.println(numImpares);
    }
}

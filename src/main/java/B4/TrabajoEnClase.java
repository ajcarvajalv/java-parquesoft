package B4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TrabajoEnClase {

    /* Realizar un programa que divida 2 numeros, si la división tiene indeterminacion capturar el error.
Si el usuario ingresa algo que no sea un numero, capturar el error, si el usuario envia un valor vacio,
capturar el error, el programa no debe terminar hasta que el usuario lo decida. */

    public static void main(String[] args) {
        int num1, num2;
        String exit = "";

        System.out.println("Por favor, ingrese los dos números a dividir y presione enter:");

        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Número 1:");
                num1 = scanner.nextInt();
                System.out.println("Número 2:");
                num2 = scanner.nextInt();

                System.out.println("El resultado es: " + division(num1, num2));


            } catch (ArithmeticException e){
                System.out.println("¡Atención! El dividendo no puede ser cero");

            } catch (NullPointerException e){
                System.out.println("¡Atención! Por favor ingrese un dato");

            } catch (InputMismatchException e){
                System.out.println("¡Atención! Solo puede ingresar números");

            }

            System.out.println("¿Desea hacer otra operación (S/N)");
            Scanner option = new Scanner(System.in);
            exit = (option.nextLine()).toUpperCase();


            while (!exit.equals("S") && !exit.equals("N")) {
                System.out.println("Opción errónea. Por favor ingrese solo S o N");
                exit = option.nextLine();
            }
        } while (!exit.equals("N"));

    }

    public static double division (int num1, int num2){
        return (double) num1 / num2;
    }
}

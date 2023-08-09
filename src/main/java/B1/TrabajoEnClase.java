package B1;
public class TrabajoEnClase {

    public static void main(String[] args) {

        // 1)Deben desarrolla un software que calcule el menor de 2 numero declarados anteriormente.

        int num1 = 10;
        int num2 = 20;
        int anioNacimiento = 1991;
        final int anioActual = 2023;
        boolean cumplioAnios = true;

        if (num1 > num2) {
            System.out.println(num2 + " es menor que " + num1);
        } else {
            System.out.println(num1 + " es menor que " + num2);
        }

        // 2)Deben desarrolla un software que calcule su edad a partir del anio de nacimiento


        if (cumplioAnios == true) {
            System.out.println("Usted nació en " + anioNacimiento + " y ya cumplió años este año, por lo que su edad actual es " + (anioActual - anioNacimiento));
        } else {
            System.out.println("Usted nació en " + anioNacimiento + " y no ha cumplido años este año, por lo que su edad actual es " + (anioActual - anioNacimiento - 1));
        }




    }

}

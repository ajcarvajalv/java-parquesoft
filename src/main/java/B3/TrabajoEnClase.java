package B3;
import java.util.Scanner;
public class TrabajoEnClase {
    public static void main(String[] args) {
        // Realizar un menu con 3 opciones, 1 va ha realizar un login  y ese login debe pedir usuario y pass.
        // si lo pone 3 veces mal la informacion debe decir usuario bloqueado

        final String user = "admin";
        final String pass = "12345";
        int fail = 1;
        boolean logged = false;
        String logUser = "";
        String logPass = "";
        String email = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Menú ***\n1. Iniciar sesión\n2. Comprar boletas\n3. Vender boletas\nPor favor, ingrese su opción: ");
        int opcMenu = scanner.nextInt();

        switch (opcMenu){
            case 1:
                System.out.println("Por favor, ingrese su nombre de usuario y contraseña:");
                while (fail <= 3 && !logged){

                    Scanner loginScan = new Scanner(System.in);

                    System.out.println("Nombre de usuario:");
                    logUser = loginScan.nextLine();

                    System.out.println("Contraseña:");
                    logPass = loginScan.nextLine();

                    if(!logUser.equals(user) || !logPass.equals(pass)){
                        if(fail < 3){
                            System.out.println("Datos erróneos. Por favor intente de nuevo");
                            fail++;
                        }else{
                            System.out.println("Ha agotado sus intentos de ingreso. Usuario bloqueado.");
                            fail++;
                        }
                    } else {
                        System.out.println("¡Ingreso exitoso!");
                        logged = true;
                    }
                }
                break;
            case 2:
                System.out.println("Lo sentimos, no hay boletas disponibles");
                break;
            case 3:
                System.out.println("Por favor, ingrese su correo electrónico:");
                Scanner emailscan = new Scanner(System.in);
                email = emailscan.nextLine();
                System.out.println("¡Muchas gracias! Uno de nuestros asesores se comunicará con usted");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

    }
}
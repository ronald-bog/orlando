import java.util.Scanner;

public class Ejercicio {

    static void nombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        //return nombre;
    }

    static void ejercicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame numero entre 1 y 7:");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.printf("El %d Corresponde al lunes %n",numero);
                break;
            case 2:
                System.out.println("Corresponde al Martes");
                break;
            case 3:
                System.out.println("Corresponde al Miercoles");
                break;
            case 4:
                System.out.println("Corresponde al Jueves");
                break;
            case 5:
                System.out.println("Corresponde al Viernes");
                break;
            case 6:
                System.out.println("Corresponde al Sabado");
                break;
            case 7:
                System.out.println("Corresponde al Domingo");
                break;
            default:
                System.out.println("Dame uno valido");
                ejercicio();
        }
    }
}

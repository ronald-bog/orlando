//****************  CLASE ABRIL 10  ****************************************************************
public class If {
    public static void ifEst() {
//*****        En Java, el condicional if-else if-else se utiliza para tomar decisiones basadas en condiciones. Aquí tienes una explicación junto con ejemplos:

//*******        if -else simple:
        int numero = 10;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }

        System.out.println((numero > 0) ? "El número es positivo." : "");

        int valor = 1;
        String mensaje;

        mensaje = valor == 1 ? "Numero uno" : "Otro numero";
        System.out.printf("La salida de la ternaria: %s\n", mensaje);

//*******        if -else if -else :
        int numero1 = 0;
        if (numero1 > 0) {
            System.out.println("El número es positivo.");
        } else if (numero1 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

//*********        if -else if -else con múltiples condiciones:
        int numero2 = 10;
        if (numero2 > 0 && numero2 % 2 == 0) {
            System.out.println("El número es positivo y par.");
        } else if (numero2 > 0 && numero2 % 2 != 0) {
            System.out.println("El número es positivo e impar.");
        } else if (numero2 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
//*********        if if -else con CASO ESPECIAL:
        System.out.println("****************");
        int numero3 = 1;
        if (numero3 > 0) {
            System.out.println("AA El número es positivo.");
        }
        if (numero3 < 0) {
            System.out.println("AA El número es negativo.");
        } else {
            System.out.println("AA El número es cero.");
        }

//********* Un "if" anidado se refiere a la situación en la que tienes una estructura "if" dentro de otra estructura
//        "if".Esto se utiliza cuando necesitas evaluar condiciones adicionales dentro de una rama condicional.Aquí tienes
//        un ejemplo de un "if" anidado en Java:
        int edad = 25;
        boolean tieneLicenciaConducir = true;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
            if (tieneLicenciaConducir) {
                System.out.println("Tienes una licencia de conducir.");
            } else {
                System.out.println("No tienes una licencia de conducir.");
            }
        } else {
            System.out.println("Eres menor de edad.");
        }


    }
}

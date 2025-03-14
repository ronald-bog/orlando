public class Metodos {
    static void funcionV(){
        System.out.println("Hola Mundo");
    }

    static void funcionVParam(int num1, int num2){
        System.out.println(num1 + num2);
    }

    static public String funcionVRet(){
        return "mensaje de retorno desde la funcion";
    }

    static int restar(int a, int b){
        return a - b;
    }

    /* STATIC: Metodos o atributos que pueden ser accedidos directamente llamando la clase, no es necesario crear instancias */

    /* ENCAPSULAMIENTO: Es un principio de la programación orientada a objetos (POO) que consiste en ocultar los detalles de implementación de un objeto y exponer solo las partes esenciales y necesarias para interactuar con él.*/

    /* Modificador   Clase    Paquete   Subclase  Otro_Paquete
    *   private        OK
    *   default        OK        OK
    *   protected      OK        OK       OK
    *   public         OK        OK       OK           OK              */

}

public class Switch {
    public static void switchEst() {
//        Sí, en Java existe la estructura de control switch. La estructura switch se utiliza para seleccionar una de las múltiples opciones basadas en el valor de una expresión. Es una alternativa a utilizar múltiples bloques if-else if-else cuando se necesita tomar decisiones basadas en una variable que puede tener diferentes valores.
        String opcion = "uno";
        switch (opcion) {
            case "Uno":
                System.out.println("Seleccionaste la opción 1");
                break;
            case "dos":
                System.out.println("Seleccionaste la opción 2");
                break;
            case "tres":
                System.out.println("Seleccionaste la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

import java.util.Arrays;

public class Array {
    static void arrays() {

//        Los arrays en  son estructuras de datos que nos permiten almacenar múltiples valores del mismo tipo bajo un mismo nombre. Estos valores se encuentran ordenados y pueden ser accedidos mediante un índice. Aquí te explico los conceptos básicos y te doy algunos ejemplos para que los entiendas mejor:

        // tipo[] nombreArray;

        //Inicialización de un Array:

        //Ejemplo 1: Declaración e Inicialización de un Array de Enteros:
        int[] numeros = new int[5]; // Array de enteros con tamaño 5
        numeros[0] = 10; // Asignamos el valor 10 al primer elemento del array
        numeros[1] = 20; // Asignamos el valor 20 al segundo elemento del array

        //Ejemplo 2: Declaración e Inicialización de un Array de Strings:
        String[] nombres = {"Juan", "María", "Pedro", "Ana"}; // Array de strings inicializado con nombres
        String nombre = nombres[2]; // Accedemos al tercer elemento del array (Pedro)

        //Arrays Multidimensionales:

        int[][] matriz = new int[3][3]; // Matriz de enteros de 3x3

        //Ejemplo 3: Array Multidimensional:

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Matriz inicializada
        int valor = matriz1[1][2]; // Accedemos al elemento en la segunda fila y tercera columna (6)


        // 1. Método Arrays.copyOf() = Este método se utiliza para copiar un array en otro con una longitud específica.

        //import .util.Arrays;
        int[] original = {1, 2, 3, 4, 5};
        int[] copia = Arrays.copyOf(original, 3); // Copia los primeros 3 elementos
        System.out.println(Arrays.toString(copia)); // Salida: [1, 2, 3]

        //2. Método Arrays.sort() = Este método se utiliza para ordenar un array en orden ascendente.
        int[] numeros1 = {5, 2, 8, 1, 9};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros)); // Salida: [1, 2, 5, 8, 9]

        // 3. Método Arrays.equals() = Este método se utiliza para comparar dos arrays y verificar si son iguales.
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean iguales = Arrays.equals(array1, array2);
        System.out.println("Los arrays son iguales: " + iguales); // Salida: true

        //4. Método Arrays.binarySearch() = Este método se utiliza para buscar un elemento en un array ordenado.Devuelve el índice del elemento si se encuentra, de lo contrario, devuelve un número negativo.
        int[] numeros2 = {1, 2, 3, 4, 5};
        int indice = Arrays.binarySearch(numeros, 3);
        System.out.println("El índice del número 3 es: " + indice); // Salida: 2

        // 5. Método Arrays.fill() = Este método se utiliza para llenar un array con un valor específico.
        int[] numeros3 = new int[5];
        Arrays.fill(numeros, 7); // Llena el array con el valor 7
        System.out.println(Arrays.toString(numeros)); // Salida: [7, 7, 7, 7, 7]

    }
}

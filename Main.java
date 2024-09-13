class Main {

    public static void triangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Es un triangulo !");
            if (a == b && b == c) {
                System.out.println("De tipo equilatero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("De tipo isosceles.");
            } else {
                System.out.println("De tipo escaleno.");
            }
        } else {
            System.out.println("No es un triangulo !");
        }
    }

    // Nota: lo sé, se podría hacer mas limpio con unos ternary's ^^
    // o separando en varias funciones en vez de tantos if's

    public static void calculos(int x1, int x2) {
        System.out.println("La suma es igual a: " + (x1 + x2));
        System.out.println("El producto es igual a: " + (x1 * x2));

        if (x1 > x2) {
            System.out.println("El primer numero es mayor que el segundo");
        } else if (x1 == x2) {
            System.out.println("Los dos numeros son iguales");
        } else {
            System.out.println("El segundo numero es mayor que el primero");
        }

        if (x1 % 2 == 0 && x2 % 2 == 0) {
            System.out.println("Los dos numeros son pares");
        } else if (x1 % 2 == 0) {
            System.out.println("El primer numero es par");
        } else if (x2 % 2 == 0) {
            System.out.println("El segundo numero es par");
        }

        if (x1 % x2 == 0) {
            System.out.println("Los dos numeros son divisibles");
        } else {
            System.out.println("Los dos numeros no son divisibles");
        }

        if (x1 >= 1 && x1 <= 10) {
            if (x2 >= 1 && x2 <= 10) {
                System.out.println("Ambos numeros están comprendidos entre 1 y 10.");
            } else {
                System.out.println("El primer numero está comprendido entre 1 y 10.");
            }
        }

        x1 = x1 + x2;
        System.out.println("Incrementando el valor de x2 a x1 obtenemos x1 = " + x1);
    }

    public static void help() {
        System.out.println("Numero de argumentos incorrecto. Por favor use el programa de esta manera:");
        System.out.println("Ej.: java Main calculos 10 20");
        System.out.println("Ej.: java Main triangulo 9 10 18");
    }

    public static void main(String args[]) {
        if (args[0].equals("--help")) {
            help();
            return;
        }

        if (args.length == 3 || args.length == 4 ) {
            int x1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);

            if (args[0].equals("calculos"))
                calculos(x1, x2);
            if (args[0].equals("triangulo")) {
                int x3 = Integer.parseInt(args[3]);
                triangulo(x1, x2, x3);
            }
        } else {
            help();
        }
    }
}
import es.iesmz.prueba.Coche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, velocidad, frenar;
        String marca, modelo, color;

        Coche c1 = new Coche("Fiat", "Panda", "Amarillo");

        do {
            System.out.println("\n¿Qué ejercicio quieres ejecutar?");
            System.out.println("\t1. Imprimir datos del coche");
            System.out.println("\t2. Pintar el coche");
            System.out.println("\t3. Establecer marca");
            System.out.println("\t4. Establecer modelo");
            System.out.println("\t5. Establecer color");
            System.out.println("\t6. Acelerar (Pedir la velocidad por teclado)");
            System.out.println("\t7. Frenar (Pedir la velocidad por teclado)");
            System.out.println("\t8. Parar ");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                   c1.imprime();
                    break;
                case 2:
                   c1.pinta();
                    break;
                case 3:
                    System.out.println("Introduce la marca");
                    marca = sc.next();
                    c1.setMarca(marca);

                    break;
                case 4:
                    System.out.println("Introduce el modelo");
                    modelo = sc.next();
                    c1.setModelo(modelo);


                    break;
                case 5:
                    System.out.println("Introduce el color");
                    color = sc.next();
                    c1.setColor(color);

                    break;
                case 6:
                    System.out.println("Introduce la velocidad");
                    velocidad = sc.nextInt();
                    c1.setVelocidad(velocidad);
                    break;
                case 7:
                    System.out.println("Introduce el frenado");
                    frenar = sc.nextInt();
                    c1.frena(frenar);
                    break;
                case 8:
                    c1.para();
                    break;
                case 9:
                    System.out.println("¡Hasta otra!");
                    break;
            }

        } while(opcion != 0);
    }
}

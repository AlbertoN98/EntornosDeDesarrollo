import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MZFecha b = new MZFecha();
        int opcion,dia = 0,mes= 0,anyo= 0, dife;
        do {
            System.out.println("\n¿Qué ejercicio quieres ejecutar?");
            System.out.println("\t1. Establecer Fecha");
            System.out.println("\t2. Imprimir Fecha");
            System.out.println("\t3. Diferenciar dos Fechas");
            System.out.println("\t0. Salir");
            System.out.println("\t5. Ejercicio 5");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el dia");
                    dia = sc.nextInt();
                    System.out.println("Introduce el mes");
                    mes = sc.nextInt();
                    System.out.println("Introduce el año");
                    anyo = sc.nextInt();
                     b.setFecha(dia,mes,anyo);
                    break;
                case 2:
                    b.comprueba(dia,mes,anyo);
                    b.imprime();
                    break;
                case 3:
                    System.out.println("Introduce el dia");
                    dia = sc.nextInt();
                    System.out.println("Introduce el mes");
                    mes = sc.nextInt();
                    System.out.println("Introduce el año");
                    anyo = sc.nextInt();
                    b.setFecha(dia, mes,anyo);
                    dife = b.diasdesdeInicio();
                    System.out.println("La diferencia de dias es " + dife);
                    break;
                case 4:
                    System.out.println("¡Hasta otra!");
                    break;
            }

        } while(opcion != 0);

    }
}
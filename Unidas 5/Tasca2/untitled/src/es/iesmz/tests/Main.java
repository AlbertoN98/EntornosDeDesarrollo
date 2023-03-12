package es.iesmz.tests;

public class Main {
    public static void main(String[] args) {
        DiasLluvia dl = new DiasLluvia();
        // Prueba del método registroDia()
        // Registrar algunos días
        dl.registroDia(1, 1, true);
        dl.registroDia(1, 2, false);
        dl.registroDia(1, 3, true);

        // Consultar si llovió en algunos días
        System.out.println(dl.consultarDia(1, 1)); // true
        System.out.println(dl.consultarDia(1, 2)); // false
        System.out.println(dl.consultarDia(1, 3)); // true

        // Contar los días lluviosos
        System.out.println(dl.contarDiasLluviosos()); // 2

        // Obtener el trimestre con más lluvias
        System.out.println(dl.trimestreLluvioso()); // 1 (enero a marzo)

        // Obtener el primer día en que llovió
        System.out.println(dl.primerDiaLluvia()); // 1
        System.out.println("----------------------------------------------------");
        // Prueba del método diaDelAnio()

        // Test para verificar que el método diaDelAnio() funciona correctamente
        System.out.println(dl.diaDelAnio(1, 1, 2023));   // Debería imprimir 1
        System.out.println(dl.diaDelAnio(1, 2, 2023));   // Debería imprimir 32
        System.out.println(dl.diaDelAnio(15, 6, 2023));  // Debería imprimir 166
        System.out.println(dl.diaDelAnio(31, 12, 2023)); // Debería imprimir 365
        System.out.println("----------------------------------------------------");
        // Prueba del método consultarDia()

        // Consultar un día sin haber registrado nada devuelve false
        System.out.println(dl.consultarDia(1, 1)); // Output: false

        // Registrar un día y consultar si está registrado
        dl.registroDia(1, 1, true);
        System.out.println(dl.consultarDia(1, 1)); // Output: true

        // Consultar un día que no ha sido registrado devuelve false
        System.out.println(dl.consultarDia(2, 1)); // Output: false
        System.out.println(dl.consultarDia(1, 2)); // Output: false
        System.out.println("----------------------------------------------------");
        // Prueba del método contarDiasLluviosos()
        System.out.println(dl.contarDiasLluviosos()); // debería imprimir 0
        dl.registroDia(1, 1,true);
        dl.registroDia(1, 2, false);
        System.out.println(dl.contarDiasLluviosos()); // debería imprimir 1
        dl.registroDia(1, 3, true);
        dl.registroDia(1, 4, true);
        System.out.println(dl.contarDiasLluviosos()); // debería imprimir 3
        System.out.println("----------------------------------------------------");
        //Prueba del metodo trimestreLluvioso()
        dl.registroDia(1, 1,true);
        dl.registroDia(15, 3, false);
        dl.registroDia(1, 4, false);
        dl.registroDia(30, 6, true);
        dl.registroDia(1, 7, false);
        dl.registroDia(30, 9, true);
        dl.registroDia(1, 10, true);
        dl.registroDia(31, 12, false);
        int trimestreLluvioso = dl.trimestreLluvioso();
        System.out.println("El trimestre más lluvioso es: " + trimestreLluvioso);
        System.out.println("----------------------------------------------------");
        //Prueba del metodo primerDiaLluvia()
        dl.registroDia(1, 1,true);
        dl.registroDia(15, 3, true);
        dl.registroDia(1, 4, false);
        dl.registroDia(30, 6, true);
        dl.registroDia(1, 7, true);
        dl.registroDia(30, 9, false);
        dl.registroDia(1, 10, false);
        dl.registroDia(31, 12, true);
        System.out.println(dl.primerDiaLluvia()); // Debería imprimir 1
        dl.registroDia(2, 1, true);
        System.out.println(dl.primerDiaLluvia()); // Debería imprimir 2

    }


}

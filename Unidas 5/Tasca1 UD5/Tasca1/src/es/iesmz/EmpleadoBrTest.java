package es.iesmz;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBrTest {
    @BeforeEach
    public void imprimir(){
        System.out.println("EJECUTAR PRUEBA");
    }


    /* ------------- Calcular Salario Neto -----------------*/
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(2000.0f);
        float resultadoEsperado = 1640;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto2() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(1500.0f);
        float resultadoEsperado = 1230f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto3() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto4() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(1250.0f);
        float resultadoEsperado = 1050f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto5() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(1000.0f);
        float resultadoEsperado = 840f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto6() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto7() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(500.0f);
        float resultadoEsperado = 500f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto8() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(0.0f);
        float resultadoEsperado = 0f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioNeto9() {
        float resultadoReal = EmpleadoBr.calculaSalarioNeto(-1f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }

    /* ------------- Calcular Salario Bruto -----------------*/

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.VENDEDOR,2000.0f,8.0f);
        float resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto2() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.VENDEDOR,1500.0f,3.0f);
        float resultadoEsperado = 1260.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto3() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.VENDEDOR,1499.99f,0.0f);
        float resultadoEsperado = 1100.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto4() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.ENCARGADO,1250.0f,8.0f);
        float resultadoEsperado = 1760.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto5() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.ENCARGADO,1000.0f,0.0f);
        float resultadoEsperado = 1600.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto6() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.ENCARGADO,999.99f,3.0f);
        float resultadoEsperado = 1560.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto7() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.ENCARGADO,500.0f,0.0f);
        float resultadoEsperado = 1500.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto8() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.ENCARGADO,0.0f,8.0f);
        float resultadoEsperado = 1660.0f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto9() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.VENDEDOR,-1f,8.0f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto10() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(TipoEmpleado.VENDEDOR,1500.0f,-1f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }
    @org.junit.jupiter.api.Test
    void calculaSalarioBruto11() {
        float resultadoReal = EmpleadoBr.calculaSalarioBruto(null,1500.0f,8.0f);
        float resultadoEsperado = -1f;
        assertEquals(resultadoEsperado,resultadoReal, 0.01);
    }


}
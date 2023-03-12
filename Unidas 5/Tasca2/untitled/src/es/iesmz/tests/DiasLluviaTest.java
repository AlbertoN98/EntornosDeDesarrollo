package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    @BeforeEach
    public void imprimir(){
        System.out.println("EJECUTAR PRUEBA");
    }

    @org.junit.jupiter.api.Test
    void registroDia() {
        DiasLluvia dl = new DiasLluvia();
        assertFalse(dl.consultarDia(1, 1));
        dl.registroDia(1, 1, true);
        assertTrue(dl.consultarDia(1, 1));

    }

    @org.junit.jupiter.api.Test
    void diaDelAnio() {
        DiasLluvia dl = new DiasLluvia();
        assertEquals(dl.diaDelAnio(1, 1,2023), 1);
        assertEquals(dl.diaDelAnio(1, 2, 2023), 32);
        assertEquals(dl.diaDelAnio(15, 6, 2023), 166);
        assertEquals(dl.diaDelAnio(31, 12, 2023), 365);
    }

    @org.junit.jupiter.api.Test
    void consultarDia() {
        DiasLluvia dl = new DiasLluvia();
        assertFalse(dl.consultarDia(1, 1));
        dl.registroDia(1, 1,true);
        assertTrue(dl.consultarDia(1, 1));
        assertFalse(dl.consultarDia(2, 1));
        assertFalse(dl.consultarDia(1, 2));
    }

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos() {
        DiasLluvia dl = new DiasLluvia();
        assertEquals(dl.contarDiasLluviosos(), 0);
        dl.registroDia(1, 1,true);
        dl.registroDia(1, 2, false);
        assertEquals(dl.contarDiasLluviosos(), 1);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso() {
        DiasLluvia dl = new DiasLluvia();
        dl.registroDia(1, 1,true);
        dl.registroDia(15, 3, false);
        dl.registroDia(1, 4, false);
        dl.registroDia(30, 6, true);
        dl.registroDia(1, 7, false);
        dl.registroDia(30, 9, true);
        dl.registroDia(1, 10, true);
        dl.registroDia(31, 12, false);
        assertEquals(dl.trimestreLluvioso(), 1);
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia() {
        DiasLluvia dl = new DiasLluvia();
        dl.registroDia(1, 1,true);
        dl.registroDia(15, 3, true);
        dl.registroDia(1, 4, false);
        dl.registroDia(30, 6, true);
        dl.registroDia(1, 7, true);
        dl.registroDia(30, 9, false);
        dl.registroDia(1, 10, false);
        dl.registroDia(31, 12, true);
        assertEquals(dl.primerDiaLluvia(), 1);
        dl.registroDia(2, 1, true);
        assertEquals(dl.primerDiaLluvia(), 1);
    }
}
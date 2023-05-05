import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDivisible {

    @Test
    public void testDivisible1(){
        int resultado= 0;
        resultado = Main.Divisible3(2);
        assertEquals(resultado, 0);
    }
    @Test
    public void testDivisible2(){
        int resultado= 0;
        resultado = Main.Divisible3(6);
        assertEquals(resultado, 0);
    }
    @Test
    public void testDivisible3(){
        int resultado= 0;
        resultado = Main.Divisible3(4);
        assertEquals(resultado, -1);
    }
    @Test
    public void testDivisible4(){
        int resultado= 0;
        resultado = Main.Divisible3(8);
        assertEquals(resultado, 0);
    }
    @Test
    public void testDivisible5(){
        int resultado= 0;
        resultado = Main.Divisible3(10);
        assertEquals(resultado, -1);
    }
    @Test
    public void testDivisible6(){
        int resultado= 0;
        resultado = Main.Divisible3(16);
        assertEquals(resultado, -1);
    }
    @Test
    public void testDivisible7(){
        int resultado= 0;
        resultado = Main.Divisible3(18);
        assertEquals(resultado, 0);
    }


}
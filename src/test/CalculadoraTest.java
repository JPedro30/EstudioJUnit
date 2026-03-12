package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import modelo.Calculadora;

public class CalculadoraTest {

    @Test
    void testEstudioAssert1(){

        // SI SE REALIZA ASI LOS TEST, UN ASSERT DEBAJO DE OTRO, SI FALLA UNO LOS SIGUIENTES NO SE EJECUTAN
        System.out.println("COMIENZO TEST 1");
        Calculadora calculadora = new Calculadora();

        int suma = calculadora.suma(10, 15);
        int esperado = 25;
        assertEquals(esperado, suma, "Positivo y positivo");
        System.out.println("SUMA POSITIVO Y POSITIVO FUNCIONA");

        suma = calculadora.suma(10, -15);
        esperado = -5;
        assertEquals(esperado, suma, "Positivo y negativo");
        System.out.println("SUMA POSITIVO Y NEGATIVO FUNCIONA");

        suma = calculadora.suma(-10, -15);
        esperado = -25;
        assertEquals(esperado, suma, "Negativo y negativo");
        System.out.println("SUMA NEGATIVO Y NEGATIVO FUNCIONA");

    }

    @Test
    void testEstudioAssert2(){

        System.out.println("COMIENZO TEST 2");
        Calculadora calculadora = new Calculadora();

        int suma = calculadora.suma(10, 5);
        assertTrue(suma > 10);
        System.out.println("CONDICION TRUE FUNCIONA");

        assertFalse(suma < 10);
        System.out.println("CONDICION FALSE FUNCIONA");

        assertNotNull(calculadora, "La calculadora esta instanciada");
        System.out.println("CONDICION NO SER NULL FUNCIONA");

        calculadora = null;
        assertNull(calculadora, "La calculadora no esta instanciada");
        System.out.println("CONDICION DE SER NULL FUNCIONA");

    }

    @Test
    void testEstudioAssert3(){

        System.out.println("COMIENZO TEST 3");
        Calculadora calculadora = new Calculadora();

        double suma = calculadora.suma(3.51, 1);
        double esperado = 4.5;

        assertEquals(esperado, suma, 0.01, "SUMA DECIMALES");
        System.out.println("SUMA DECIMALES FUNCIONA");

    }

    @Test
    void testEstudioAssert4(){

        System.out.println("ASSERTALL SUMA TEST");
        Calculadora calc = new Calculadora();
        int suma = calc.suma(3,12);
        int esperado = 15;

        assertAll(
                // EXPRESION LAMBDA ANONIMA
                ()->assertEquals(esperado, suma, "Error en la suma"),
                
                ()->assertTrue(suma>10)

               );
    }

    @Test
    void testEstudioAssert5(){

        Calculadora calc = new Calculadora();
        
        assertThrows(ArithmeticException.class, ()->calc.div(10, 0), "Se esperaba que se lanzara la excepcion");

    }

}

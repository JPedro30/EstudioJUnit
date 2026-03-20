package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import modelo.Calculadora;

@SuppressWarnings("unused")
public class CalculadoraTest2 {

    static Calculadora calculadora;

    @BeforeEach
    void setUp(){
        System.out.println("@BeforeEach se ejecutara antes de cada test...");
        calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown(){
        System.out.println("@AfterEach se ejecutara despues de cada test...");
        calculadora = null;
    }

    @BeforeAll
    static void setUpBeforeClass(){
        System.out.println("@beforeAll se ejecutara antes de todos los test...");
        Calculadora calculadora = new Calculadora();
    }

    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("@AfterAll se ejecutara despues de todos los test...");
        calculadora = null;
    }

    @Test
    @DisplayName("Probamos el metodo suma de la calculadora")
    void testSuma(){

        System.out.println("TestSuma()");
        int suma = calculadora.suma(10, 15);
        int esperado = 25;
        assertEquals(esperado, suma);

    }

    @Test
    @DisplayName("Probamos el metodo resta de la calculadora")
    void testResta(){

        System.out.println("TestResta()");
        int resta = calculadora.resta(10, 5);
        int esperado = 5;
        assertEquals(esperado, resta);

    }

    @Disabled
    @Test
    @DisplayName("Probamos el metodo suma negativos de la calculadora")
    void testSuma2(){

        System.out.println("TestSuma2()");
        int suma = calculadora.suma(10, -5);
        int esperado = 5;
        assertEquals(esperado, suma);

    }

    @Test
    @EnabledOnOs(OS.WINDOWS) // solo se ejecuta si el sistema operativo es windows
    @DisplayName("Probamos el metodo resta de la calculadora")
    void testResta2(){

        System.out.println("TestResta2()");
        int resta = calculadora.resta(10, -5);
        int esperado = 15;
        assertEquals(esperado, resta);

    }

    @Test
    @EnabledOnOs(OS.LINUX) // solo se ejecuta si el sistema operativo es linux
    @DisplayName("Probamos el metodo resta de la calculadora")
    void testResta3(){

        System.out.println("TestResta3()");
        int resta = calculadora.resta(10, -5);
        int esperado = 15;
        assertEquals(esperado, resta);

    }


}

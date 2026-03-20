package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import modelo.Calculadora;
import modelo.Persona;

public class CalculadoraTest3 {

    @Test
    @DisplayName("Probamos el metodo suma de la clase calculadora")
    void testSuma(){
        Calculadora calculadora = new Calculadora();
        int[][] datos = {{3,2,5},{10,5,15},{10,-20,-10}};
        System.out.println("testDiv()");
        int x = 0;
        for (int[]prueba : datos) {
            int suma = calculadora.suma(prueba[0], prueba[1]);
            int esperado = prueba[2];
            assertEquals(esperado, suma, "Prueba "+x);
            x++;
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"31123456V", "31456789B", "31147258Z", "32123456T"})
    void testDni(String dni){
        assertTrue(Persona.compruebaDni(dni));
    }

    @ParameterizedTest
    @DisplayName("Probamos el metodo suma parametrizado CSV")
    @CsvSource({"3, 2, 5",
                "4, 5, 9",
                "-2, -3, -5"})
    void testSuma2(int n, int m, int esperado){
        Calculadora calculadora = new Calculadora();
        int suma = calculadora.suma(n, m);
        assertEquals(esperado, suma);
    }

    @ParameterizedTest
    @CsvSource({"1, Empleado 1, 30000",
                "2, Empleado 2, 40000",
                "3, Empleado 3, 50000"})
    void test1(Long id, String name, Integer salary){
        System.out.println("ID: "+id+", NAME: "+name+", SALARY: "+salary);
    }    


}

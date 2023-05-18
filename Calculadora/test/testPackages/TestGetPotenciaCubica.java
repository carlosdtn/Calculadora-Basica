/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testPackages;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Jorge
 */
public class TestGetPotenciaCubica {
    
    public TestGetPotenciaCubica() {
    }
    
    @Test
    public void test() {
        // Arrange
        Calculadora calculadora = new Calculadora();
        String cadenaNumeros = "2";
        double resultadoEsperado = 8.000;
        
        // Act
        double resultadoObtenido = calculadora.getPotenciaCubica(cadenaNumeros);
        
        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }
    
}

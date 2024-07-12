package com.persona2Autonoma.persona2;

import com.persona2Autonoma.persona2.Service.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private CalculadoraService calculadora;

    @BeforeEach
    public void setUp(){
        this.calculadora = new CalculadoraService();
    }

    @Test
    public void sumarNegativos(){
        //Arrange
        int a = -1;
        int b = -4;
        //Act
        int resultado = this.calculadora.sumar(a,b);
        //Assert
        assertEquals(-5,resultado);
    }
}

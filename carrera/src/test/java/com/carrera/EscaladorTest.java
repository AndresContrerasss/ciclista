package com.carrera;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EscaladorTest {

    @Test
    void contrarrelojistaDevuelveTipoCorrecto(){
        Escalador escalador = new Escalador(0, null, 0f, 0f);
        assertTrue(escalador.imprimirTipo().equals("Es un Escalador"));
    } 
}

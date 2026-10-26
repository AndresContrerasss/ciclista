package com.carrera;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContrarrelojistaTest {
    
    @Test
    void contrarrelojistaDevuelveTipoCorrecto(){
        Contrarrelojista contrarrelojista = new Contrarrelojista(0, null, 0);
        assertTrue(contrarrelojista.imprimirTipo().equals("Es un Contrarrelojista"));
    } 
}
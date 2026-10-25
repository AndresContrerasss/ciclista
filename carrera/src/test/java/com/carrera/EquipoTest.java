package com.carrera;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class EquipoTest {
    
    @Test
    void tiempoTotalSeGuardaCorrectamentePorEquipo(){
        Equipo equipo1 = new Equipo(null, null);
        equipo1.setTiempoTotalEquipo(15);
        Equipo equipo2 = new Equipo(null, null);
        assertNotEquals(equipo1.getTiempoTotalEquipo(), equipo2.getTiempoTotalEquipo());
    }
}

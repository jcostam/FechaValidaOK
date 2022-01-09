package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FechaTest {
    private final Fecha fechaCorrecta = new Fecha (20, 6, 2008);
    private final Fecha mesMal1 = new Fecha (21, 0, 3000);
    private final Fecha mesMal2 = new Fecha (21, 13, 3000);
    private final Fecha diaMal1 = new Fecha (0, 11, 2000);
    private final Fecha diaMal2 = new Fecha (32, 11, 2000);
    private final Fecha diaMalNoviembre = new Fecha (31, 11, 2000);
    private final Fecha diaBienDiciembre = new Fecha (31, 12, 2000);
    private final Fecha diaMalFebrero = new Fecha (30, 2, 2008);
    private final Fecha diaBienFebreroBisiesto1 = new Fecha (29, 2, 2008);
    private final Fecha diaBienFebreroBisiesto2 = new Fecha (29, 2, 2000);
    private final Fecha diaMalFebreroBisiesto1 = new Fecha (29, 2, 2007);
    private final Fecha diaMalFebreroBisiesto2 = new Fecha (29, 2, 1900);
    @Test
    public void testValida( ) {
        assertTrue(fechaCorrecta.valida());
        assertFalse(mesMal1.valida());
        assertFalse(mesMal2.valida());
        assertFalse(diaMal1.valida());
        assertFalse(diaMal2.valida());
        assertFalse(diaMalNoviembre.valida());
        assertTrue(diaBienDiciembre.valida());
        assertFalse(diaMalFebrero.valida());
        assertTrue(diaBienFebreroBisiesto1.valida());
        assertTrue(diaBienFebreroBisiesto2.valida());
        assertFalse(diaMalFebreroBisiesto1.valida());
        assertFalse(diaMalFebreroBisiesto2.valida());
    }
}
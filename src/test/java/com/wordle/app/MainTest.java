package com.wordle.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MainTest 
{
    @Test
    public void testNot5LetterWord()
    {
        assertEquals("Debes ingresar una palabra de 5 letras.", Main.checkString("hola", "avion"));
        assertEquals("Debes ingresar una palabra de 5 letras.", Main.checkString("holaaaa", "avion"));
        assertEquals("Debes ingresar una palabra de 5 letras.", Main.checkString("", "avion"));
    }

    @Test
    public void testCorrectLettersWrongPosition()
    {
        assertEquals("c(a)rr(o)", Main.checkString("carro", "avion"));
    }

    @Test
    public void testCorrectLettersCorrectPosition()
    {
        assertEquals("{a}rb{o}l", Main.checkString("arbol", "avion"));
    }

    @Test
    public void testCorrectWord()
    {
        assertEquals("{a}{v}{i}{o}{n}", Main.checkString("avion", "avion"));
    }

    @Test
    public void testWrongWord()
    {
        assertEquals("zurks", Main.checkString("zurks", "avion"));
    }
}

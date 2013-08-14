package de.uni_hamburg.informatik.sep.zuul;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BefehlswoerterTest
{
    @Test
    public void testeBefehlswoerter()
    {
        Befehlswoerter bw = new Befehlswoerter();
        assertTrue(bw.istBefehl("go"));
        assertTrue(bw.istBefehl("quit"));
        assertFalse(bw.istBefehl("stopp"));
    }
}

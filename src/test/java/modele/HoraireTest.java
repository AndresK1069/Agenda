package modele;

import static org.junit.jupiter.api.Assertions.*;

class HoraireTest{

    @org.junit.jupiter.api.Test
    void testCompareTo() {
        Horaire h1 = new Horaire(15,45);
        Horaire h2 = new Horaire(15,50);
        assertEquals(h1.compareTo(h2), 0);

    }
}
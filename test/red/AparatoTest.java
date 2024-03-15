package red;

import dominio.Aparato;
import dominio.Red;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AparatoTest {

    @Test
    void testEncender(){
        Aparato aparato = new Aparato(100);
        aparato.encender();
        assertTrue(aparato.getEncendido());
    }

    @Test
    void testApagar(){
        Aparato aparato = new Aparato(100);
        aparato.apagar();
        assertFalse(aparato.getEncendido());
    }

    @Test
    void testAddAparato(){
        Red red = new Red(1000);
        Aparato aparato = new Aparato(100);
        red.addAparato(aparato);
        assertEquals(1,red.size());
    }

    @Test
    void testGetConsumoActual(){
        Red red = new Red(1000);
        Aparato aparato = new Aparato(100);
        red.addAparato(aparato);
        aparato.encender();
        assertEquals(100, red.getConsumoActual());
    }
}

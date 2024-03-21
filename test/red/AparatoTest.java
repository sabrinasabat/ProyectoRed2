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
        Aparato nevera = new Aparato(100);
        Aparato lampara = new Aparato(10);
        Aparato lavavajillas = new Aparato (500);
        Aparato horno = new Aparato(1500);
        red.addAparato(nevera);
        red.addAparato(lampara);
        red.addAparato(lavavajillas);
        red.addAparato(horno);
        assertEquals(4,red.size());
    }

    @Test
    void testGetConsumoActual(){
        Red red = new Red(1000);
        Aparato lavavajillas = new Aparato(100);
        Aparato lavadora = new Aparato(220);
        red.addAparato(lavavajillas);
        red.addAparato(lavadora);
        lavadora.encender();
        lavavajillas.encender();
        assertEquals(320, red.getConsumoActual());
    }
}

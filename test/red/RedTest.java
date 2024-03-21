package red;
import dominio.Aparato;
import dominio.Red;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedTest {

    @Test
    void testGetConsumoActual(){
        Red red = new Red (1000);
        Aparato lavavajillas = new Aparato(100);
        Aparato lavadora = new Aparato(220);
        red.addAparato(lavavajillas);
        red.addAparato(lavadora);
        lavavajillas.encender();
        lavadora.encender();
        assertEquals(320, red.getConsumoActual());
    }

}

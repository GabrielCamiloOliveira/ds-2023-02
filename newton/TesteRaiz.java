import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TesteRaiz {

    @Test
    public void testeNumNegativo() {
        assertThrows(IllegalArgumentException.class, () -> ExtrairRaiz.sqrt(-1.0));
    }

    @Test
    public void testeNumZero() {
        assertEquals(0.0, ExtrairRaiz.sqrt(0.0), 0.001); // Raiz quadrada de 0 deve ser 0
    }

    @Test
    public void testeRaizes() {
        assertEquals(9.0, ExtrairRaiz.sqrt(81), 0.001); 
        assertEquals(3.0, ExtrairRaiz.sqrt(9.0), 0.001); 
        assertEquals(7.0, ExtrairRaiz.sqrt(49), 0.001); 
        assertEquals(5.0, ExtrairRaiz.sqrt(25.0), 0.001);
        assertEquals(8.0, ExtrairRaiz.sqrt(64.0), 0.001);
        assertEquals(22.0, ExtrairRaiz.sqrt(484.0), 0.001);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoekTest {

    @Test
    public void createBoek() {
        Boek boek = new Boek("titel", "auteur");
        boek.setAantalBladzijden(18);
        assertEquals("titel", boek.getTitel());

    }


}
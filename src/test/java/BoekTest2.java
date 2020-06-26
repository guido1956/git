import org.junit.Test;
import static org.junit.Assert.*;


public class BoekTest2 {
    @Test
    public void createBoek() {
        Boek boek = new Boek("titel", "auteur");
        boek.setAantalBladzijden(18);
        assertEquals("titel", boek.getTitel());

    }

}
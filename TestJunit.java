import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TestJunit {

    @Test
    public void testMensagem() {
        App ola = new App();
        assertEquals("Hello, World!", ola.mensage());
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello, Alice!", Hello.sayHello("Alice"));
    }
}

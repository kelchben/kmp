import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class colorizeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @Before
//    public void setUp() throws Exception {
//        colorize farbtest = new colorize();
//    }
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @Test
    public void ansiColorEscapeString() throws Exception {
        colorize tester = new colorize();
        assertEquals("\u001B[30;47m" + 'u' + "\u001B[0m", tester.ansiColorEscapeString('u'));
        }




    @Test
    public void ansiColorEscapeFoundKmp() throws Exception {
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
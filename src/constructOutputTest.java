import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class constructOutputTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();



    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    public void setUp() throws Exception {

    }
    @Test
    public void out(){

    }
    @Test
    public void stats_lines() throws Exception {
        constructOutput stats = new constructOutput();
        stats.stats_lines("loremipsum.txt");
        assertEquals("11", outContent.toString());
    }

    @Test
    public void rd_lines() throws Exception{

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}

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
        constructOutput rdline = new constructOutput();
        rdline.rd_lines("loremipsum.txt", "zwei");
        assertEquals("1:22: hallo test test eins [30;47mz[0m[30;47mw[0m[30;47me[0m[30;47mi[0m", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}

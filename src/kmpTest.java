import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class kmpTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void kmpSearch() throws Exception {
        kmp suchi = new kmp();
        preprocess preprop = new preprocess();
        String testtext = "klajfdowaaeh";
        String testmuster = "d";
        int[] propdiewettegilt = preprop.preprocessWord(testmuster);
        suchi.kmpSearch(testtext, testmuster, propdiewettegilt);
        assertEquals("i=6 und j=1", outContent.toString());


    }

    @Test
    public void kmpSearchList() throws Exception {
        kmp suchi = new kmp();
        preprocess preprop = new preprocess();
        String testtext = "klajfdowaaeh";
        String testmuster = "d";
        int[] propdiewettegilt = preprop.preprocessWord(testmuster);
            List<Integer> actual = suchi.kmpSearchList(testtext, testmuster, propdiewettegilt);
            List<Integer> erwartet = new ArrayList<Integer>();
            erwartet.add(5)                   ;
        assertThat(actual, is(erwartet));
        }






}
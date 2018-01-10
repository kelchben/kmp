import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.awt.SystemColor.text;

/**
 * Created by kcots on 10.01.2018.
 */
public class ausleser2 {
    public static void stats(String filename) throws IOException{
        long count = Files.lines(Paths.get(filename)).count();
        System.out.println(count);
    }
}

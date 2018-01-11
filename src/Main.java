import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        constructOutput constructOutput = new constructOutput();
        try {
             constructOutput.rd_lines(args[1],args[0]);}
        catch (Exception e) {
            System.out.println("Error :(");
            System.exit(0);
        }
    }
}

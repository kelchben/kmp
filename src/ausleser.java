import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ausleser {
    public static String readbyline(String[] args) throws IOException {

        try {
            String printiprint = null;
            String textExit="";

            String contents = Files.lines(Paths.get("text.txt")).collect(Collectors.joining("\r\n"));

            FileWriter fWriter = null;
            BufferedWriter writer = null;

            fWriter = new FileWriter("text.txt");
            writer = new BufferedWriter(fWriter);

       //     System.out.print("Enter Text: ");
       //     Scanner scan = new Scanner(System.in);
      //      String text = scan.nextLine();
      //      textExit= "";
     //      textExit=text;


            writer.write(contents+"\r\n");//  \r Thats for new Line
            writer.close();
            return contents;
            //     System.out.println(textExit);
        }
        catch (Exception e) {
            System.out.println("Errors!");
            System.exit(0);
        }

        return null;

    }

}

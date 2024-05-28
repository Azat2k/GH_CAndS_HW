package P1;
import java.io.*;

public class P1 {
    public static void main(String[] args) throws Exception
    {

        // File path is passed as parameter
        File file = new File(
                "C:\\Users\\dzhan\\OneDrive\\Рабочий стол\\Черновик.txt");


        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
}

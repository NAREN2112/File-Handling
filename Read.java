package filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 

public class Read {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Myfile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
	


package filehandling;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 

public class Write {
 
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("Myfile.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
             
            bufferedWriter.write("Anish");
            bufferedWriter.newLine();
            bufferedWriter.write("How are u?");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}
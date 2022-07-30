package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
public class Append {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Myfile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("See you again");
            bufferedWriter.newLine();
            bufferedWriter.write("Bye");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}
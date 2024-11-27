package designpatterns.adapter;

import java.io.*;
import java.nio.file.Files;

public class NamesFile {

    public static void main(String[] args) {
        // Decorator:
        // new BufferedReader(new FileReader(new File("names.txt")))
        // JAR fájl esetén?
        //Files.newBufferedReader(Path)
        try (InputStream is = NamesFile.class.getResourceAsStream("/names.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        ) {
            String line;
            while ((line = reader.readLine()) != null ) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException("Can not read file", e);
        }
    }
}

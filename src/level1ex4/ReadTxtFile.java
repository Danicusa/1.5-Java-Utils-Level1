package level1ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFile {
	public static void readTxtFile(File file) {
        if (!file.exists() || !file.isFile()) {
            System.out.println("Invalid file: " + file.getPath());
            return;
        }

        if (!file.getName().endsWith(".txt")) {
            System.out.println("The file is not a TXT file: " + file.getName());
            return;
        }

        System.out.println("Reading file: " + file.getName());
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


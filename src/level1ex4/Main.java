package level1ex4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java Main <directory-path> <output-file>");
            return;
        }

        String directoryPath = args[0];
        String outputFilePath = args[1];

        File directory = new File(directoryPath);
        File outputFile = new File(outputFilePath);

        try (FileWriter writer = new FileWriter(outputFile)) {
            listDirectoryRecursivelyTxtR.listDirectoryRecursivelyTxt(directory, writer);
            System.out.println("Directory contents and TXT file content have been processed.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

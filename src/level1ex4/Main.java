package level1ex4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File directory = new File("Test/"); 
        File outputFile = new File("directory_listing.txt");

        try (FileWriter writer = new FileWriter(outputFile)) {
        	listDirectoryRecursivelyTxtR.listDirectoryRecursivelyTxt(directory, writer);
            System.out.println("Directory listing written to " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}

	




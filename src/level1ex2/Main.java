package level1ex2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
            System.out.println("Please provide a directory path as an argument.");
            return;
        }
		
        String directoryPath = args[0];
        File directory = new File(directoryPath);


        DirectoryLister2.listDirectoryRecursively(directory);
    }
}


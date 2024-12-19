package level1ex2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File directory = new File("Test/");
		
        DirectoryLister2.listDirectoryRecursively(directory);
	}
}

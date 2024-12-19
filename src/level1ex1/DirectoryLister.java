package level1ex1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
	
	public static void listDirectoryAlphabetically(String relativePath) {
		
		File directory = new File(relativePath);
		
		if(!directory.exists() || !directory.isDirectory()) {
			System.out.println("This directory is not correct or is not a directory: " + relativePath);
		}
		
		String[] content = directory.list();
		
		if (content != null) {
			Arrays.sort(content);
		
			for (String item :content) {
			System.out.println(item);
			} 
			
		 } else {
			 System.out.println("The contents of the directory could not be accessed.");
		 }
	}
}



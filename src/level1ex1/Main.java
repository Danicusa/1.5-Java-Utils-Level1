package level1ex1;

public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please provide a directory path as an argument.");
			return; 
		}

		String directoryPath = args[0];
		DirectoryLister.listDirectoryAlphabetically(directoryPath);
	}
}


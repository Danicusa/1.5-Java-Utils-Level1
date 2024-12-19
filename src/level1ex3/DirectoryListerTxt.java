package level1ex3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryListerTxt {
	
	public static void listDirectoryRecursivelyTxt(File directory, FileWriter writer) throws IOException {
        if (!directory.exists() || !directory.isDirectory()) {
            writer.write("Invalid directory: " + directory.getPath() + "\n");
            return;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            for (File file : files) {
                String lastModified = sdf.format(new Date(file.lastModified())); 

                if (file.isDirectory()) {
                    writer.write("[D] " + file.getName() + " (Last Modified: " + lastModified + ")\n");
                    listDirectoryRecursivelyTxt(file, writer); 
                } else {
                    writer.write("[F] " + file.getName() + " (Last Modified: " + lastModified + ")\n");
                }
            }
        }
    }
}


package level1ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister2 {
    
    public static void listDirectoryRecursively(File directory) {

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory: " + directory.getPath());
            return;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            for (File file : files) {
                String lastModified = sdf.format(new Date(file.lastModified())); 

                if (file.isDirectory()) {
                    System.out.println("[D] " + file.getName() + " (Last Modified: " + lastModified + ")");
                    listDirectoryRecursively(file); 
                } else {
                    System.out.println("[F] " + file.getName() + " (Last Modified: " + lastModified + ")");
                }
            }
        }
    }
}

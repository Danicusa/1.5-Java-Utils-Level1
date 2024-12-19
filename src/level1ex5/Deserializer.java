package level1ex5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

	    public static Person deserializeObject(String filePath) {
	        try (FileInputStream fileIn = new FileInputStream(filePath);
	             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

	            return (Person) objectIn.readObject();

	        } catch (IOException | ClassNotFoundException e) {
	            System.err.println("Error during deserialization: " + e.getMessage());
	            return null;
	        }
	    }
}	

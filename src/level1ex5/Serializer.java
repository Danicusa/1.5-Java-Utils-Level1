package level1ex5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
	public static void serializeObject(Person person, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(person);
            System.out.println("Object serialized to " + filePath);

        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }
}

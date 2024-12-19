package level1ex5;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Jose Pérez", 30);
		        
		String filePath = "person.ser";
		Serializer.serializeObject(person, filePath);
		        
		Person deserializedPerson = Deserializer.deserializeObject(filePath);
		System.out.println("Deserialized object: " + deserializedPerson);
		    

	}

}

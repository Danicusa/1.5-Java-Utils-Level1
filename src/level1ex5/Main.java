package level1ex5;

public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage:");
            System.out.println("  To serialize: java Main serialize <name> <age> <file-path>");
            System.out.println("  To deserialize: java Main deserialize <file-path>");
            return;
        }

        String operation = args[0];

        if ("serialize".equalsIgnoreCase(operation)) {

            if (args.length < 4) {
                System.out.println("Usage for serialization: java Main serialize <name> <age> <file-path>");
                return;
            }

            String name = args[1];
            int age;
            try {
                age = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                System.err.println("Age must be a valid integer.");
                return;
            }
            String filePath = args[3];

            Person person = new Person(name, age);
            Serializer.serializeObject(person, filePath);

        } else if ("deserialize".equalsIgnoreCase(operation)) {
            if (args.length < 2) {
                System.out.println("Usage for deserialization: java Main deserialize <file-path>");
                return;
            }

            String filePath = args[1];
            Person person = Deserializer.deserializeObject(filePath);

            if (person != null) {
                System.out.println("Deserialized Person: " + person);
            }

        } else {
            System.out.println("Invalid operation. Use 'serialize' or 'deserialize'.");
        }
    }
}

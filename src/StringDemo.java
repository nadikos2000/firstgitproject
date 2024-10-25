

public class StringDemo {
        public static void main(String[] args) {
            // Create strings
            String first = "Hello";
            String second = "World";

            // Concatenate strings
            String greeting = first + " " + second;
            System.out.println("Greeting: " + greeting);

            // Get length of the string
            int length = greeting.length();
            System.out.println("Length: " + length);

            // Convert to uppercase
            String upperCaseGreeting = greeting.toUpperCase();
            System.out.println("Uppercase Greeting: " + upperCaseGreeting);

            // Check if the string contains a substring
            boolean containsWorld = greeting.contains("World");
            System.out.println("Contains 'World': " + containsWorld);
        }
    }


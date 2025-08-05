public class Main {
    public static void main(String[] args) {
        // String creation
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Java Programming");

        // Concatenation
        String concat = str1 + " " + str2;

        // Length
        int length = str3.length();

        // Character at a position
        char ch = str1.charAt(1); // 'e'

        // Substring
        String sub = str3.substring(5, 16); // "Programming"

        // Comparison
        boolean isEqual = str1.equals("hello");          // false
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello"); // true

        // Case conversion
        String upper = str1.toUpperCase(); // "HELLO"
        String lower = str2.toLowerCase(); // "world"

        // Replace
        String replaced = str3.replace("Java", "C++"); // "C++ Programming"

        // Trim
        String withSpaces = "   Java   ";
        String trimmed = withSpaces.trim(); // "Java"

        // Split
        String names = "Alice,Bob,Charlie";
        String[] nameArr = names.split(",");

        // Index of char/substring
        int index = str3.indexOf('a'); // 1

        // Last index of char
        int lastIndex = str3.lastIndexOf('a'); // 3

        // String startsWith and endsWith
        boolean starts = str3.startsWith("Java"); // true
        boolean ends = str2.endsWith("ld"); // true

        // Print all operations
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("Concatenation: " + concat);
        System.out.println("Length of str3: " + length);
        System.out.println("Character at index 1 in str1: " + ch);
        System.out.println("Substring of str3 (5,16): " + sub);
        System.out.println("str1 equals 'hello'? " + isEqual);
        System.out.println("str1 equalsIgnoreCase 'hello'? " + isEqualIgnoreCase);
        System.out.println("str1 toUpperCase: " + upper);
        System.out.println("str2 toLowerCase: " + lower);
        System.out.println("str3 after replace: " + replaced);
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.print("Splitted names: ");
        for(String name : nameArr) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("Index of 'a' in str3: " + index);
        System.out.println("Last index of 'a' in str3: " + lastIndex);
        System.out.println("str3 starts with 'Java': " + starts);
        System.out.println("str2 ends with 'ld': " + ends);
    }
}

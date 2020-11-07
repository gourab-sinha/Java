package ModuleTwo.StringManipulation;

public class StringLang {
    // Immutable. Once created, we cannot change during its life cycle.
    // As literal - created in string constant pull.
    public static void stringWithLiteral(){
        System.out.println("String with literal");
        String firstString = "Java";
        String secondString = "Java";
        System.out.println(firstString==secondString);
    }
    // Using new operator - created in heap memory
    public static void stringWithNew(){
        System.out.println("String with new keyword");
        String firstString = new String("Java");
        String secondString = new String("Java");
        System.out.println(firstString==secondString);
        System.out.println(firstString.equals(secondString)); // Content checked
        System.out.println(firstString.contentEquals(secondString)); // Content checked
    }

    public static void concatInString(){
        System.out.println("String concat");
        String str = "Gourab";
        str.concat(" Sinha");
        System.out.println(str); // Will give only Gourab as str reference to its reference only not to the newly
                                 // created string
        str = str.concat(" Sinha"); // Create in the heap.
        System.out.println(str);
    }

    public static void stringMethods(){
        System.out.println("Char @ index");
        String str = "Java";
        int len = str.length(); // Length of the string
        System.out.println(str.charAt(0)); // J
        System.out.println(str.indexOf('a')); // first occurrence of a
        System.out.println(str.lastIndexOf('a')); // last occurrence of a
        System.out.println(str.lastIndexOf("va")); // first of va
        System.out.println(str.replace('a', 'A')); // replaces a to A

        String strWithSpace = "  Java  ";
        System.out.println(strWithSpace.trim()); // Removes leading and ending spaces.
        System.out.println(strWithSpace.strip()); // Removes leading and ending spaces.

        // Cases
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
    /*    Heap
    * ------------------------
    * | String constant pool |
    * ------------------------
    * |                      |
    * |                      |
    * ------------------------
    *
    * */
}

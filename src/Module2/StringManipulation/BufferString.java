package Module2.StringManipulation;

public class BufferString {
    /*
    * StringBuffer is updatable.
    * Thread safe synchronised.
    * */

    public static void  stringBufferObject(){
        System.out.println("String Buffer Object");
        StringBuffer str = new StringBuffer();
        System.out.println("Length: " + str.length() + " | Capacity: " + str.capacity());
        str.append("Gourab");
        System.out.println(str);
        str.insert(6, " Sinha");
        System.out.println(str);

    }
}

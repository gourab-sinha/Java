package ModuleTwo.StringManipulation;

public class BufferString {
    /*
    * StringBuffer is updatable.
    * Thread safe synchronised.
    * */

    public static void  stringBufferObject(){
        StringBuffer str = new StringBuffer();
        System.out.println("Length: " + str.length() + " | Capacity: " + str.capacity());
        str.append("Gourab");
        System.out.println(str);
        str.insert(6, " Sinha");
        System.out.println(str);

    }
}

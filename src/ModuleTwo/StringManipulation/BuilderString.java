package ModuleTwo.StringManipulation;

public class BuilderString {
    /*
    * Not a thread safe like StringBuffer. Reset is same.
    * */
    public static void stringBuilderObject(){
        System.out.println("String Builder object");
        StringBuilder str = new StringBuilder();
        System.out.println("Length: " + str.length() + " | Capacity:" + str.capacity());
        str.append("Gourab");
        System.out.println(str);

        str.insert(6, " Sinha");
        System.out.println(str);

    }
}

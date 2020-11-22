package Module5.Collections;

import java.util.ArrayList;

public class ArrayListOperations {
    // ArrayList isn't synchronized
    public void iterationFirst(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Gourab");
        names.add("Ravan");
        names.add("Urmi");

        System.out.println("0th Index: " + names.get(0));
        System.out.println("1st Index: " + names.get(2));
        System.out.println("Size: " + names.size());
        System.out.println("Replace element at 0th");
        names.set(0,"Garv");
        System.out.println("0th Index: " + names.get(0));
        System.out.println("1st Index: " + names.get(2));
        System.out.println("Size: " + names.size());

        System.out.println("Adding element at 1st");
        names.add(1,"Gourab");
        System.out.println("0th Index: " + names.get(0));
        System.out.println("1st Index: " + names.get(2));
        System.out.println("Size: " + names.size());

    }
}

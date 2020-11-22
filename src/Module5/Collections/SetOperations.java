package Module5.Collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOperations {
    /*
    Set are of two types - HashSet, LinkedHashSet and TreeSet
    HashSet can contains null but TreeSet cannot.
     */

    public void hashSet(){
        HashSet<String> names = new HashSet<>();
        System.out.println("Hashset Operation");
        System.out.println("Size: " + names.size());
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Sinha " + names.add("Sinha"));
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Gourab " + names.add("Rahul"));
        System.out.println("Add name: Gourab " + names.add("Kushal"));
        System.out.println(names);
    }

    public void linkedHashSet(){
        /*
        LinkedHashSet maintains the order of insertion of the elements
         */
        System.out.println("LinkedHashSet operations");
        LinkedHashSet<String> names = new LinkedHashSet<String>();
        System.out.println("Size: " + names.size());
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Sinha " + names.add("Sinha"));
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Gourab " + names.add("Rahul"));
        System.out.println("Add name: Gourab " + names.add("Kushal"));
        System.out.println(names);
    }

    public void treeSetAscending(){
        /*
        TreeSet maintains the sorted order in ascending order
         */
        System.out.println("TreeSet operations");
        TreeSet<String> names = new TreeSet<String>();
        System.out.println("Size: " + names.size());
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Sinha " + names.add("Sinha"));
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Gourab " + names.add("Rahul"));
        System.out.println("Add name: Gourab " + names.add("Kushal"));
        System.out.println(names);
    }

    public void treeSetDescending(){
        /*
        TreeSet maintains the sorted order in ascending order
         */
        System.out.println("TreeSet Descending operations");
        TreeSet<String> names = new TreeSet<String>(new DescendingOrder());
        System.out.println("Size: " + names.size());
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Sinha " + names.add("Sinha"));
        System.out.println("Add name: Gourab " + names.add("Gourab"));
        System.out.println("Add name: Gourab " + names.add("Rahul"));
        System.out.println("Add name: Gourab " + names.add("Kushal"));
        System.out.println(names);
    }
}

class DescendingOrder implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

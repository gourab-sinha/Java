package Module5.Collections;

import java.util.Vector;

public class VectorOperations {
    /*
    Thread synchronised wherein ArrayList isn't. Legacy interface.
     */

    public void vectorIterationFirst(){
        System.out.println("Vector items using for loop");
        Vector<Integer> vec = new Vector<Integer>();
        System.out.println("Initial capacity:" + vec.capacity());
        for(int i=0;i<10;i++){
            vec.add(i);
        }
        System.out.println("Curr capacity: " + vec.capacity());
        System.out.println("Add one more element");
        vec.add(11);
        System.out.println("Curr capacity: " + vec.capacity());
    }
}

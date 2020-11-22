package Module5.Collections;

import java.util.*;

public class ListOperations {
    public void listIterationFirst(){
        System.out.println("List items using normal for loop");
        List<Integer> list = Arrays.asList(65,6,7,8,10,99);
        System.out.println(list);

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public void listIterationSecond(){
        System.out.println("List items using normal enhanced for loop");
        List<Integer> list = Arrays.asList(65,6,7,8,10,99);
        System.out.println(list);

        for(Integer value: list){
            System.out.println(value);
        }
    }

    public void listIterationThird(){
        System.out.println("List items using iterator of java.util.Iterator");
        List<Integer> list = Arrays.asList(65,6,7,8,10,99);
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer value = it.next();
            System.out.println(value);
        }
    }

    public void listIterationFourth(){
        /*
        Difference between iterator and listIterator is only - listIterator can go
        in backward direction wherein iterator cannot do that.
         */
        System.out.println("List items using iterator of java.util.listIterator");
        List<Integer> list = Arrays.asList(65,6,7,8,10,99);
        ListIterator<Integer> it = list.listIterator();
        System.out.println("Forward direction");
        while(it.hasNext()){
            Integer value = it.next();
            System.out.println(value);
        }
        System.out.println("Backward direction");
        while(it.hasPrevious()){
            Integer value = it.previous();
            System.out.println(value);
        }
    }

    public void listIterationFifth(){
        /*
        Only difference between iterator and enumeration is iterator has remove method which enumeration doesn't have.
         */

        System.out.println("List items using Enumeration of java.util.Enumeration (a legacy interface)");
        List<Integer> list = Arrays.asList(65,6,7,8,10,99);
        Enumeration en = Collections.enumeration(list);
        System.out.println("Forward direction");
        while(en.hasMoreElements()){
            Integer value = (Integer) en.nextElement();
            System.out.println(value);
        }
    }

}

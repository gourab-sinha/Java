package Solutions.Module5.Collections;

import java.util.ArrayList;

public class ArrayListNumbers {
    private ArrayList<Integer> storeNumbers = null;
    public ArrayListNumbers(){
        storeNumbers = new ArrayList<Integer>();
    }

    public void insert(){
        System.out.println("Insert first 10 elements");
        for(int i=1;i<=10;++i){
            storeNumbers.add(i);
            System.out.println(i);
        }
        System.out.println();
    }

    public void display(){
        System.out.println("Display first 10 elements");
        for(int value: storeNumbers){
            System.out.println(value);
        }
    }
}

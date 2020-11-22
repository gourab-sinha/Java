package Module5.Collections;

import java.util.*;

public class MapOperations {
    /*
    Key, Value pair
     */
    public void hashMap(){
        /*
            hashMap - can have null as key and value both.
        */
        System.out.println("HashMap operations");
        System.out.println("Insert");
        HashMap<String,Float> bank = new HashMap<String, Float>();
        System.out.println(bank.put("SBI", 250000f)); // null if not present
        System.out.println(bank.put("SBI", 240000f)); // returns old value
        System.out.println(bank.put("IOB", 240000f)); // returns old value
        System.out.println(bank.put("BOI", 240000f)); // returns old value
        System.out.println(bank);

        System.out.println("SBI : " + bank.get("SBI"));
        // System.out.println("ICICI : " + bank.get("ICICI")); // gives null pointer exception if not present

        System.out.println("All banks - keys");
        for(String value: bank.keySet()){
            System.out.println(value);
        }

        System.out.println("Keys and values");
        Set<Map.Entry<String,Float>> entries= bank.entrySet();
        Iterator<Map.Entry<String,Float>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String,Float> entry =it.next();
            String bankName = entry.getKey();
            Float balance = entry.getValue();
            System.out.println(bankName + " " + balance);
        }
    }

    public void treeMap(){
        /*
            treeMap stores in a ascending manner.
            treeMap cannot have null as key but value as null can have.
        */
        System.out.println("TreeMap operations");
        System.out.println("Insert");
        TreeMap<String,Float> bank = new TreeMap<>();
        System.out.println(bank.put("SBI", 250000f)); // null if not present
        System.out.println(bank.put("SBI", 240000f)); // returns old value
        System.out.println(bank.put("IOB", 240000f)); // returns old value
        System.out.println(bank.put("BOI", 240000f)); // returns old value
        System.out.println(bank);

        System.out.println("SBI : " + bank.get("SBI"));
        // System.out.println("ICICI : " + bank.get("ICICI")); // gives null pointer exception if not present

        System.out.println("All banks - keys");
        for(String value: bank.keySet()){
            System.out.println(value);
        }

        System.out.println("Keys and values");
        Set<Map.Entry<String,Float>> entries= bank.entrySet();
        Iterator<Map.Entry<String,Float>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String,Float> entry =it.next();
            String bankName = entry.getKey();
            Float balance = entry.getValue();
            System.out.println(bankName + " " + balance);
        }
    }
}

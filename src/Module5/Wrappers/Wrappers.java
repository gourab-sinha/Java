package Module5.Wrappers;

public class Wrappers {
    public void integerWrapper(){
        Integer i1 = new Integer(5);
        System.out.println(i1);
        Integer i2 = Integer.valueOf(5);
        System.out.println(i2);
        int i11 = i1.intValue();
        System.out.println(i11);

        Integer i3 = new Integer("25");
        System.out.println(i3);
        Integer i4 = Integer.valueOf("25");
        System.out.println(i4);
    }

    public void charWrapper(){
        // Character wrapper has only one constructor which takes char as argument
        Character c1 = new Character('A');
        System.out.println(c1);
        Character c2 = Character.valueOf('A');
        System.out.println(c2);

        char c11 = c1.charValue();
        System.out.println(c11);
    }
}

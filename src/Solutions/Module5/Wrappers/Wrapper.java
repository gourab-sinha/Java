package Solutions.Module5.Wrappers;

public class Wrapper {
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

    public void longWrapper(){
        Long l1 = new Long(5);
        System.out.println(l1);
        Long l2 = Long.valueOf(5);
        System.out.println(l2);
        long l11 = l1.intValue();
        System.out.println(l11);

        Long l3 = new Long("25");
        System.out.println(l3);
        Long l4 = Long.valueOf("25");
        System.out.println(l4);
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

    public void byteWrapper(){
        Byte b1 = new Byte((byte) 1);
        System.out.println(b1);
        Byte b2 = Byte.valueOf((byte) 1);
        System.out.println(b2);

        Byte b3 = new Byte("25");
        System.out.println(b3);
        Byte b4 = Byte.valueOf("25");
        System.out.println(b4);
    }

    public void shortWrapper(){
        short value = 1;
        Short s1 = new Short(value);
        System.out.println(s1);
        Short s2 = Short.valueOf(value);
        System.out.println(s2);
        short s11 = s1.shortValue();
        System.out.println(s11);

        Short s3 = new Short("25");
        System.out.println(s3);
        Short s4 = Short.valueOf("25");
        System.out.println(s4);
    }
}

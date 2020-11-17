package Module5.BoxingUnboxing;

public class BoxingUnboxing {
    public void boxingUnboxing(){
        int value = 100;
        Integer valueBoxed = value; // boxing
        System.out.println(value);
        System.out.println(valueBoxed);

        int valueUnboxed = valueBoxed; // unboxing
        System.out.println(valueUnboxed);
    }
}

package ModuleOne.Assignment;

public class ArithmeticOperation {
    public static void arithmeticOperation(){
        // Arithmetic Operations and DataTypes
        int num1 = 100;
        int num2 = 50;

        int num3 = 123456;
        int num4 = 12345;

        float num5 = 300;
        // Plus
        System.out.println(num1 + num1);

        // Minus
        System.out.println(num1 - num2);

        // Multiply and Long DataType
        long result = (long)(num3 * num4);

        // Divide and double DataType
        double result2 = num5 / num2;
        System.out.println(result2);

        // String DataType
        String message = "Hello World";
        System.out.println(message);

        // Post Increment
        System.out.println(num1++);
        System.out.println(num1);

        // Post Decrement
        System.out.println(num1--);
        System.out.println(num1);

        // Pre Increment
        System.out.println(num1);
        System.out.println(++num1);

        // Pre decrement
        System.out.println(num1);
        System.out.println(--num1);
    }
}

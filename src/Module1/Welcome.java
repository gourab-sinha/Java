package Module1;

import Module1.PrimitiveDataType.BooleanDataType;
import Module1.PrimitiveDataType.CharacterDataType;
import Module1.PrimitiveDataType.NumericDataType;

public class Welcome {
    public static void main(String[] args){
        System.out.println("Hello World");

        // Byte DataType
        System.out.println(NumericDataType.byteDataType());

        // Short DataType
        System.out.println(NumericDataType.shortDataType());

        // Int DataType
        System.out.println(NumericDataType.integerDataType());

        // Long DataType
        System.out.println(NumericDataType.longDataType());

        // String DataType
        CharacterDataType.stringDataType();

        // Boolean DataType
        System.out.println("Human is mortal " + BooleanDataType.booleanDataType("Human"));
        System.out.println("Laptop is mortal " + BooleanDataType.booleanDataType("Laptop"));



    }
}

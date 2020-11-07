package ModuleTwo;

import ModuleTwo.Array.Array;
import ModuleTwo.StringManipulation.BufferString;
import ModuleTwo.StringManipulation.BuilderString;
import ModuleTwo.StringManipulation.StringLang;

public class Main {
    public static void main(String[] args) {
        Array.singleDArray();
        Array.twoDArray();
        Array.singleDArrayInitialized();
        Array.twoDArrayInitialized();

        StringLang.stringWithLiteral();
        StringLang.stringWithNew();
        StringLang.concatInString();
        StringLang.stringMethods();

        BufferString.stringBufferObject();

        BuilderString.stringBuilderObject();
    }
}

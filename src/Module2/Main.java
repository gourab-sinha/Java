package Module2;

import Module2.Array.Array;
import Module2.StringManipulation.BufferString;
import Module2.StringManipulation.BuilderString;
import Module2.StringManipulation.StringLang;

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

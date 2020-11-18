package Module5;

import Module5.BoxingUnboxing.BoxingUnboxing;
import Module5.ReadFiles.ReadFile;
import Module5.ReadFiles.WriteFile;
import Module5.Wrappers.Wrappers;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("Integer Wrapper");
        System.out.println("---------------------------------------------------");
        Wrappers wrappers = new Wrappers();
        wrappers.integerWrapper();

        System.out.println("---------------------------------------------------");
        System.out.println("Character Wrapper");
        System.out.println("---------------------------------------------------");
        wrappers.charWrapper();

        System.out.println("---------------------------------------------------");
        System.out.println("Boxing Unboxing");
        System.out.println("---------------------------------------------------");
        BoxingUnboxing boxingUnboxing = new BoxingUnboxing();
        boxingUnboxing.boxingUnboxing();

        System.out.println("---------------------------------------------------");
        System.out.println("File Read");
        System.out.println("---------------------------------------------------");
        ReadFile readFile = new ReadFile("/Users/gourabsinha/Desktop/Java/src/Module5/ReadFiles/Random.txt");
        try{
            System.out.println(readFile.noOfCharacters());
            System.out.println(readFile.asciiValueOfCharacter()); // return ascii value of current char. and updates the pointer to next char
            readFile.printCharacters(); // without converting it to string
            readFile.readFileCompletely(); // after converting to string
            // ByteStream to CharStream
            readFile.convertByteStreamToCharStream();

        }
        catch (Exception e){
            System.out.println("Fix the issue");
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");
        System.out.println("File Write");
        System.out.println("---------------------------------------------------");
        WriteFile writeFile = new WriteFile();
        try{
            writeFile.writeInFile("/Users/gourabsinha/Desktop/Java/src/Module5/ReadFiles/Random1.txt");
        }
        catch (Exception e){
            System.out.println("Fix the issue");
        }


    }
}

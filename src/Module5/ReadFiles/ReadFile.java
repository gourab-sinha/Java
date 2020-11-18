package Module5.ReadFiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {
    private FileInputStream obj = null;
    private String filePath;
    public ReadFile(String filePath){
        this.filePath=filePath;
        try{
            this.obj =new FileInputStream(this.filePath);
        }
        catch (Exception e){
            throw new RuntimeException("Please use give valid file path");
        }
    }
    public void setObj(String filePath) throws Exception {
        this.filePath=filePath;
        this.obj.close();
        this.obj = new FileInputStream(this.filePath);
    }

    public int noOfCharacters() throws Exception{
        return obj.available();
    }

    public int asciiValueOfCharacter() throws Exception{
        return obj.read();
    }

    public void printCharacters() throws Exception{
        int ch = obj.read();
        while(ch!=-1){
            System.out.print((char)ch);
            ch = obj.read();
        }
//        obj.close();
    }

    public void readFileCompletely() throws Exception{
        byte b[] = new byte[obj.available()];
        obj.read(b);
        String str = new String(b);
        System.out.println(str);
//        obj.close();
    }

    public void convertByteStreamToCharStream() throws Exception{
        obj = new FileInputStream(filePath);
        InputStreamReader source = new InputStreamReader(obj);
        BufferedReader reader = new BufferedReader(source);
//        System.out.println(reader.readLine());

        String line = reader.readLine();
        while(line != null){
            System.out.println(line);
            Thread.sleep(1000);
            line = reader.readLine();
        }
    }

    public FileInputStream getFileInputObject() throws Exception{
        return new FileInputStream(filePath);
    }
}

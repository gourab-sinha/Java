package Module5.ReadFiles;

import java.io.FileInputStream;

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
    }
}

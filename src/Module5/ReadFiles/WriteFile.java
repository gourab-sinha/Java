package Module5.ReadFiles;

import java.io.FileOutputStream;

public class WriteFile {
    public void writeInFile(String filePath) throws Exception{
        System.out.println("Write in the File");
        // FileOutputStream fout = new FileOutputStream(filePath); // overwrite
        FileOutputStream fout = new FileOutputStream(filePath, true); // append mode
        String byteData = "Imagine a world in which the vast majority of people wake up inspired, feel safe wherever they are and end the day fulfilled by the work they do. This is a place to connect with, learn from and grow with others who share in our vision.\n" +
                "This is a \"closed\" group. While acceptance is by approval only and content can only be seen by members, the list of members is public.";
        byte[] data=byteData.getBytes();
        fout.write(data);
        fout.close();
    }

}

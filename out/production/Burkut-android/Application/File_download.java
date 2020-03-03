package Application;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class File_download {
    public static void main(String[] args) throws IOException {
        URL newUrl = new URL("https://fake-api.kiparo.by/json/it_news.json");
        IntPut.getPut(newUrl);

    }
}
class IntPut  {

    public static void getPut(URL b) throws IOException {

        String newFile = "newFile.txt";
        URL myUrl =  b;

        InputStream input = new BufferedInputStream(myUrl.openStream());
        FileOutputStream outPut = new FileOutputStream(newFile);

        System.out.print("Download start!");

        byte buffer [] =new byte[1024];
        while (input.read(buffer) !=-1){
            outPut.write(buffer);
        }
        System.out.print(" Download finish! ");

        input.close();
        outPut.close();


    }
}
class Parser{

}
package Application;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InPut {


        public static void getPut(URL b) throws IOException {

            String newFile = "newFile.json";
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


package Application.Entity;

import Application.Interface.InSave;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InPutSave implements InSave {

    public static String getPut(URL myUrl) throws IOException {

        String newFile = "newFile.json";

        InputStream input = new BufferedInputStream(myUrl.openStream());
        FileOutputStream outPut = new FileOutputStream(newFile);

        System.out.print("Download start!");

        byte buffer[] = new byte[1024];
        while (input.read(buffer) != -1) {
            outPut.write(buffer);
        }
        System.out.print(" Download finish! ");
        input.close();
        outPut.close();
        return newFile;
    }
}


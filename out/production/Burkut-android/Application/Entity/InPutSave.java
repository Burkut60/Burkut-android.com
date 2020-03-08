package Application.Entity;

import Application.Interface.InSave;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class InPutSave implements InSave {

    public static String getPut(URL myUrl) throws IOException {

        String newFile = "newFile.json";

        InputStream input = new BufferedInputStream(myUrl.openStream());
        FileOutputStream outPut = new FileOutputStream(newFile);

        System.out.print("Download start!");

        byte buffer[] = new byte[1024];
        while (input.read(buffer) != -1) {
            outPut.write(buffer);

            System.out.println(newFile);
        }
//               НЕ РАБОТАЕТ!!!!!!
//        System.out.println(Arrays.toString(newFile));
//        String str = new String(newFile);
//
//        System.out.print(" Download finish! ");
//
//        FileWriter fileWriter = new FileWriter(str);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        for (String s : str){
//            bufferedWriter.write(s);
//
//            input.close();
//            outPut.close();
//            bufferedWriter.close();
//        }
        return newFile;
    }
}


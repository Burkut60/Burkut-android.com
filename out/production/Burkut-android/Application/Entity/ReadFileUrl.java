package Application.Entity;

import Application.Interface.ReadUrl;
import java.io.*;
import java.net.URL;

public class ReadFileUrl implements ReadUrl {

    public static String getUrl(URL newUrl) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(newUrl.openStream()));

        String inPutLine;
        while ((inPutLine = bufferedReader.readLine()) != null)
            System.out.println(inPutLine);
        bufferedReader.close();

        return null;
    }
}
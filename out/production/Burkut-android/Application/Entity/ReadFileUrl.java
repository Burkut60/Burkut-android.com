package Application.Entity;

import Application.Interface.ReadUrl;

import java.io.*;
import java.net.URL;

public class ReadFileUrl implements ReadUrl {

    public static String getUrl(URL newUrl) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(newUrl.openStream()));
        StringBuilder stringBuilder = new StringBuilder();

        String inPutLine;
        while ((inPutLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(inPutLine).append("\n");
        }
        bufferedReader.close();

        return stringBuilder.toString();
    }
}
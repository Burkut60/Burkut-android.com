package Application.Entity;

import java.io.*;
import java.net.URL;

public class ReadFileUrl {
    public static String getUrl(URL newUrl) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(newUrl.openStream()));

        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null)
            System.out.println(inputLine);
        bufferedReader.close();

        return inputLine;
    }
}
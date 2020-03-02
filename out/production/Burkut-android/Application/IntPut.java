package Application;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class IntPut {

    public static void getPut(URL b) throws IOException {

        URLConnection myUrl = b.openConnection();
        int c;
        InputStream input = myUrl.getInputStream();
        while (((c = input.read()) != -1)) {
            System.out.print((char) c);
        }
        input.close();
    }
}


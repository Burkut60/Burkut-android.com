package Application;

import java.io.IOException;
import java.net.URL;


public class File_download {
    public static void main(String[] args) throws IOException {
        URL newUrl = new URL("https://fake-api.kiparo.by/json/it_news.json");
        IntPut.getPut(newUrl);

    }
}
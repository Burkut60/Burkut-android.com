package Application.Main;

import Application.Entity.ReadFileUrl;
import Application.Entity.UtilJson;
import java.io.*;
import java.net.URL;

public class File_download {
    public static void main(String[] args) throws IOException {
        URL newUrl = new URL("https://fake-api.kiparo.by/json/it_news.json");
        ReadFileUrl.getUrl(newUrl);
        UtilJson.Util(ReadFileUrl.getUrl(newUrl));

    }
}


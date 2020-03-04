package Application;

import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.util.List;


public class File_download {
    public static void main(String[] args) throws IOException {
        URL newUrl = new URL("https://fake-api.kiparo.by/json/it_news.json");
        InPut.getPut(newUrl);


    }
}


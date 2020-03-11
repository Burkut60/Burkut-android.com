package MaiTest;

import com.google.gson.Gson;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws MalformedURLException {
        URL newUrl = new URL("https://fake-api.kiparo.by/json/it_news.json");
        Gson gson = new Gson();


    }
}

package Application.Main;

import Application.Entity.ReadFileUrl;
import Application.ObjectGs.NewsSelection;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;

public class Download {

    public static void main(String[] args) throws IOException {
        URL newUrlL = new URL("https://fake-api.kiparo.by/json/it_news.json");
        Gson gson = new Gson();
        NewsSelection newsSelection = gson.fromJson(ReadFileUrl.getUrl(newUrlL), NewsSelection.class);
        System.out.println(newsSelection.getClass());
    }
}

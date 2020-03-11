package Application.Main;

import Application.Entity.ReadFileUrl;
import Application.ObjectGs.News;
import Application.ObjectGs.NewsSelection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Download {

    public static void main(String[] args) throws IOException {
        URL newUrlL = new URL("https://fake-api.kiparo.by/json/it_news.json");

        Gson gson = new Gson();
        NewsSelection newsSelection = gson.fromJson(ReadFileUrl.getUrl(newUrlL), NewsSelection.class);

       GsonBuilder gsonBuilder = new GsonBuilder();
               //.setDateFormat("yyy-MM-dd HH:mm:ss").create();




        System.out.println(newsSelection.getLocation());
        System.out.println(newsSelection.getName());

        for (News newS : newsSelection.news) {
            System.out.println(newS.getId());
            System.out.println(newS.getTitle());
            System.out.println(newS.isVisible());
            System.out.println(newS.date);
            System.out.println(newS.getDescription());
            System.out.println("____________________________");
        }
    }


}


package Application.Main;

import Application.Entity.ReadFileUrl;
import Application.ObjectGs.News;
import Application.ObjectGs.NewsSelection;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

public class Download {

    public static void main(String[] args) throws IOException {
        URL newUrlL = new URL("https://fake-api.kiparo.by/json/it_news.json");
        Object obj = new JsonParser().parse(ReadFileUrl.getUrl(newUrlL));
        JsonObject jsonObject = (JsonObject) obj;

        JsonArray jsonArray = (JsonArray) jsonObject.get("news");
        Iterator newsIterator = jsonArray.iterator();

        System.out.println("news : ");

        while (newsIterator.hasNext()) {
            JsonObject jsonObject1 = (JsonObject) newsIterator.next();
            System.out.println(jsonObject1.get("id"));
            System.out.println(jsonObject1.get("title"));
            System.out.println(jsonObject1.get("description"));
            System.out.println(jsonObject1.get("date"));
            System.out.println(jsonObject1.get("visible"));
            System.out.println("__________________________________");
        }
    }
    // Вопрос ! Почему не получилось реализовать??
    //Gson gson = new Gson();
//        NewsSelection newsSelection = gson.fromJson(ReadFileUrl.getUrl(newUrlL), NewsSelection.class);
//     System.out.println(newsSelection.getLocation());
//        System.out.println(newsSelection.getName());
//
//        for ( NewsSelection newS : newsSelection.allNews){
//            System.out.println(newS.);
//        }

 }



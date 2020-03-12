package Application.Main;

import Application.Entity.JsonSerial;
import Application.Entity.ReadFileUrl;
import Application.ObjectGs.News;
import Application.ObjectGs.NewsSelection;
import com.google.gson.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Date;

public class Download {

    public static void main(String[] args) throws IOException {
        URL newUrlL = new URL("https://fake-api.kiparo.by/json/it_news.json");

        Gson gson = new Gson();

        NewsSelection newsSelection = gson.fromJson(ReadFileUrl.getUrl(newUrlL), NewsSelection.class);

       // Gson gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z").create();


GsonBuilder builder = new GsonBuilder();
builder.registerTypeAdapter(News.class, new JsonDeserializer<Date>() {
    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Date(jsonElement.getAsJsonPrimitive().getAsLong());
    }
});
         Gson gsonBuilder = builder.setDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z").create();
        System.out.println(newsSelection.getLocation());
        System.out.println(newsSelection.getName());

        for (News newS : newsSelection.news) {
            System.out.println(newS.date);
            System.out.println(newS.getId());
            System.out.println(newS.getTitle());
            System.out.println(newS.isVisible());
            System.out.println(newS.getDescription());
            System.out.println("____________________________");
        }
    }
}


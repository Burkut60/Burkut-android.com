package Application;

import com.google.gson.Gson;

public class UtilJson {
    public static void  util(String jsonString){
        Gson gson = new Gson();
       AllNews ne = gson.fromJson(jsonString ,AllNews.class);

    }
}

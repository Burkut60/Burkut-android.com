package Application.Entity;

import Application.ObjectGson.News;
import Application.ObjectGson.NewsSelection;
import com.google.gson.Gson;

import java.io.FileNotFoundException;


public class UtilJson {

    public static String Util(String inputLine) throws FileNotFoundException {
        Gson gson = new Gson();
        NewsSelection newsSelection = gson.fromJson(inputLine, NewsSelection.class);

        for (News news : newsSelection.getAllNews()) ;
        {
            System.out.println(" name :" + newsSelection.getName());
            System.out.println(" location  :" + newsSelection.getLocation());
        }
        return inputLine;
    }
}

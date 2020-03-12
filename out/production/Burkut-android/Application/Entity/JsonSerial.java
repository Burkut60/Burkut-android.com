package Application.Entity;

import Application.ObjectGs.News;
import com.google.gson.*;

import javax.xml.crypto.Data;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Locale;

public class JsonSerial {
    JsonSerializer<Date> jsonSerializer = new JsonSerializer<Date>(){

        @Override
        public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
            return null;
        }
    };
    Gson gson = new GsonBuilder()
            .registerTypeAdapter(News.class, jsonSerializer)
            .create();
}
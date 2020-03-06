package Application.ObjectGson;

import java.util.List;

public class NewsSelection {
    private String name;
    private String location;
    private List<News> allNews;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<News> getAllNews() {
        return allNews;
    }

    public void setAllNews(List<News> allNews) {
        allNews = allNews;
    }
}

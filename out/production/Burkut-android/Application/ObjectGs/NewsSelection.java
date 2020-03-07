package Application.ObjectGs;

import java.util.List;

public class NewsSelection {
    private String name1;
    private String location;
    private List<News> allNews;

    public  NewsSelection(List<News> allNews) {
        this.allNews = allNews;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
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

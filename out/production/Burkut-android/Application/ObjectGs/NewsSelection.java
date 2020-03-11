package Application.ObjectGs;

import java.util.List;

public class NewsSelection {

    private String name;
    private String location;
    public List<News> news;

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
}

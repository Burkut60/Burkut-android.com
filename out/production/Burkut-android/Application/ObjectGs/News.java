package Application.ObjectGs;

import java.util.Date;
import java.util.List;

public class News {

    private int id;
    private String title;
    private String description;
    public String date;
    private boolean visible;
    private List<String> keywords;

//    public News(Date date) {
//       this.date = date;
//    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }



}


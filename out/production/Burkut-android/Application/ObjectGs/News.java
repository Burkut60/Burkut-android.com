package Application.ObjectGs;

import java.util.List;

public class News {

    private int id;
    private String title;
    private String description;
    private String date;
    private boolean visible;
    private List<String> keywords;

//public News(int id, String title, String description, String date, boolean visible){
//    this.id = id;
//    this.title = title;
//    this.description = description;
//    this.date = date;
//    this.visible = visible;

// }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

}


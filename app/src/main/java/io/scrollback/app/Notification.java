package io.scrollback.app;

/**
 * Created by karthikbalakrishnan on 23/03/15.
 */
public class Notification {

    private String title = "";
    private String message = "";
    private String path = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

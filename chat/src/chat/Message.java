package chat;

/**
 *
 * @author dvcarrillo
 */

public class Message {
    private String username;
    private String text;

    // SET METHODS
    public void setUsername(String username) {
        this.username = username;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    // GET METHODS
    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }
    
}

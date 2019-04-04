package rs_pos;

/**
 *
 * @author Michael Buglass
 */
public class User {
    private int id;
    private String username, fName, lName;
    private boolean isAdmin;

    // Constructer
    public User(int id, String username, String fName, String lName,
            boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.fName = fName;
        this.lName = lName;
        this.isAdmin = isAdmin;
    }
    
    // Empty constructer
    public User(){    
    }

    // Returns id
    public int getID(){
        return id;
    }
    
    // Seets id
    public void setID(int id){
        this.id = id;
    }
    
    // Returns username
    public String getUsername() {
        return username;
    }

    // Sets username 
    public void setUsername(String username) {
        this.username = username;
    }

    // Returns user's first name
    public String getFName() {
        return fName;
    }
    // Sets user's first name
    public void setFName(String first_name) {
        this.fName = first_name;
    }
    // Returns user's last name
    public String getLName() {
        return lName;
    }
    // Sets user's last name
    public void setLName(String last_name) {
        this.lName = last_name;
    }
// Returns user's first name
    public Boolean getAdmin() {
        return isAdmin;
    }
// Returns user's first name
    public void setAdmin(Boolean user_type) {
        this.isAdmin = isAdmin;
    }
    
}

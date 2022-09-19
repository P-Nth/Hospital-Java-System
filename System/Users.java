import java.util.HashMap;

public class Users {

    private String userId;
    private String username;
    private String passsword;

    HashMap<String, String> userDetails = new HashMap<String, String>();

    // user constructor
    Users() {

        userDetails.put("Phyll", "123");
        userDetails.put("Manasse", "abc");
        userDetails.put("Hannah", "1010");
        userDetails.put("Domnic", "2020");
        userDetails.put("Ojwang", "selfdestruct");
    };

    // method getSystemUsers()
    protected HashMap getSystemUsers() {
        return userDetails;
    };

    public void systemUsers(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.passsword = password;
    }

    public String userId() {
        return userId;
    }

    public String username() {
        return username;
    }

    public String passsword() {
        return passsword;
    }

    public String toString() {
        return userId + "" + username + "" + passsword;
    }
}
public class User {
    private String userID;
    private String password;
    private String email;
    private String userType;
    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }


    public void resetpassword(String password) {
        this.password = password;
    }
}

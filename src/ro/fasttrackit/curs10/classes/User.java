package ro.fasttrackit.curs10.classes;

public class User {
    private String password;
    private String userName;

    public User (String password, String userName) {
        this.password = password;
        this.userName = userName;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUserName(){
        return this.userName;
    }
}

public class User extends Person{
    private String userName;
    private String password;

    public User (int id, String firstName, String lastName, int age,String userName, String password){
        super(id, firstName, lastName, age);
        this.password=password;
        this.userName=userName;

    }
    public String getUserName(){
        return userName;

    }
    public void setUserName(String userName){
        this.userName=userName;

    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

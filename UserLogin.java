package course.se.taskmanager;
public class UserLogin {
    private  class UserRegistration userRegistration;

    public UserLogin(UserRegistration userRegistration){
        this.userRegistration = userRegistration;
    }

    git add .    public boolean login(String username,String password){
        return userRegistration.login(username,password);
    }
}
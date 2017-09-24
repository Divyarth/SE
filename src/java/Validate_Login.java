import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Validate_Login {

    private String username;
    private String password;
    private String output;

    public Validate_Login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {

        if (username.equals("admin") && password.equals("admin")) {
            output = "correct";
            return output;
        } else {
            output = "wrong";
            return output;
        }
    }
}

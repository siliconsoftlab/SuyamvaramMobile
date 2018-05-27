package thanjai.it.com.suyamvaram.model;

public class LoginModel {

    private String usernanme;
    private String password;
    private ProgressBarState progressBarState;

    public LoginModel(String usernanme, String password) {
        this.usernanme = usernanme;
        this.password = password;
    }

    public LoginModel() {
    }

    public String getUsernanme() {
        return usernanme;
    }

    public void setUsernanme(String usernanme) {
        this.usernanme = usernanme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ProgressBarState getProgressBarState() {
        return progressBarState;
    }

    public void setProgressBarState(ProgressBarState progressBarState) {
        this.progressBarState = progressBarState;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "usernanme='" + usernanme + '\'' +
                ", password='" + password + '\'' +
                ", progressBarState=" + progressBarState +
                '}';
    }


}

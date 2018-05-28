package thanjai.it.com.suyamvaram.view;

import java.util.List;

import thanjai.it.com.suyamvaram.model.User;

public interface  LoginResultCallbacks {
    public void onLoginSuccess(List<User> matches);
    public void onLoginError(String message);
    public void onLoginProgress();

}

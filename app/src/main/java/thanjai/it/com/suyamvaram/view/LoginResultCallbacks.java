package thanjai.it.com.suyamvaram.view;

import thanjai.it.com.suyamvaram.model.User;

public interface  LoginResultCallbacks {
    public void onLoginSuccess(User user);
    public void onLoginError(String message);
    public void onLoginProgress();

}

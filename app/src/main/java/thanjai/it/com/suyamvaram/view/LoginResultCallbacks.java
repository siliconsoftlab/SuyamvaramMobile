package thanjai.it.com.suyamvaram.view;

import thanjai.it.com.suyamvaram.model.CUser;

public interface  LoginResultCallbacks {
    public void onLoginSuccess(CUser user);
    public void onLoginError();
    public void onLoginProgress();

}

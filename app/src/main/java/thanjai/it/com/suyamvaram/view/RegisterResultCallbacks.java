package thanjai.it.com.suyamvaram.view;

public interface RegisterResultCallbacks {
    public void onRegisterSuccess();
    public void onRegisterFailed(String Messgae);
    public void onRegisterProgress();
    public void onRegisterMandatoryError();
    public void onLoginPageClciked();
}

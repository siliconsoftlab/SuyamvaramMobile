package thanjai.it.com.suyamvaram.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import thanjai.it.com.suyamvaram.R;
import thanjai.it.com.suyamvaram.databinding.ActivityLoginBinding;
import thanjai.it.com.suyamvaram.model.LoginModel;
import thanjai.it.com.suyamvaram.model.ProgressBarState;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.viewmodel.LoginViewModel;


public class LoginActivity extends AppCompatActivity implements LoginResultCallbacks {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    public void init() {

        ActivityLoginBinding activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginModel loginModel = new LoginModel();
        loginModel.setProgressBarState(ProgressBarState.INVISIBLE);
        LoginViewModel loginViewModel = new LoginViewModel(loginModel, this, this);
        activityLoginBinding.setLoginViewModel(loginViewModel);

    }

    @Override
    public void onLoginSuccess(User user) {
        setProgressBarIndeterminateVisibility(false);
        Intent intent = new Intent(this, MatchesListActivity.class);
        intent.putExtra("User", user);
        startActivity(intent);
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(this, "Could not login: "+message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginProgress() {
       /* requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setProgressBarIndeterminateVisibility(true);*/
    }
}

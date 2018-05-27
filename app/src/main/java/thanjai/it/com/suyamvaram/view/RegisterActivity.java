package thanjai.it.com.suyamvaram.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import thanjai.it.com.suyamvaram.R;
import thanjai.it.com.suyamvaram.databinding.ActivityRegisterBinding;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.viewmodel.RegisterViewModel;

public class RegisterActivity extends AppCompatActivity implements RegisterResultCallbacks {
    private static final String TAG = "RegisterActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActivityRegisterBinding activityRegisterBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        User user = new User();
        RegisterViewModel registerViewModel = new RegisterViewModel(user, this, this);
        activityRegisterBinding.setRegisterViewModel(registerViewModel);
    }

    @Override
    public void onRegisterSuccess() {
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_LONG).show();
        onLoginPageClciked();


    }

    @Override
    public void onRegisterFailed(String Messgae) {
        Toast.makeText(this, ""+Messgae, Toast.LENGTH_LONG).show();
    }
    @Override
    public void onRegisterProgress() {

    }

    @Override
    public void onRegisterMandatoryError() {
        Toast.makeText(this, "Enter value for all fields", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginPageClciked() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}

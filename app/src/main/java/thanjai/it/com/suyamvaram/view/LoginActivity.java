package thanjai.it.com.suyamvaram.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import thanjai.it.com.suyamvaram.R;
import thanjai.it.com.suyamvaram.databinding.ActivityLoginBinding;
import thanjai.it.com.suyamvaram.model.CUser;
import thanjai.it.com.suyamvaram.model.LoginModel;
import thanjai.it.com.suyamvaram.viewmodel.LoginViewModel;


public class LoginActivity extends AppCompatActivity implements LoginResultCallbacks {
    TextView txtVewSignUpLink;
    Button btn_log_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();

       /* setContentView(R.layout.activity_login);
        txtVewSignUpLink=(TextView) findViewById(R.id.btn_log_singup_link);
        txtVewSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        btn_log_login=(Button) findViewById(R.id.btn_log_login);

        btn_log_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,MatchesListActivity.class);
                startActivity(intent);
            }

        });*/
    }

    public void init() {
       // Toast.makeText(this, "modified", Toast.LENGTH_SHORT).show();
        ActivityLoginBinding activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
      // activityLoginBinding.getRoot();
        //activityLoginBinding.get
         LoginModel loginModel= new LoginModel();
       // LoginModel loginModel= new LoginModel(activityLoginBinding.getLoginViewModel().getUsernanme(),activityLoginBinding.getLoginViewModel().getPassword());
        LoginViewModel loginViewModel = new LoginViewModel(loginModel, this, this);
        activityLoginBinding.setLoginViewModel(loginViewModel);

    }

    @Override
    public void onLoginSuccess(CUser user) {

        Intent intent = new Intent(this, MatchesListActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginError() {

    }

    @Override
    public void onLoginProgress() {

    }
}

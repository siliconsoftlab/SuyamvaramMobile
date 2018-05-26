package thanjai.it.com.suyamvaram.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import thanjai.it.com.suyamvaram.R;

public class RegisterActivity extends AppCompatActivity {
TextView txtVewSignUpLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtVewSignUpLink=(TextView) findViewById(R.id.btn_reg_login_link);
        txtVewSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}

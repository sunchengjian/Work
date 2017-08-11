package com.sun.work;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.sun.work.activity.MainActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;

import static com.sun.work.R.id.tv_rem_password;

public class LoginActivity extends AppCompatActivity {

    @InjectView(R.id.username)
    EditText username;
    @InjectView(R.id.password)
    EditText password;
    @InjectView(R.id.tv_fotget_word)
    TextView tvFotgetWord;
    @InjectView(tv_rem_password)
    TextView tvRemPassword;
    @InjectView(R.id.rember_password)
    ImageView remberPassword;
    @InjectView(R.id.tv_login)
    TextView tvLogin;
    boolean IsRembered=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        remberPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsRembered) {
                    remberPassword.setImageDrawable(getResources().getDrawable(R.drawable.word_select));
                    IsRembered=!IsRembered;
                }else {
                    remberPassword.setImageDrawable(getResources().getDrawable(R.drawable.un_word_select));
                    IsRembered=!IsRembered;
                }
            }
        });
    }

}

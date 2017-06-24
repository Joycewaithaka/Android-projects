package com.example.student.intagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tvLanguage =(TextView) findViewById(R.id.tvLanguage);
        ImageView ivLogo = (ImageView) findViewById(R.id.ivLogo);
        Button btnSignup = (Button) findViewById(R.id.btnSignUp);
        TextView tvHelp = (TextView) findViewById(R.id.tvHelp);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        TextView tvFacebook = (TextView) findViewById(R.id.tvFacebook);
        TextView tvOr = (TextView) findViewById(R.id.tvOr);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        EditText etUseremail = (EditText) findViewById(R.id.etUserEmail);
    }

}

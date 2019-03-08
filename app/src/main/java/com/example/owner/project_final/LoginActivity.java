package com.example.owner.project_final;

/** ViewPager - Fragment
 *  TabHost (Failed)
 */

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    // For Activity finish -------------------------------------------------------------------------
    public static Activity loginActivity;

    LoginActivity loginact = (LoginActivity)LoginActivity.loginActivity;
    MainActivity mainact = (MainActivity)MainActivity.mainActivity;
    //----------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // For Activity finish ---------------------------------------------------------------------
        loginActivity = LoginActivity.this;
        // -----------------------------------------------------------------------------------------

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        TextView registerButton = (TextView) findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            // 클릭 시 registerIntent 를 통해서 registerActivity를 실행
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }
        });

        /*
        Button noLogin = (Button) findViewById(R.id.nologin);

        noLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tab1Activity.class);
                startActivity(intent);

            }
        });
        */

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });
    }

}

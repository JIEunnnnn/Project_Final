package com.example.owner.project_final;

/** ViewPager - Fragment
 *  TabHost (Failed)
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText birthText = (EditText) findViewById(R.id.birthText);
        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        EditText cnameText = (EditText) findViewById(R.id.cnameText);
        EditText addressText = (EditText) findViewById(R.id.addressText);
        EditText numberText = (EditText) findViewById(R.id.numberText);
        EditText emailText = (EditText) findViewById(R.id.emailText);
        EditText authText = (EditText) findViewById(R.id.authText);

        Button confirmButton = (Button) findViewById(R.id.confirmButton);
        Button authButton = (Button) findViewById(R.id.authButton);
        Button authcanButton = (Button) findViewById(R.id.authcanButton);
        Button registerButton = (Button) findViewById(R.id.registerButton);



    }
}

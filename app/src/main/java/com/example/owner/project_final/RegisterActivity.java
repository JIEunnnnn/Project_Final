package com.example.owner.project_final;

/** ViewPager - Fragment
 *  TabHost (Failed)
 */

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends LoginActivity {

    FirebaseDatabase fd;
    DatabaseReference fdRef;
    EditText nameText, birthText, idText, passwordText, cnameText, addressText, numberText, emailText, authText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //------------------------------------------------------------------------------------------
        /*
        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText birthText = (EditText) findViewById(R.id.birthText);
        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        EditText cnameText = (EditText) findViewById(R.id.cnameText);
        EditText addressText = (EditText) findViewById(R.id.addressText);
        EditText numberText = (EditText) findViewById(R.id.numberText);
        EditText emailText = (EditText) findViewById(R.id.emailText);
        EditText authText = (EditText) findViewById(R.id.authText);
        */
        Button confirmButton = (Button) findViewById(R.id.confirmButton);
        Button authButton = (Button) findViewById(R.id.authButton);
        Button authcanButton = (Button) findViewById(R.id.authcanButton);
        Button registerButton = (Button) findViewById(R.id.registerButton);

        //------------------------------------------------------------------------------------------

        fd = FirebaseDatabase.getInstance();
        fdRef = fd.getReference("users");
        // CRUD 작업의 기준이 되는 노드를 레퍼런스로 가져옵니다.
        // users 이하의 노드들을 가리킴
        nameText = (EditText) findViewById(R.id.nameText);
        birthText = (EditText) findViewById(R.id.birthText);
        idText = (EditText) findViewById(R.id.idText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        cnameText = (EditText) findViewById(R.id.cnameText);
        addressText = (EditText) findViewById(R.id.addressText);
        numberText = (EditText) findViewById(R.id.numberText);
        emailText = (EditText) findViewById(R.id.emailText);
        authText = (EditText) findViewById(R.id.authText);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = fdRef.push().getKey(); // 키를생성하고 키 값을 가져온다.
                String name = nameText.getText().toString();
                String birth = birthText.getText().toString();
                String id = idText.getText().toString();
                String password = passwordText.getText().toString();
                String cname = cnameText.getText().toString();
                String address = addressText.getText().toString();
                String number = numberText.getText().toString();
                String email = emailText.getText().toString();
                String auth = authText.getText().toString();
                Map<String, String > postValues = new HashMap<>();
                // Map<key, value> 형태로 저장합니다.
                // Map 인터페이스의 한 종류로 ( "Key", value) 로 이뤄져 있다
                // key 값을 중복이 불가능 하고 value는 중복이 가능. value에 null값도 사용 가능하다.
                // 멀티쓰레드에서 동시에 HashMap을 건드려 Key - value값을 사용하면 문제가 될 수 있다. 멀티쓰레드에서는 HashTable을 쓴다
                postValues.put("name", name);
                postValues.put("birth", birth);
                postValues.put("id", id);
                postValues.put("password", password);
                postValues.put("cname", cname);
                postValues.put("address", address);
                postValues.put("number", number);
                postValues.put("email", email);
                // postValues.put("auth",auth); 인증번호 - SMTP사용
                DatabaseReference keyRef = fdRef.child(key);
                // fdRef의 자식 키값을 가리킨다.
                keyRef.setValue(postValues);
                // 클래스
                Toast.makeText(getApplicationContext(), "가입완료.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class );
                startActivity(intent);
                finish();
            }
        });


    }
}

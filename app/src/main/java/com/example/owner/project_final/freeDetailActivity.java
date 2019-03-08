package com.example.owner.project_final;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class freeDetailActivity extends AppCompatActivity {




    EditText  titles , users, contents ;
    Button cancel, revise ;

    FirebaseFirestore db = FirebaseFirestore.getInstance();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freedetail);


        titles = (EditText)findViewById(R.id.freeTitle);
        users = (EditText) findViewById(R.id.freeUser);
        contents = (EditText) findViewById(R.id.freeContents);

        revise = (Button)findViewById(R.id.reviseButton);
        cancel = (Button)findViewById(R.id.cancelButton);






        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });






    }
}

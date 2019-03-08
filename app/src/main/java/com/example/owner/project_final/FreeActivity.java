package com.example.owner.project_final;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class FreeActivity extends AppCompatActivity {
    // 이부분이 그 사용자들이 게시글을 올리면 그에 대한 정보들을 여기에 출력해야지!


    FirebaseFirestore db = FirebaseFirestore.getInstance();
    // freeWrite부분에서 받은 데이터들을 documnetSnspshot으로 출력하기!
    CollectionReference colRef = db.collection("freeWrite");

    ArrayList<String> dataArr = new ArrayList<String>(); // 데이터부분
    ListView listView; // 데이터를 저장하는 뷰


    Button preButton, writeButton ;


    String title, user, cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free);

        preButton = (Button)findViewById(R.id.fButton);

        writeButton = (Button) findViewById(R.id.writeButton);


        colRef.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if(task.isSuccessful()){
                    for(QueryDocumentSnapshot document : task.getResult()){
                        System.out.println("성공"+document.getData());

                      //  title = document.getString("title");
                       //  user = document.getString("user");
                        cont =   document.getString("contents");

                        dataArr.add(cont);






                    }

                }else{
                    System.out.println("콜렉션불러오기실패2");
                }

                listView = (ListView) findViewById(R.id.ListView); // 뷰영역

                ArrayAdapter<String> adapter
                        = new ArrayAdapter<String>(
                        getApplicationContext(), // 현재 화면의 제어권자
                        android.R.layout.simple_list_item_1,  //한행마다 보여줄 레이아웃을 지정
                        dataArr); // 다량의 데이터


                System.out.println("성공"+adapter);
                listView.setAdapter(adapter);


            }
        });






        preButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //이전 페이지로 화면전환
                Intent intent = new Intent (FreeActivity.this, Tab3Activity.class);

                startActivity(intent);
            }

        });

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (FreeActivity.this , FreeWriteActivity.class);
                startActivity(intent2);
            }
        });







    }
}

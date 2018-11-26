package com.example.owner.project_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tab3Activity extends MainActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);

        final Button purchaseButton = (Button) findViewById(R.id.purchaseButton);
        final Button foodButton = (Button) findViewById(R.id.foodButton);
        final Button hobbyButton = (Button) findViewById(R.id.hobbyButton);
        final Button roomButton = (Button) findViewById(R.id.roomButton);
        final ImageButton myButton = (ImageButton) findViewById(R.id.myButton);


        purchaseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //다음페이지로 화면을 전환
                //화면 전환시 사용하는 클래스
                Intent intent1 = new Intent(Tab3Activity.this, PurchaseActivity.class);
                //화면전환하기
                startActivity(intent1);
            }

        });

        foodButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(Tab3Activity.this, FoodActivity.class);
                startActivity(intent2);
            }
        });

        roomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent3 = new Intent(Tab3Activity.this, RoomActivity.class);
                startActivity(intent3);
            }
        });

        hobbyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent4 = new Intent(Tab3Activity.this, HobbyActivity.class);
                startActivity(intent4);
            }
        });

        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent5 = new Intent(Tab3Activity.this, MypageActivity.class);
                startActivity(intent5);
            }
        });

    }
}

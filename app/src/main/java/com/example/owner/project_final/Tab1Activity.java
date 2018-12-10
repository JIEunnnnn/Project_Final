package com.example.owner.project_final;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import com.google.firebase.database.FirebaseDatabase;

public class Tab1Activity extends MainActivity {
    // 달력받아와서
    // 체크박스 등록 -> 알림창으로 나타내기

    //------------------------------------------------------------------------------------------
    //Dialog dia;
    //------------------------------------------------------------------------------------------

    CustomDialog di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);

       CalendarView cal1 = (CalendarView)findViewById(R.id.cal1);


       /* cal1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

            }
        });*/

        //------------------------------------------------------------------------------------------
        Button btn1_first=(Button)findViewById(R.id.btn1_first);
        Button btn1_second=(Button)findViewById(R.id.btn1_second);
        Button btn1_third=(Button)findViewById(R.id.btn1_third);


        btn1_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( Tab1Activity.this,Tab1Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btn1_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( Tab1Activity.this,Tab2Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });
        btn1_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( Tab1Activity.this,Tab3Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });


        //------------------------------------------------------------------------------------------

        Button button1 = (Button)findViewById(R.id.button1);
        di = new CustomDialog(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                di.show();
            }
        });


    }





}

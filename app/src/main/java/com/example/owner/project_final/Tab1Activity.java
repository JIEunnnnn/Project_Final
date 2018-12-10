package com.example.owner.project_final;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CalendarView;

import com.google.firebase.database.FirebaseDatabase;

public class Tab1Activity extends MainActivity {
    // 달력받아와서
    // 체크박스 등록 -> 알림창으로 나타내기

    CustomDialog di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);

       CalendarView cal1 = (CalendarView)findViewById(R.id.cal1);
        Button button1 = (Button)findViewById(R.id.button1);


        di = new CustomDialog(this);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                di.show();
            }
        });



       /* cal1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

            }
        });*/




    }





}

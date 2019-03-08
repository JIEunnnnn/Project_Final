package com.example.owner.project_final;

import android.app.Activity;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Calendar;
import java.util.Date;

import static android.icu.util.Calendar.YEAR;

public class Tab1Activity extends MainActivity {
    // 달력받아와서
    // 체크박스 등록 -> 알림창으로 나타내기

    //------------------------------------------------------------------------------------------
    //Dialog dia;
    //------------------------------------------------------------------------------------------

    // For Activity finish -------------------------------------------------------------------------
    public static Activity tab1Activity;

    LoginActivity loginact = (LoginActivity)LoginActivity.loginActivity;
    MainActivity mainact = (MainActivity)MainActivity.mainActivity;
    Tab1Activity tab1act = (Tab1Activity)Tab1Activity.tab1Activity;
    Tab2Activity tab2act = (Tab2Activity)Tab2Activity.tab2Activity;
    Tab3Activity tab3act = (Tab3Activity)Tab3Activity.tab3Activity;
    //----------------------------------------------------------------------------------------------

    int year, month, date ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);

       final CalendarView cal1 = (CalendarView)findViewById(R.id.cal1);

        // For Activity finish ---------------------------------------------------------------------
        tab1Activity = Tab1Activity.this;

        loginact.finish();
//        tab1act.finish();
//        tab2act.finish();
//        tab3act.finish();
        // -----------------------------------------------------------------------------------------

       /* cal1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

            }
        });*/

        /*------------------------------------------------------------------------------------------

        Button btn1_first=(Button)findViewById(R.id.btn1_first);
        Button btn1_second=(Button)findViewById(R.id.btn1_second);
        Button btn1_third=(Button)findViewById(R.id.btn1_third);   // 삭제될 예정


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


        ------------------------------------------------------------------------------------------*/




        cal1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year1, int month1, int dayOfMonth1) {
                year = year1;
                month = month1 + 1;
                date = dayOfMonth1;

                String data = String.format("%d-%d-%d", year, month, date);



                    Intent intent = new Intent(getApplicationContext(), checkbox_tab1.class);
                    intent.putExtra("today", data);
                    startActivity(intent);





            }
        });
    }
}


        // 1. 날짜가 입력된날짜로만 뜸 선택된날짜로 출력안됨 - 완료!!!
        // 2. 데이터베이스에 저장한 값들을 날짜에 맞게 불러올수있어야함 - 완료!!
        // 3. 선택된 날짜를 통해 알고리즘? 작성하여 메세지를 제공할수있어야함
        // 4. 캘린더의 대화상자가 두번이상 나오지않게 설정 - 완료!!



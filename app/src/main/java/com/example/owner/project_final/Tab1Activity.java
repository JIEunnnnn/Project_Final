package com.example.owner.project_final;

import android.os.Bundle;
import android.widget.CalendarView;

public class Tab1Activity extends MainActivity {
    // 달력받아와서
    // 체크박스 등록 -> 알림창으로 나타내기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);

        CalendarView cal1 = (CalendarView)findViewById(R.id.lay);
        



    }





}

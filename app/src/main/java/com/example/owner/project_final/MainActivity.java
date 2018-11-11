package com.example.owner.project_final;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent;

        TabHost tabhost =getTabHost();
        tabhost.setup(getLocalActivityManager());


        intent = new Intent().setClass(this, Tab1Activity.class );
        TabHost.TabSpec first = tabhost.newTabSpec("read").setIndicator("오늘하루");
        first.setContent(R.id.first);
        tabhost.addTab(first);
        first.setContent(intent);

        intent = new Intent().setClass(this, Tab2Activity.class );
        TabHost.TabSpec second = tabhost.newTabSpec("location").setIndicator("위치");
        second.setContent(R.id.second);
        tabhost.addTab(second);
        second.setContent(intent);

        intent = new Intent().setClass(this, Tab3Activity.class );
        TabHost.TabSpec third = tabhost.newTabSpec("board").setIndicator("게시판");
        third.setContent(R.id.third);
        tabhost.addTab(third);
        third.setContent(intent);

        tabhost.setCurrentTab(0);

        /* TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup(getLocalActivityManager());

        tabhost.addTab(tabhost.newTabSpec("read").setIndicator("오늘하루")
            .setContent(new Intent(this, Tab1Activity.class)));
        tabhost.addTab(tabhost.newTabSpec("location").setIndicator("위치")
                .setContent(new Intent(this, Tab2Activity.class)));
        tabhost.addTab(tabhost.newTabSpec("board").setIndicator("게시판")
                .setContent(new Intent(this, Tab3Activity.class)));*/


    }

}

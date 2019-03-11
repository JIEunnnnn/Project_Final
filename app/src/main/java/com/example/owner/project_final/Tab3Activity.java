package com.example.owner.project_final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Tab3Activity extends MainActivity {

    // For Activity finish -------------------------------------------------------------------------
    public static Activity tab3Activity;

    LoginActivity loginact = (LoginActivity)LoginActivity.loginActivity;
    MainActivity mainact = (MainActivity)MainActivity.mainActivity;
    Tab1Activity tab1act = (Tab1Activity)Tab1Activity.tab1Activity;
    Tab2Activity tab2act = (Tab2Activity)Tab2Activity.tab2Activity;
    Tab3Activity tab3act = (Tab3Activity)Tab3Activity.tab3Activity;
    //----------------------------------------------------------------------------------------------

    /* For Toolbar ---------------------------------------------------------------------------------
    Toolbar toolBar;
    ----------------------------------------------------------------------------------------------*/

    /* For Navigation Drawer -----------------------------------------------------------------------
    Intent intent;

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ----------------------------------------------------------------------------------------------*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);

        // For Activity finish ---------------------------------------------------------------------
        tab3Activity = Tab3Activity.this;

        loginact.finish();
//        tab1act.finish();
//        tab2act.finish();
//        tab3act.finish();
        // -----------------------------------------------------------------------------------------

        /* For Toolbar -----------------------------------------------------------------------------
        toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("우리동네 자취생");

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.baseline_menu_black_24dp);
        ------------------------------------------------------------------------------------------*/

        /* For Navigation Drawer -------------------------------------------------------------------
        drawerLayout = (DrawerLayout)findViewById(R.id.activity_main);
        navigationView = (NavigationView)findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                drawerLayout.closeDrawers();

                int id = item. getItemId();

                switch (id) {
                    case R.id.navi_tab1:
                        Toast.makeText(Tab3Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        intent = new Intent().setClass( Tab3Activity.this,Tab1Activity.class );
                        startActivity(intent);
                        break;
                    case R.id.navi_tab2:
                        Toast.makeText(Tab3Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        intent = new Intent().setClass( Tab3Activity.this,Tab2Activity.class );
                        startActivity(intent);
                        break;
                    case R.id.navi_tab3:
                        Toast.makeText(Tab3Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        intent = new Intent().setClass( Tab3Activity.this,Tab3Activity.class );
                        startActivity(intent);
                        break;
                    case R.id.navi_tab4:
                        Toast.makeText(Tab3Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        break;
                    case R.id.navi_tab5:
                        Toast.makeText(Tab3Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        break;
                    case R.id.navi_tab6:
                        Toast.makeText(Tab3Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        break;

                }

                return true;
            }
        });
        ------------------------------------------------------------------------------------------*/

        final Button purchaseButton = (Button) findViewById(R.id.purchaseButton); // 공동구매
        final Button foodButton = (Button) findViewById(R.id.foodButton); // 음식배달
        final Button hobbyButton = (Button) findViewById(R.id.hobbyButton); // 취미공유
        final Button roomButton = (Button) findViewById(R.id.roomButton); // 단기방대여
        final ImageButton myButton = (ImageButton) findViewById(R.id.myButton);
        final ImageButton writeButton = (ImageButton) findViewById(R.id.writeButton);

        Button noticeButton  = (Button) findViewById(R.id.noticeButton);   // 공지버튼
        final Button freeButton   = (Button)  findViewById(R.id.freeButton);    // 자유게시판 버튼

        purchaseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //다음페이지로 화면을 전환
                //화면 전환시 사용하는 클래스
                Intent intent1 = new Intent(Tab3Activity.this, PurchaseMapActivity.class);
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

        writeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent6 = new Intent(Tab3Activity.this, WriteActivity.class);
                startActivity(intent6);
            }
        });

        noticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Tab3Activity.this, NoticeActivity.class);
                startActivity(intent7);
            }
        });

        freeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(Tab3Activity.this, FreeActivity.class);
                startActivity(intent8);
            }
        });

        /*------------------------------------------------------------------------------------------
        Button btn3_first=(Button)findViewById(R.id.btn3_first);
        Button btn3_second=(Button)findViewById(R.id.btn3_second);
        Button btn3_third=(Button)findViewById(R.id.btn3_third);


        btn3_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( Tab3Activity.this,Tab1Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btn3_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( Tab3Activity.this,Tab2Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });
        btn3_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( Tab3Activity.this,Tab3Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
        ------------------------------------------------------------------------------------------*/

    }

    /* For Toolbar ---------------------------------------------------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);

//        drawerLayout = (DrawerLayout)findViewById(R.id.activity_main);

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "환경설정 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_mypage:
                Toast.makeText(getApplicationContext(), "마이페이지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return true;

            case android.R.id.home:
//                drawerLayout.openDrawer(GravityCompat.START);
                return true;

            default:
                Toast.makeText(getApplicationContext(), "나머지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
        }
    }
    ----------------------------------------------------------------------------------------------*/

}

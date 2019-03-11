package com.example.owner.project_final;

/*
다른 자바 파일에 툴바와 내비게이션 바와 관련된 것을 넣으면 앱 강제종료 당함
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    // For Activity finish -------------------------------------------------------------------------
    public static Activity mainActivity;

    LoginActivity loginact = (LoginActivity)LoginActivity.loginActivity;
    MainActivity mainact = (MainActivity)MainActivity.mainActivity;
    Tab1Activity tab1act = (Tab1Activity)Tab1Activity.tab1Activity;
    Tab2Activity tab2act = (Tab2Activity)Tab2Activity.tab2Activity;
    Tab3Activity tab3act = (Tab3Activity)Tab3Activity.tab3Activity;
    //----------------------------------------------------------------------------------------------

    // For Toolbar ---------------------------------------------------------------------------------
    Toolbar toolBar;
    //----------------------------------------------------------------------------------------------

    // For Navigation Drawer -----------------------------------------------------------------------
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    // ---------------------------------------------------------------------------------------------
/*
    // For Navigation Drawer 2 -----------------------------------------------------------------
    ListView listView = null;
    // -----------------------------------------------------------------------------------------
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For Activity finish ---------------------------------------------------------------------
        mainActivity = MainActivity.this;

        loginact.finish();
//        tab1act.finish();
//        tab2act.finish();
//        tab3act.finish();
        // -----------------------------------------------------------------------------------------

        // For Toolbar -----------------------------------------------------------------------------
        toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("우리동네 자취생");

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.baseline_menu_black_24dp);
        // -----------------------------------------------------------------------------------------

        // For Navigation Drawer -------------------------------------------------------------------
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
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        intent = new Intent().setClass( MainActivity.this,Tab1Activity.class );
                        startActivity(intent);
                        break;
                    case R.id.navi_tab2:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        intent = new Intent().setClass( MainActivity.this,Tab2Activity.class );
                        break;
                    case R.id.navi_tab3:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        intent = new Intent().setClass( MainActivity.this,Tab3Activity.class );
                        break;
                    case R.id.navi_tab4:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        break;
                    case R.id.navi_tab5:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        break;
                    case R.id.navi_tab6:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        break;

                }

                return true;
            }
        });
        // -----------------------------------------------------------------------------------------
/*
        // For Navigation Drawer 2 -----------------------------------------------------------------
        final String[] items = {"오늘 하루", "위치 서비스", "게시판",
                "-공동구매", "-음식배달", "-단기방대여", "자유게시판", "음성변조", "공지사항", "마이페이지"} ;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items) ;

        listView = (ListView) findViewById(R.id.drawer_content) ;
        listView.setAdapter(adapter) ;

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView parent, View v, int position, long id) {
                                                switch (position) {
                                                    case 0: // 오늘 하루
                                                        intent = new Intent().setClass(MainActivity.this, Tab1Activity.class);
                                                        startActivity(intent);
                                                        break;
                                                    case 1: // 위치 서비스
                                                        intent = new Intent().setClass(MainActivity.this, Tab2Activity.class);
                                                        startActivity(intent);
                                                        break;
                                                    case 2: // 게시판
                                                        intent = new Intent().setClass(MainActivity.this, Tab3Activity.class);
                                                        startActivity(intent);
                                                        break;
                                                    case 3: // 공동구매
                                                        break;
                                                    case 4: // 음식배달
                                                        break;
                                                    case 5: // 단기방대여
                                                        break;
                                                    case 6: // 자유게시판
                                                        break;
                                                    case 7: // 음성변조
                                                        break;
                                                    case 8: // 공지사항
                                                        break;
                                                    case 9: // 마이페이지
                                                        break;
                                                }

                                                DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.activity_main);
                                                drawerLayout.closeDrawer(Gravity.LEFT);
                                            }
                                        });
        // -----------------------------------------------------------------------------------------
*/
        Button btn_first=(Button)findViewById(R.id.btn_first);
        Button btn_second=(Button)findViewById(R.id.btn_second);
        Button btn_third=(Button)findViewById(R.id.btn_third);
        Button btn_fourth=(Button)findViewById(R.id.btn_fourth);
        Button btn_fifth=(Button)findViewById(R.id.btn_fifth);
        Button btn_sixth=(Button)findViewById(R.id.btn_sixth);


        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( MainActivity.this,Tab1Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( MainActivity.this,Tab2Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( MainActivity.this,Tab3Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

/*
        btn_fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( MainActivity.this,Tab1Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btn_fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( MainActivity.this,Tab2Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });
        btn_sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( MainActivity.this,Tab3Activity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
*/



    }

    // For Toolbar ---------------------------------------------------------------------------------
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

        drawerLayout = (DrawerLayout)findViewById(R.id.activity_main);

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "환경설정 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_mypage:
                Toast.makeText(getApplicationContext(), "마이페이지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return true;

            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;

            default:
                Toast.makeText(getApplicationContext(), "나머지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
        }
    }
    //----------------------------------------------------------------------------------------------

}
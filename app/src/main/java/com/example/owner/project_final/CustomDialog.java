package com.example.owner.project_final;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class CustomDialog extends Dialog {
    CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,
            ch11,ch12,ch13,ch14,ch15,ch16,ch17,ch18,ch19,ch20,ch21,ch22,ch23,ch24;
    TextView tv;
    Button btn1, btn2;

    private Context context;


    public CustomDialog(Context context){
        super(context);

        final Dialog dlg = new Dialog(context);
        setContentView(R.layout.tab1dialog);
        ch1 = (CheckBox)findViewById(R.id.chkhappy);
        ch2 =(CheckBox)findViewById(R.id.chksad);
        ch3 = (CheckBox)findViewById(R.id.chkanger);
        ch4 = (CheckBox)findViewById(R.id.chkjoy);
        ch5= (CheckBox)findViewById(R.id.chklove);
        ch6 =(CheckBox)findViewById(R.id.chkhate);
        ch7 =(CheckBox)findViewById(R.id.chkgreed);
        ch8=(CheckBox)findViewById(R.id.chkgloom);

        ch9=(CheckBox)findViewById(R.id.chkhousefood);
        ch10=(CheckBox)findViewById(R.id.chkoutfood);
        ch11=(CheckBox)findViewById(R.id.chkdelivery) ;
        ch12 =(CheckBox)findViewById(R.id.chkFetc);

        ch13 = (CheckBox) findViewById(R.id.chkmovie);
        ch14=(CheckBox)findViewById(R.id.chkbook);
        ch15=(CheckBox)findViewById(R.id.chkmuseum);
        ch16=(CheckBox)findViewById(R.id.chkhobby);

        ch17 = (CheckBox)findViewById(R.id.chkdrink);
        ch18=(CheckBox)findViewById(R.id.chkshopping);
        ch19 = (CheckBox)findViewById(R.id.chknot);
        ch20=(CheckBox)findViewById(R.id.chkMetc);

        ch21 = (CheckBox)findViewById(R.id.chkrest);
        ch22 = (CheckBox)findViewById(R.id.chkhospital);
        ch23 = (CheckBox) findViewById(R.id.chkbeauty);
        ch24 = (CheckBox)findViewById(R.id.chkexercise);

        tv=(TextView)findViewById(R.id.eddiary);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              dlg.dismiss();

            }
        });



    }

}

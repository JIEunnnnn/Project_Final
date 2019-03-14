package com.example.owner.project_final;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class PurchaseWriteActivity extends AppCompatActivity {

    Intent intent;

    SeekBar seekBar;
    TextView outcome;
    Button save, cancle;
    public int number=1;

    public static Activity purchaseWriteActivity;
    PurchaseWriteActivity purchaseWriteact = (PurchaseWriteActivity) PurchaseWriteActivity.purchaseWriteActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_write);

        purchaseWriteActivity = PurchaseWriteActivity.this;

        seekBar = (SeekBar)findViewById(R.id.period_purchase);
        outcome = (TextView)findViewById(R.id.period_count_purchase);
        save = (Button)findViewById(R.id.saveButton_purchase);
        cancle = (Button)findViewById(R.id.cancelButton_purchase);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                number = seekBar.getProgress();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                number = seekBar.getProgress();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                number = seekBar.getProgress();
                update();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent().setClass( PurchaseWriteActivity.this, PurchaseActivity.class );
                startActivity(intent);
                purchaseWriteActivity.finish();
                overridePendingTransition(0, 0);
            }
        });

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent().setClass( PurchaseWriteActivity.this, PurchaseActivity.class );
                startActivity(intent);
                purchaseWriteActivity.finish();
                overridePendingTransition(0, 0);
            }
        });
    }

    public void update() {
        outcome.setText(new StringBuilder().append(number));
    }

}
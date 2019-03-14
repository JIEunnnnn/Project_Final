package com.example.owner.project_final;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class RoomWriteActivity extends AppCompatActivity {

    Intent intent;

    SeekBar seekBar;
    TextView outcome;
    Button save, cancle;
    public int number=1;

    public static Activity roomWriteActivity;
    RoomWriteActivity roomWriteact = (RoomWriteActivity)RoomWriteActivity.roomWriteActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_write);

        roomWriteActivity = RoomWriteActivity.this;

        seekBar = (SeekBar)findViewById(R.id.period_room);
        outcome = (TextView)findViewById(R.id.period_count_room);
        save = (Button)findViewById(R.id.saveButton_room);
        cancle = (Button)findViewById(R.id.cancelButton_room);

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
                intent = new Intent().setClass( RoomWriteActivity.this, RoomActivity.class );
                startActivity(intent);
                roomWriteActivity.finish();
                overridePendingTransition(0, 0);
            }
        });

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent().setClass( RoomWriteActivity.this, RoomActivity.class );
                startActivity(intent);
                roomWriteActivity.finish();
                overridePendingTransition(0, 0);
            }
        });
    }

    public void update() {
        outcome.setText(new StringBuilder().append(number));
    }
}

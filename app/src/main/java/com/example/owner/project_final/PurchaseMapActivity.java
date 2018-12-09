package com.example.owner.project_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PurchaseMapActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_map);

        Button purchaseListButton = (Button)findViewById(R.id.purchaseListButton);

        purchaseListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent().setClass( PurchaseMapActivity.this, PurchaseActivity.class );
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

    }
}

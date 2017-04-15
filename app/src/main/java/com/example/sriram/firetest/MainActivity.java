package com.example.sriram.firetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton moz,cdc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moz = (ImageButton) findViewById(R.id.moz_btn);
        cdc = (ImageButton) findViewById(R.id.cdc_btn);
        moz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MozillaActivity.class);
                startActivity(intent);
            }

        });
        cdc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CoderActivity.class);
                startActivity(intent);
            }

        });

    }
}

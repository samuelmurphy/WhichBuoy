package com.samtheknife.www.whichbuoy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DrawView drawView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.BLACK);
        setContentView(drawView);
    }
}


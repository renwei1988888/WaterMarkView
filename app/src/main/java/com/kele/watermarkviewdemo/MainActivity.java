package com.kele.watermarkviewdemo;

import android.os.Bundle;

import com.kele.watermarkviewdemo.watermark.WaterMarkView;
import com.kele.watermarkviewdemo.watermark.WaterMarkViewGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WaterMarkView wmv = findViewById(R.id.wmv);
        wmv.setParams("View实现");
        WaterMarkViewGroup wmvg = findViewById(R.id.wmvg);
        wmvg.setParams("ViewGroup实现");
    }
}
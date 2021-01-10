package com.example.tictactoygame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buClick;
    Button bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu1=(Button)findViewById(R.id.bu1);
        bu2=(Button)findViewById(R.id.bu2);
        bu3=(Button)findViewById(R.id.bu3);
        bu4=(Button)findViewById(R.id.bu4);
        bu5=(Button)findViewById(R.id.bu5);
        bu6=(Button)findViewById(R.id.bu6);
        bu7=(Button)findViewById(R.id.bu7);
        bu8=(Button)findViewById(R.id.bu8);
        bu9=(Button)findViewById(R.id.bu9);
    }

    public void buclick(View view) {

        Button buSelected=(Button) view;
        buSelected.setBackgroundColor(Color.RED);
    }
}
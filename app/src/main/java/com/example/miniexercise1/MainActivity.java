package com.example.miniexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button screen1,screen2,screen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        screen1 = findViewById(R.id.screen_one_btn);
        screen2 = findViewById(R.id.screen_two_btn);
        screen3 = findViewById(R.id.screen_three_btn);

        screen1.setOnClickListener(this);
        screen2.setOnClickListener(this);
        screen3.setOnClickListener(this);


    }

    //Click Listener
    @Override
    public void onClick(View v) {
        if (v==screen1){
            startActivity(new Intent(this,ScreenOneActivity.class));}
        if (v==screen2){
            startActivity(new Intent(this, ScreenTwoActivity.class));}
        if (v==screen3){
            startActivity(new Intent(this,ScreenThreeActivity.class));}

    }
}

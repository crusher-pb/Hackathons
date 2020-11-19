package com.example.medsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView lp;
    TextView tos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        lp = (TextView) findViewById(R.id.sptolp);
        lp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLogin();
            }
        });

        tos2 = (TextView) findViewById(R.id.tostage2);
        tos2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openStage2();
            }
        });
    }

    public void openLogin(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openStage2(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}

package com.example.medsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        back = (TextView) findViewById(R.id.backtostage1);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openStage1();
            }
        });
    }

    public void openStage1(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
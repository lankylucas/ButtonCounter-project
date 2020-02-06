package com.example.myfirstaplicationromanova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @SuppressLint("SetTextI18n")
    @Override
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.firstProj);
        btn.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Button btn = (Button) findViewById(R.id.firstProj);
                btn.setText("FirstApp");
                button= findViewById(R.id.firstProj);
                button.setText("");
                button.setOnClickListener(new.ViewOnClickListener());
            }
        });
    }
}




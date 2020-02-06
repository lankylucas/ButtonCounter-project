package com.example.button_counter_romanova;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counter;
    private Button btnIncrement;
    private Button btnDecrement;
    private Button btnReset;
    public int count= 0;
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        String value = counter.getText().toString();
        outState.putString("key", value);
    }
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String value= savedInstanceState.getString("key");
        counter.setText(String.valueOf(count));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter= findViewById(R.id.counter);
        btnIncrement=findViewById(R.id.buttonIn);
        btnDecrement=findViewById(R.id.buttonDec);
        btnReset=findViewById(R.id.buttonRes);
        counter.setText("0");

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 1;
                counter.setText(String.valueOf(count));

            }
        });
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count -=1;
                counter.setText(String.valueOf(count));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                counter.setText(String.valueOf(count));
            }
        });
    }
}

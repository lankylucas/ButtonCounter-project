package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s= "The Button";
        button=findViewById(R.id.buttonID);
        textView=findViewById(R.id.id1);
        editText=findViewById(R.id.plain_text_input);


        onSaveInstanceState(Bundle outstate);{
            super.onSaveInstanceState(Bundle.EMPTY);

            String value=editText.getText().toString();


        }


    }
}

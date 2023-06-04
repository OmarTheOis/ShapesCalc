package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1 = findViewById(R.id.firstnum);
        final EditText num2 = findViewById(R.id.secoundnum);
        final Button b1 = findViewById(R.id.button);
        final TextView tv =findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
              String n1= num1.getText().toString();
                String n2 =num2.getText().toString();
                int number1 = Integer.parseInt(n1);
                int number2 = Integer.parseInt(n2);
                int re= number1+number2;

                tv.setText(String.valueOf(re));


            }
        });

    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class shapes_calc extends AppCompatActivity {
    Spinner sp;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_calc);

        ConstraintLayout cons = findViewById(R.id.cl);
         sp= findViewById(R.id.spinner);
        EditText rec_hig =findViewById(R.id.rect_et_height);
        EditText rec_width =findViewById(R.id.rect_et_width);
        EditText circle_raduis =findViewById(R.id.circle_et_radius);
        EditText tri_base =findViewById(R.id.tri_et_base);
        EditText tri_hig =findViewById(R.id.tri_et_height);
        TextView tv =findViewById(R.id.textView4);
        Button b= findViewById(R.id.button2);



        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                    rec_hig.setVisibility(View.VISIBLE);
                    rec_width.setVisibility(View.VISIBLE);
                    circle_raduis.setVisibility(View.GONE);
                    tri_base.setVisibility(View.GONE);
                    tri_hig.setVisibility(View.GONE);
                    break;
                    case 1:
                        rec_hig.setVisibility(View.GONE);
                        rec_width.setVisibility(View.GONE);
                        circle_raduis.setVisibility(View.VISIBLE);
                        tri_base.setVisibility(View.GONE);
                        tri_hig.setVisibility(View.GONE);
                        break;
                    case 2:
                        rec_hig.setVisibility(View.GONE);
                        rec_width.setVisibility(View.GONE);
                        circle_raduis.setVisibility(View.GONE);
                        tri_base.setVisibility(View.VISIBLE);
                        tri_hig.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
         b.setOnClickListener(new View.OnClickListener() {
             @SuppressLint("ResourceAsColor")
             @Override
             public void onClick(View view) {
               int ps = sp.getSelectedItemPosition();
               double area=0;
               switch (ps){
                   //rectangle h*w
                   case 0:
                       double h=Double.parseDouble(rec_hig.getText().toString());
                       double w=Double.parseDouble(rec_width.getText().toString());
                       area=h*w;
                       break;
                   case 1:
                       double r=Double.parseDouble(circle_raduis.getText().toString());
                       area=Math.PI*Math.pow(r,2);
                       break;
                   case 2:
                       double th=Double.parseDouble(tri_hig.getText().toString());
                       double bh=Double.parseDouble(tri_base.getText().toString());
                       area=0.5*th*bh;
                       break;
               }
               tv.setText(String.valueOf(area));

             }
         });
    }
}
package com.demo.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        EditText number_field_1 = findViewById(R.id.number_field_1);
        EditText number_field_2 = findViewById(R.id.number_field_1);
        Button button = findViewById(R.id.button3);
        TextView result = findViewById(R.id.result);


        button.setOnClickListener(view -> {
            float num1 = Float.parseFloat(number_field_1.getText().toString());   //для типа данных float
            float num2 = Float.parseFloat(number_field_2.getText().toString());
            float res = num1 + num2;
            result.setText(String.valueOf(res));


            //  int num1 = Integer.parseInt(number_field_1.getText().toString());
            //   int num2 = Integer.parseInt(number_field_2.getText().toString());
            //   int res = num1 + num2;

            //   result.setText(String.valueOf(res));

        });

    }


}
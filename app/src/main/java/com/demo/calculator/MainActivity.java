package com.demo.calculator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.demo.calculator.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText number_field_1, number_field_2;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_1 = findViewById(R.id.number_field_1);
        button = findViewById(R.id.button3);
        result = findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1 + num2;
                //  resultTextView.setText(String.valueOf(res));
                result.setText(String.valueOf(res));

            }
        });

    }


}
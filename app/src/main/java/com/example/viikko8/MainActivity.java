package com.example.viikko8;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private EditText number1;
    private EditText number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        number1 = findViewById(R.id.editFirstNumber);
        number2 = findViewById(R.id.editSecondNumber);
        output = findViewById(R.id.textSeeResult);
    }


    public void plus(View view){
        float num1 = Float.parseFloat(String.valueOf(number1.getText()));
        float num2 = Float.parseFloat(String.valueOf(number2.getText()));
        String sum = String.valueOf(num1+num2);
        output.setText(sum);
    }

    public void minus(View view){
        float num1 = Float.parseFloat(String.valueOf(number1.getText()));
        float num2 = Float.parseFloat(String.valueOf(number2.getText()));
        String sum = String.valueOf(num1-num2);
        output.setText(sum);
    }

    public void multiply(View view){
        float num1 = Float.parseFloat(String.valueOf(number1.getText()));
        float num2 = Float.parseFloat(String.valueOf(number2.getText()));
        String sum = String.valueOf(num1*num2);
        output.setText(sum);
    }

    public void divide(View view){
        float num1 = Float.parseFloat(String.valueOf(number1.getText()));
        float num2 = Float.parseFloat(String.valueOf(number2.getText()));
        String sum = String.valueOf(num1/num2);
        output.setText(sum);
    }
}
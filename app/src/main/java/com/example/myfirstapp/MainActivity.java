package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText fisrtDigitInput = findViewById(R.id.inputFirstDigit);
        EditText secondDigitInput = findViewById(R.id.inputSecondDigit);
        Button compareButton = findViewById(R.id.buttonCompare);
        TextView resultText = findViewById(R.id.textResult);

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //код при нажатии на кнопку
                String fist = fisrtDigitInput.getText().toString();
                String second = secondDigitInput.getText().toString();
                try {
                    Integer intFirst = Integer.valueOf(fist);
                    Integer intSecond = Integer.valueOf(second);
                    Log.v("DigitsComparator", "Comparing " + intFirst + " and " + intSecond);
                    if (intFirst.equals(intSecond)) {
                        resultText.setText("Equal");
                    } else {
                        resultText.setText("Not Equal");
                    }
                } catch (NumberFormatException e) {
                    resultText.setText("Only digits!");
                }
            }
        });
    }
}
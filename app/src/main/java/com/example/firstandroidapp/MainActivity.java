package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button generateButton = (Button) findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText f = (EditText) findViewById(R.id.textField);
                TextView result = (TextView) findViewById(R.id.textView);

                int range = Integer.parseInt(f.getText().toString());
                Random random = new Random();
                int randomNumber = random.nextInt(range - 0) + 0;
                result.setText(randomNumber + " ");
            }
        });
    }
}
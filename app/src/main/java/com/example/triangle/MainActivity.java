package com.example.triangle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    Button ButtonResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







    }

    public void VivodResults(View view)
    {


        Result = findViewById(R.id.Otvet);
        ButtonResult = findViewById(R.id.Vivod);

        final Random rnd = new Random();
        int a = rnd.nextInt(10);
        int b = rnd.nextInt(10);
        int c = rnd.nextInt(10);

        if ((a<b+c) && (b<a+c) && (c<a+b))
        {
            int P = a + b +c;
            Result.setText("Периметр = " +P);
        }

    }
}
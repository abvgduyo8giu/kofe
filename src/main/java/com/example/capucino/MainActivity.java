package com.example.capucino;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button getStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getStart = findViewById(R.id.btnSwapToMain);
    }
    public void onClick(View v){
        try
        {
            Intent intent = new Intent(this, main_vindow.class);
            startActivity(intent);
        }
        catch (Exception err)
        {
            Intent intent = new Intent(this, main_vindow.class);
            startActivity(intent);
        }

    }
}
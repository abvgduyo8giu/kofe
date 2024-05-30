package com.example.capucino;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class main_vindow extends AppCompatActivity {

    private ImageButton imgBtnCap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);

        imgBtnCap = findViewById(R.id.imgBtnCap);
        imgBtnCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capBuyClick(v);
            }
        });
    }
    public void capBuyClick(View v) {
        Intent intent = new Intent(main_vindow.this, buy_win.class);
        startActivity(intent);
    }
}
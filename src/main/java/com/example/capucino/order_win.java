package com.example.capucino;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class order_win extends AppCompatActivity {

    private Button getBuyCap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_window);
        getBuyCap = findViewById(R.id.btnBuyCap);
    }
    public void onClick(View v){
        Intent intent = new Intent(order_win.this, main_vindow.class);
        startActivity(intent);
    }
}

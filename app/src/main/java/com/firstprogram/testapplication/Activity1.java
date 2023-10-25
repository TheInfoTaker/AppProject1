package com.firstprogram.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    private Button openActivity2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        openActivity2Button = findViewById(R.id.openActivity2Button);
        openActivity2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}


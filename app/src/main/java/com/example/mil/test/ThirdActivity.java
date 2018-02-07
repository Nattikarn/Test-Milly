package com.example.mil.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by mil on 2/7/2018 AD.
 */

public class ThirdActivity extends AppCompatActivity {

    private Button thirdBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        thirdBtn = findViewById(R.id.thirdBtn);

        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, Test.class);
                startActivity(intent);
            }
        });
    }
}

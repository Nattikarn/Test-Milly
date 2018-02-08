package com.example.mil.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by mil on 2/7/2018 AD.
 */

public class ThirdActivity extends MainActivity {

    private ImageView picThirdAct;
    private Button thirdBtn;
    private EditText editTextType1, editTextType2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        picThirdAct = findViewById(R.id.picThirdAct);
        picThirdAct = findViewById(R.id.picThirdAct);
        editTextType1 = findViewById(R.id.editTextType1);
        editTextType2 = findViewById(R.id.editTextType2);
        thirdBtn = findViewById(R.id.thirdBtn);

        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String txt = intent.getStringExtra("typeSthValue");

            }
        });
    }
}

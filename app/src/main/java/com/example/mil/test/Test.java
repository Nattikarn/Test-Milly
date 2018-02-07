package com.example.mil.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mil on 2/5/2018 AD.
 */

public class Test extends AppCompatActivity {

    private Button btnActivity2;
    private TextView showTextActivity2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        showTextActivity2 = findViewById(R.id.showTextActivity2);
        btnActivity2 = findViewById(R.id.btnActivity2);

        Intent intent = getIntent();
        String txt = intent.getStringExtra("typeSthValue");
        showTextActivity2.setText(txt);
        showTextActivity2.setText(txt);


        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("haha","Activity2 Button");
                Intent intent = new Intent(Test.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}

package com.example.mil.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;
    private EditText typeSth;
    private final static String TAG = "TestActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "ON CREATE...");

    }

    @Override
    protected void onStart() {
        super.onStart();
        typeSth = findViewById(R.id.typeSth);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = typeSth.getText().toString();
                Intent intent = new Intent(MainActivity.this, Test.class);
                intent.putExtra("typeSthValue", txt);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResumed called", Toast.LENGTH_LONG).show();

    }

     @Override
    protected void onPause() {
         super.onPause();
         Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_LONG).show();

     }

    @Override
    protected void onStop () {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_LONG).show();
    }
}

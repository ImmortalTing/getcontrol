package com.example.getcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "kkll" ;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = findViewById(R.id.out);
        out.setText("hhhhhhh");

        EditText input = findViewById(R.id.inp);
        String str = input.getText().toString();
        Button btn = findViewById(R.id.btn);

    }

    public void abc(View view) {
        Log.i(TAG, "onClick: ");
        Log.i(TAG, "abc: ");
        out.setText("Cliced A");
    }
}


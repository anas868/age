package com.example.anas2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText d1, d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.text);
        d1 =findViewById(R.id.et1);
        d2 =findViewById(R.id.et2);
    }

    public void age(View view) {
        if (d1.getText().toString().isEmpty()|| d2.getText().toString().isEmpty()){
            Toast.makeText(this, "please fill in fields", Toast.LENGTH_LONG).show();
        }
        else {
            String name= d1.getText().toString();
            int y=Integer.parseInt(d2.getText().toString());
            textView.setText(name+" age is "+(2024-y));
        }
    }
}
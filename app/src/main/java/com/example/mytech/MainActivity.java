package com.example.mytech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        b1= findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Enter your phone number",Toast.LENGTH_LONG).show();
                }
                if (e1.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this,"Login Sucess",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,home.class));
                }

                else {

                   Toast.makeText(MainActivity.this,"Invalid phone number",Toast.LENGTH_LONG).show();
               }

            }
        });
    }
}

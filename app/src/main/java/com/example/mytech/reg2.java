package com.example.mytech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class reg2 extends AppCompatActivity {
    EditText t4,t5,t6,t7;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg2);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        b5=findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t4.getText().toString().equals(" ") || t5.getText().toString().equals(" ") || t6.getText().toString().equals("") || t7.getText().toString().equals(" ")) {
                    Toast.makeText(reg2.this, "fill", Toast.LENGTH_LONG).show();
            }
                else
                {
                    Toast.makeText(reg2.this,"sucess",Toast.LENGTH_LONG).show();
                }
        };
        });
    }

}

package com.example.mytech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class register extends AppCompatActivity {
    TextView r1;
    EditText t1,t2,t3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        r1 =findViewById(R.id.r1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b4=findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().toString().equals(" ") || t2.getText().toString().equals(" ") || t3.getText().toString().equals("")) {
                    Toast.makeText(register.this, "fill", Toast.LENGTH_LONG).show();


                } else {
                    startActivity(new Intent(register.this, reg2.class));
                }
            }

        });
    }
}

package com.example.demoapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit=findViewById(R.id.edtUsername);
                EditText edit2=findViewById(R.id.edtPassword);
                Toast.makeText(MainActivity.this,
                        edit.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, edit2.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
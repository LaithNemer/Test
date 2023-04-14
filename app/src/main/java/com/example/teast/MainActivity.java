package com.example.teast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText pass;
    private EditText text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.Spiner);
        text=findViewById(R.id.userName);
        pass=findViewById(R.id.password);


    }

    public void Click(View view) {
        String name = spinner.getSelectedItem().toString();
        String tex=text.getText().toString()+" " + pass.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    Toast.makeText(this,tex,Toast.LENGTH_SHORT).show();
    }
}
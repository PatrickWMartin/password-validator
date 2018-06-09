package com.example.patrick.passsword_validator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validatePassword(View view){
        EditText input = findViewById(R.id.passwordField);
        TextView output = findViewById(R.id.strengthText);
        String test = input.getText().toString();
        if(Validator.validate( test) == true) {

            output.setText("Strong");
        }

    }
}
package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickedFun(View view){
        // Get user credentials
        EditText userNameEditText= (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText passwordEditText = (EditText) findViewById(R.id.editTextTextPassword);

//        String msg=String.format();

        Toast.makeText(this, "Hi "+userNameEditText.getText().toString(), Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
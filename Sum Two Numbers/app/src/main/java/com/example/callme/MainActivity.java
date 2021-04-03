package com.example.callme;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
//
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.activity_main);

        addEventOnListner();
    }
    public void addEventOnListner(){
        EditText  edittext1= (EditText) findViewById(R.id.editText1);
        EditText  edittext2= (EditText) findViewById(R.id.editText2);
        Button buttonSum= (Button) findViewById(R.id.button);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view){
                String num1=edittext1.getText().toString();
                String num2=edittext2.getText().toString();

                int a =Integer.parseInt(num1);
                int b= Integer.parseInt(num2);

                int sum=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
                                     }
            );

    }
}
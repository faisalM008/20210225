package com.example.currancyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // That function converts Dollars amount to pakisatani rupees
    public void convertDollerToPk(View view){
//        EditText amount= (EditText)findViewById(R.id._amount);
        double amount=  Double.parseDouble(((TextView) findViewById(R.id._amount)).getText().toString());
        Toast.makeText(this, amount+" in pk= "+amount*157.25, Toast.LENGTH_SHORT).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
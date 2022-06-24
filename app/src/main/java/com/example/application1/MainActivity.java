package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view){
        TextView textHello = findViewById(R.id.txtMessage);
        EditText edtTxtName = findViewById(R.id.editTxtName);

        textHello.setText(edtTxtName.getText().toString());
    }
}
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
        TextView textfName = findViewById(R.id.textView);
        TextView textlName = findViewById(R.id.textView2);
        TextView texteMail = findViewById(R.id.textView3);

        EditText edtTxtfName = findViewById(R.id.firstName);
        EditText edtTxtlName = findViewById(R.id.lastName);
        EditText edtTxteMail = findViewById(R.id.e_Mail);

        textfName.setText(edtTxtfName.getText().toString());
        textlName.setText(edtTxtlName.getText().toString());
        texteMail.setText(edtTxteMail.getText().toString());

    }
}
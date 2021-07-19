package com.example.myintentdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        textview=findViewById(R.id.textViewID);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){

            String Value=bundle.getString("tag");
            textview.setText(Value);

        }



    }
}
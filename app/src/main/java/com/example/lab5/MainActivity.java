package com.example.lab5;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {

    DatabaseReference accountsReference;
    ListView listView;
    EditText name, value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        iniComponent();



    }

    public void iniComponent(){

        listView = (ListView) findViewById(R.id.ListView);
        name = (EditText) findViewById(R.id.editText_Name);
        value = (EditText) findViewById(R.id.editText_Vaule);

    }

    public void submit(View view){

        String Sname = name.getText().toString();
        String Svalue = value.getText().toString();
        user U = new user(Sname,Svalue);
        accountsReference.child("user").setValue(U);

    }
}
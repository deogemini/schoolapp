package com.hfad.shoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private  Button login;
private EditText Username;
private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         login = findViewById(R.id.button);
        Username =  findViewById(R.id.editText);
        password = findViewById(R.id.editText3);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Uname = Username.getText().toString().trim();
                String pasword = password.getText().toString().trim();
                if(Uname.equals("Admin")&&
                pasword.equals("12345678")){
                    startActivity(new Intent(MainActivity.this, AdminOption.class));

                }else
                {
                    Toast.makeText(MainActivity.this, "PLEASE ENTER DEFAULT PASSWORD FOR ADMIN", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

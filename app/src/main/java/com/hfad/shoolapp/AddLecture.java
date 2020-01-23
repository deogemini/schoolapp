package com.hfad.shoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddLecture extends AppCompatActivity {
    private Button Save;
    private EditText fname, middlename, lastname, email, phoneno, code;
    private String gender;
    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lecture);
             myDB=new DatabaseHelper(this);
        fname = (EditText) findViewById(R.id.editText16);
        middlename = (EditText) findViewById(R.id.editText17);
        lastname = (EditText) findViewById(R.id.editText18);
        email = (EditText) findViewById(R.id.editText19);
        phoneno = (EditText) findViewById(R.id.editText20);
        code = (EditText) findViewById(R.id.editText21);
        Save = (Button) findViewById(R.id.button9);
        AddStaff();
        onClicka();
    }

    public void onClicka() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radioButton3:
                gender = "Male";
                break;
            case R.id.radioButton4:
                gender = "Female";
        }
    }
        public void AddStaff(){
            Save.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String firstname = fname.getText().toString();
                            String mdlname = middlename.getText().toString();
                            String lstname = lastname.getText().toString();
                            String mail = email.getText().toString();
                            String nambsimu = phoneno.getText().toString();
                            String codesubject = code.getText().toString();
                            String sex = gender;

                            boolean val = myDB.insertData(firstname, mdlname, lstname, mail, nambsimu, codesubject, sex);
                            if (val) {
                                Toast.makeText(AddLecture.this, "You have registered ", Toast.LENGTH_LONG).show();
                                Intent moveToLogin = new Intent(AddLecture.this, AdminOption.class);
                                startActivity(moveToLogin);
                            } else {
                                Toast.makeText(AddLecture.this, "Register error ", Toast.LENGTH_SHORT).show();

                            }

                        }

                    });
        }
    }

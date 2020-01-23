package com.hfad.shoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudents extends AppCompatActivity {
 EditText fname, middlename, lastname, email, phoneno, program, yearofstudy, password, confirmpassword;
Button RefStudent;
DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_students);
myDB = new DatabaseHelper(this);

        fname = (EditText)findViewById(R.id.editText2);
        middlename = (EditText)findViewById(R.id.editText4);
        lastname = (EditText)findViewById(R.id.editText5);
        email = (EditText)findViewById(R.id.editText2);
        phoneno = (EditText)findViewById(R.id.editText7);
        program = (EditText)findViewById(R.id.editText12);
        yearofstudy = (EditText)findViewById(R.id.editText9);
        password = (EditText)findViewById(R.id.editText8);
        confirmpassword = (EditText)findViewById(R.id.editText10);
        RefStudent = (Button) findViewById(R.id.button6);
      //  AddStudent();

    }
//    public void AddStudent(){
//        RefStudent.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        String firstname = fname.getText().toString();
//                        String mdlname = middlename.getText().toString();
//                        String lstname = lastname.getText().toString();
//                        String mail = email.getText().toString();
//                        String bachelor = program.getText().toString();
//                        String nambsimu = phoneno.getText().toString();
//                        String mwaka = yearofstudy.getText().toString();
//                        String pwd = password.getText().toString();
//                        String cmf = confirmpassword.getText().toString();
//
//
//                        if (pwd.equals(cmf)) {
//                            //boolean val = myDB.insertData(firstname, mdlname, lstname, mail, bachelor, nambsimu, mwaka, pwd);
//                            //if (val) {
//                                Toast.makeText(AddStudents.this, "You have registered ", Toast.LENGTH_SHORT).show();
//                                Intent moveToLogin = new Intent(AddStudents.this, AdminOption.class);
//                                startActivity(moveToLogin);
//                            } else {
//                                Toast.makeText(AddStudents.this, "Register error ", Toast.LENGTH_SHORT).show();
//
//                            }
//
//                        } else {
//                            Toast.makeText(AddStudents.this, "Password is not matching ", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                });
    }

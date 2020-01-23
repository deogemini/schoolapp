package com.hfad.shoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddCourse extends AppCompatActivity {
private Button submit;
private EditText Title;
private EditText Program;
private EditText Semester;
private EditText codecourse;
    private EditText credits;
public String category;

DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        myDb = new DatabaseHelper(this);
        Title = (EditText) findViewById(R.id.enterName);
        Program = (EditText) findViewById(R.id.programCourse);
        Semester = (EditText) findViewById(R.id.semesterCourse);
        codecourse = (EditText) findViewById(R.id.coursecode);
        credits = (EditText) findViewById(R.id.coursecredits);
    }

    public void onClicka(View view){
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int id   = radioGroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.radioButton5:
            category =  "Core";
            break;
            case R.id.radioButton6:
            category = "Option";
        }
    }
}

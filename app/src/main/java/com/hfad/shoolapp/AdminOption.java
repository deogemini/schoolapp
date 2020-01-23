package com.hfad.shoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminOption extends AppCompatActivity {
private Button regstudent;
    private Button reglecture;
    private Button regcourse;

    private Button logoutAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_option);


         regstudent = (Button) findViewById(R.id.button2   );
        regstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminOption.this, AddStudents.class));
            }
        });

       reglecture = (Button) findViewById(R.id.button3   );
        reglecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminOption.this, AddLecture.class));
            }
        });


     regcourse = (Button) findViewById(R.id.button4   );
        regcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminOption.this, AddCourse.class));
            }
        });



        logoutAdmin = (Button) findViewById(R.id.button11   );
        logoutAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminOption.this, MainActivity.class));
            }
        });





    }
}

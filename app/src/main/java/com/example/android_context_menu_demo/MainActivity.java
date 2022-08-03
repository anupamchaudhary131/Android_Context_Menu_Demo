package com.example.android_context_menu_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button viewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewStudent = (Button) findViewById(R.id.viewStudent);

        viewStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent viewIntent = new Intent(MainActivity.this, Student_List.class);
                startActivity(viewIntent);
            }
        });
    }
}
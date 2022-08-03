package com.example.android_context_menu_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Student_List extends AppCompatActivity {

    ListView listView;
    String students[] = {"Ram", "Shyam", "Raj", "Ghanshyam", "Ravi", "Abheishek", "Rohit", "Arun", "Naman", "Kapil",
                          "Virat", "Shikhar", "Uday", "Surya", "Rishabh", "Rani"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, students);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        menu.setHeaderTitle("Please Select Appropriate Action.");
    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch(id){

            case R.id.call:
                Toast.makeText(this, "Call Option is selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.msg:
                Toast.makeText(this, "Message option is selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.edit:
                Toast.makeText(this, "Edit Details Option is selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.delete:
                Toast.makeText(this, "Delete Option is selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.downloadDetails:
                Toast.makeText(this, "Download Details Option is selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);


        }

    }
}
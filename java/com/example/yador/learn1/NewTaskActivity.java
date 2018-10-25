package com.example.yador.learn1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
    }

    public void addTask(View view) {
        //todo add task logic
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(NewTaskActivity.this, SideBarActivity.class);
        startActivity(i);

        // close this activity
        finish();
    }

}

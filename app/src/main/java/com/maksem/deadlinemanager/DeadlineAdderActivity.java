package com.maksem.deadlinemanager;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DeadlineAdderActivity extends AppCompatActivity implements OnClickListener {

    EditText eventName;
    EditText description;

    Button btnCreate;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadline_adder);

        eventName = findViewById(R.id.eventName);
        description = findViewById(R.id.description);

        btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("eventName", eventName.getText().toString());
        intent.putExtra("description", description.getText().toString());
        startActivity(intent);
    }
}
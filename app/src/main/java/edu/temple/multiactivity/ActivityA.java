package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    Button aButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        setTitle("Activity A");
        aButton = findViewById(R.id.aButton);

        View.OnClickListener aChange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openB = new Intent(ActivityA.this, ActivityB.class);
                startActivity(openB);
            }
        };

        aButton.setOnClickListener(aChange);
    }

}

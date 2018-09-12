package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    Button bButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        setTitle("Activity B");

        bButton = findViewById(R.id.bButton);

        View.OnClickListener bChange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openA = new Intent(ActivityB.this, ActivityA.class);
                startActivity(openA);
            }
        };

        bButton.setOnClickListener(bChange);
    }
}

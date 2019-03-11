package com.example.ensure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Location extends AppCompatActivity {
    private Button gotoMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        gotoMap = (Button) findViewById(R.id.gotoMap);
        gotoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // action
                openLocation();
            }
        });

    }
    public void openLocation()
    {
        Intent intent = new Intent(this,  Map.class);
        startActivity(intent);
    }
}

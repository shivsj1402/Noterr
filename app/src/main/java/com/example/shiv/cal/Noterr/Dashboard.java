package com.example.shiv.cal.Noterr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shiv.cal.R;

public class Dashboard extends AppCompatActivity {

   // Button click = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Click(View view){
        Intent i = new Intent(this, Calendar_view.class);
        startActivity(i);
    }
}
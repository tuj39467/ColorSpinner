package edu.temple.colorspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        String[] colors = {"Choose a color","Red", "Orange", "Yellow", "Green", "Blue", "Purple"};

        ArrayAdapter ColorAdapter = new ArrayAdapter(ColorActivity.this, android.R.layout.simple_list_item_1,colors);

        spinner.setAdapter(ColorAdapter);


    }


}





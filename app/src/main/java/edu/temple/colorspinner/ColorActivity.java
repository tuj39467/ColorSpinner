package edu.temple.colorspinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class ColorActivity extends AppCompatActivity {

    Spinner spinner;
    ConstraintLayout myLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        myLayout = findViewById(R.id.myLayout);

        final String[] colors = {"Choose a color", "Red", "Yellow", "Green", "Blue", "Cyan", "Black", "Magenta","Gray","Light gray","Dark gray"};

        final BaseAdapter ColorAdapter = new ColorAdapter(ColorActivity.this, colors);

        spinner.setAdapter(ColorAdapter);
        //ColorAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView)spinner.getSelectedView()).setBackgroundColor(Color.WHITE);

                if(colors[position].equals("Red")) {
                      myLayout.setBackgroundColor(Color.RED);
                }
                else if(colors[position].equals("Yellow")) {
                    myLayout.setBackgroundColor(Color.YELLOW);
                }else if(colors[position].equals("Green")) {
                    myLayout.setBackgroundColor(Color.GREEN);
                }else if(colors[position].equals("Blue")) {
                    myLayout.setBackgroundColor(Color.BLUE);
                }else if(colors[position].equals("Cyan")) {
                    myLayout.setBackgroundColor(Color.CYAN);
                }else if(colors[position].equals("Black")) {
                    myLayout.setBackgroundColor(Color.BLACK);
                }else if(colors[position].equals("Magenta")) {
                    myLayout.setBackgroundColor(Color.MAGENTA);
                }else if(colors[position].equals("Gray")) {
                    myLayout.setBackgroundColor(Color.GRAY);
                }else if(colors[position].equals("Light gray")) {
                    myLayout.setBackgroundColor(Color.LTGRAY);
                }else if(colors[position].equals("Dark gray")) {
                    myLayout.setBackgroundColor(Color.DKGRAY);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }
}




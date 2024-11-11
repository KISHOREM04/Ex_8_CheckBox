package com.example.ex8;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkAndroid, chkJava, chkPhp, chkCpp, chkC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the CheckBoxes by their IDs
        chkAndroid = findViewById(R.id.chkAndroid);
        chkJava = findViewById(R.id.chkJava);
        chkPhp = findViewById(R.id.chkPhp);
        chkCpp = findViewById(R.id.chkCpp);
        chkC = findViewById(R.id.chkC);
    }

    // Method triggered on button click
    public void showSelected(View view) {
        String selected = "You selected: \n";

        if (chkAndroid.isChecked()) selected += "Android";
        if (chkJava.isChecked()) selected += "\nJava";
        if (chkPhp.isChecked()) selected += "\nPHP";
        if (chkCpp.isChecked()) selected += "\nCPP";
        if (chkC.isChecked()) selected += "\nC";

        // Display the selected items as a Toast
        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
    }
}

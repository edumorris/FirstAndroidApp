package com.edumacation.firstandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggle(View v) {
        v.setEnabled(false);
        Button btn = (Button) v;

        btn.setText("Disabled"); // Changes the text of the button to the one that is defined.
        Log.d("Success", "Button disabled, Text changed");
    }
}
package com.edumacation.firstandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    public void handleText(View V) {
        EditText t = findViewById(R.id.sourceText);
        String input = t.getText().toString();

        ((TextView) findViewById(R.id.textView2)).setText(input);

        Log.d("info", input);

        Toast.makeText(this, input, Toast.LENGTH_LONG).show(); // Display toast message
    }

    public void launchSettings(View v) {
        // Launch new activity
         Intent in = new Intent(this, SettingsActivity.class);

         startActivity(in);
    }
}
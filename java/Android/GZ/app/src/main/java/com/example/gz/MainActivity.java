package com.example.gz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.gz.MESSAGE";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG,"Hello World!");
    }
    // public void view are required to work with onClick()
    // this method is assigned to the button in xml so instead of assigning the button
    // to a variable we call this function when the button is pressed
    public void send_message(View view)
    {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        // adds the value of EditText to the intent. An Intent can carry data
        // types as key-value pairs called extras
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

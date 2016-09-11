package com.upbeat.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.upbeat.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText mNameEditText;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameEditText.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(MainActivity.this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        mNameEditText.setText("");
//    }
}

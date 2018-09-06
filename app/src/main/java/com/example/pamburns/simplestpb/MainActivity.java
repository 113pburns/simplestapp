package com.example.pamburns.simplestpb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Simplest";
    private Button mButton;
    private Button mMagicButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.my_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick");
                Toast.makeText(v.getContext(), "click", Toast.LENGTH_SHORT).show();
                Intent intent = SecondActivity.newIntent(v.getContext(), "no magic");
                startActivity(intent);


            }
        });
        mMagicButton = (Button) findViewById(R.id.magic_button);
        mMagicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClickmagic");
                Toast.makeText(v.getContext(), "magic", Toast.LENGTH_SHORT).show();
                Intent intent = SecondActivity.newIntent(v.getContext(), "magic");
                startActivity(intent);
            }
        });
    }
} // onCreate()

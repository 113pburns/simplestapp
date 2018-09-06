package com.example.pamburns.simplestpb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivityextends AppCompatActivity{
    private final static String MESSAGE = "com.example.jhibbele.simplest.message";
    Button mButton;
    TextView mMessageTextField;

    public static Intent newIntent(Context context, String message) {
        Intent intent= new Intent(context, SecondActivity.class);
        intent.putExtra(MESSAGE, message); return intent; }
}


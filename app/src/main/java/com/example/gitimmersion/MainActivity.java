package com.example.gitimmersion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("HELLO I AM MAKING AN EDIT");
        
        System.out.println("Made edit on Github");
        
    }
}

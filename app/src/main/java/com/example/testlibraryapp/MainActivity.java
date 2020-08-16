package com.example.testlibraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testlibrary.TestClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestClass asd = new TestClass();
        asd.testMethod("", "");
    }
}
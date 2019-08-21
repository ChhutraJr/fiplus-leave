package com.example.fiplus;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Main_Layout extends AppCompatActivity {

    private  static  final  String TAG = "MainActivity";
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private Public_String str;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        Log.d(TAG,"onCreate: starting.");
        setupBottomNavigationView();
        str = new Public_String();
    }

    private  void setupBottomNavigationView(){
        Log.d(TAG,"setupBottomNavigationView:setting up BottomNavigationView");


    }


}

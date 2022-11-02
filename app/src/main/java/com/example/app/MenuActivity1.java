package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MenuActivity1 extends AppCompatActivity {

    private String[] angka = {"1","2","3", "4","5","6","7", "8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","44","45","46","47","48","49","50"};
    private GridView grid1;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        grid1 = (GridView) findViewById(R.id.gridView1);
        adapter = new ArrayAdapter<String>(MenuActivity1.this, android.R.layout.simple_list_item_1, angka);
        grid1.setAdapter(adapter);
    }
}
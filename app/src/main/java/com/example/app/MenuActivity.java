package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MenuActivity extends AppCompatActivity {

    private String[] huruf = {"A","B","C", "D","E","F","G", "H","I","J", "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private GridView grid1;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        grid1 = (GridView) findViewById(R.id.gridView1);
        adapter = new ArrayAdapter<String>(MenuActivity.this, android.R.layout.simple_list_item_1, huruf);
        grid1.setAdapter(adapter);
    }
}
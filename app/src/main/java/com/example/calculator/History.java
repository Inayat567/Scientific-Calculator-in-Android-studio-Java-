package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class History extends AppCompatActivity {
    ListView listView;
    DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().setTitle("History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.list_item);
        ArrayList <String> list = new ArrayList();
        try {
           dbHandler = new DBHandler(History.this);
           Cursor cursor = dbHandler.fetchExpression();
           while (cursor.moveToNext()){
               list.add(cursor.getString(1));
           }
        }catch (NullPointerException n){

        }
        ArrayAdapter adapter = new ArrayAdapter(History.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(History.this, MainActivity.class);
                intent.putExtra("Expr", adapter.getItem(position).toString());
                startActivity(intent);
                finish();
            }
        });
   }
}
package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Facebook","WhatApp","Twitter","Instagram","Youtube"};
    String mDescription[] = {"Facebook Description","WhatApp Description","Twitter Description","Instagram Description","Youtube Description"};
    int images[] = {R.drawable.facebook,R.drawable.wa,R.drawable.tw,R.drawable.ig,R.drawable.yt};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView = findViewById(R.id.listview);
    }
    class MyAdapter extends ArrayAdapter<String>
        Contest contest;

}

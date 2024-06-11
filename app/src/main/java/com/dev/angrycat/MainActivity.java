package com.dev.angrycat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    MainAdapter adapter;
    RecyclerView rvItems;
    ArrayList<MainModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItems = findViewById(R.id.rvItems);

        setData();
        Collections.shuffle(list);
        adapter = new MainAdapter(this, list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        rvItems.setLayoutManager(gridLayoutManager);
        rvItems.setAdapter(adapter);
    }

    private void setData(){
        list.clear();
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("angry",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
        list.add(new MainModel("normal",R.drawable.normal));
    }
}
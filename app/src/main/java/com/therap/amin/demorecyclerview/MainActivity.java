package com.therap.amin.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<Data> datas = new ArrayList<>();
        datas.add(new Data("Explore By Division","Division"));
        datas.add(new Data("Explore By Type","Type"));
        datas.add(new Data("Browse Hotels","Hotels"));
        datas.add(new Data("Explore Tour Blog","Tour Blog"));
        datas.add(new Data("Explore Tour Timeline","Tour Timeline"));


        DataAdapter dataAdapter = new DataAdapter(datas,MainActivity.this);
        recyclerView.setAdapter(dataAdapter);
    }
}

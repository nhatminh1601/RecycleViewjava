package com.example.nguye.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Book> mData;
    RecycleviewAdapter rvbook;
    Toolbar toolbar;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.my_toobar);
        rv=findViewById(R.id.bookrv);
        setSupportActionBar(toolbar);
        GetAllData();
    }

    private void GetAllData() {
        mData=new ArrayList<>();
        mData.add(new Book("Book 1","người đẹp 1","đây là người đep 1",R.drawable.h1));
        mData.add(new Book("Book 2","người đẹp 2","đây là người đep 2",R.drawable.h2));
        mData.add(new Book("Book 3","người đẹp 3","đây là người đep 3",R.drawable.h3));
        mData.add(new Book("Book 4","người đẹp 4","đây là người đep 4",R.drawable.h4));
        mData.add(new Book("Book 5","người đẹp 5","đây là người đep 5",R.drawable.h5));
        mData.add(new Book("Book 1","người đẹp 1","đây là người đep 1",R.drawable.h1));
        mData.add(new Book("Book 2","người đẹp 2","đây là người đep 2",R.drawable.h2));
        mData.add(new Book("Book 3","người đẹp 3","đây là người đep 3",R.drawable.h3));
        mData.add(new Book("Book 4","người đẹp 4","đây là người đep 4",R.drawable.h4));
        mData.add(new Book("Book 5","người đẹp 5","đây là người đep 5",R.drawable.h5));
        mData.add(new Book("Book 1","người đẹp 1","đây là người đep 1",R.drawable.h1));
        mData.add(new Book("Book 2","người đẹp 2","đây là người đep 2",R.drawable.h2));
        mData.add(new Book("Book 3","người đẹp 3","đây là người đep 3",R.drawable.h3));
        mData.add(new Book("Book 4","người đẹp 4","đây là người đep 4",R.drawable.h4));
        mData.add(new Book("Book 5","người đẹp 5","đây là người đep 5",R.drawable.h5));
        mData.add(new Book("Book 1","người đẹp 1","đây là người đep 1",R.drawable.h1));
        mData.add(new Book("Book 2","người đẹp 2","đây là người đep 2",R.drawable.h2));
        mData.add(new Book("Book 3","người đẹp 3","đây là người đep 3",R.drawable.h3));
        mData.add(new Book("Book 4","người đẹp 4","đây là người đep 4",R.drawable.h4));
        mData.add(new Book("Book 5","người đẹp 5","đây là người đep 5",R.drawable.h5));
        mData.add(new Book("Book 1","người đẹp 1","đây là người đep 1",R.drawable.h1));
        mData.add(new Book("Book 2","người đẹp 2","đây là người đep 2",R.drawable.h2));
        mData.add(new Book("Book 3","người đẹp 3","đây là người đep 3",R.drawable.h3));
        mData.add(new Book("Book 4","người đẹp 4","đây là người đep 4",R.drawable.h4));
        mData.add(new Book("Book 5","người đẹp 5","đây là người đep 5",R.drawable.h5));
        mData.add(new Book("Book 1","người đẹp 1","đây là người đep 1",R.drawable.h1));
        mData.add(new Book("Book 2","người đẹp 2","đây là người đep 2",R.drawable.h2));
        mData.add(new Book("Book 3","người đẹp 3","đây là người đep 3",R.drawable.h3));
        mData.add(new Book("Book 4","người đẹp 4","đây là người đep 4",R.drawable.h4));
        mData.add(new Book("Book 5","người đẹp 5","đây là người đep 5",R.drawable.h5));
        rvbook=new RecycleviewAdapter(getApplicationContext(),mData);
        rv.setLayoutManager(new GridLayoutManager(this,3));
        rv.setAdapter(rvbook);

    }


}

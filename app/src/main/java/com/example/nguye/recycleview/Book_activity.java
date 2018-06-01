package com.example.nguye.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_activity extends AppCompatActivity {

    TextView title,category,description;
    ImageView imageView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_activity);
        title=findViewById(R.id.item_title);
        category=findViewById(R.id.item_category);
        description=findViewById(R.id.item_description);
        imageView=findViewById(R.id.book_item_thumbnail);
        intent=getIntent();
        Book data= (Book) intent.getSerializableExtra("data");
        imageView.setImageResource(data.getThumbnail());
        title.setText(data.getTitle());
        category.setText(data.getCategory());
        description.setText(data.getDescription());

    }
}

package com.example.nguye.recycleview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.BookView> {

    private Context context;
    private ArrayList<Book> mData;

    public RecycleviewAdapter(Context context, ArrayList<Book> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public BookView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        view=layoutInflater.inflate(R.layout.carview_item_book,parent,false);
        return new BookView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookView holder, final int position) {
        holder.tv_title.setText(mData.get(position).getTitle());
        holder.book_thumbnail.setImageResource(mData.get(position).getThumbnail());

        //set onclick líctener
       holder.cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(context,Book_activity.class);
               Book data=mData.get(position);
               intent.putExtra("data",data);
               context.startActivity(intent);
           }
       });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class BookView extends RecyclerView.ViewHolder{
        TextView tv_title;
        ImageView book_thumbnail;
        CardView cardView;
        public BookView(View itemView) {
            super(itemView);
            tv_title=itemView.findViewById(R.id.book_title);
            book_thumbnail=itemView.findViewById(R.id.book_img);
            cardView=itemView.findViewById(R.id.carviews);
        }
    }
}

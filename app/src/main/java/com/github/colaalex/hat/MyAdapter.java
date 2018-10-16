package com.github.colaalex.hat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    ArrayList<Team> data;

    public MyAdapter(ArrayList<Team> data){
        this.data = data;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_text_view, viewGroup, false);
        return new ViewHolder(v);

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String n = data.get(i).getName();
        Integer s = data.get(i).getScore();
        viewHolder.name.setText(n);
        viewHolder.score.setText(s.toString());
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView score;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
            score = itemView.findViewById(R.id.textView2);

        }
    }

}

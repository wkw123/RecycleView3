package com.example.administrator.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/10/20.
 */

public class Myadapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Person> persons;
    private Context context;
    private LayoutInflater inflater;

    public Myadapter(List<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.person, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Person person = persons.get(position);
        holder.getName().setText(person.getName());
        holder.getNumber().setText(person.getNumber());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private TextView number;

    public TextView getName() {
        return name;
    }

    public TextView getNumber() {
        return number;
    }

    public MyViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        number = (TextView) itemView.findViewById(R.id.number);
    }
}

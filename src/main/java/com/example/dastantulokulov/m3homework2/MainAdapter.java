package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements onViewHolderListener{

    ArrayList<Calculation> data;
    Main2Activity activity;

    public MainAdapter(ArrayList<Calculation> data) {
        this.data = data;
        //this.data = data;
        //data = new ArrayList<>();
        /*for (int i = 0; i < 200; i++) {
            data.add("Element N " + i);
        }*/

    }

    public void addElement(Calculation calculation) {
        //string = string + " " + data.size();
        data.add(calculation);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder viewHolder = new MainViewHolder(view);
        viewHolder.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position).result, (position));
//        String text = data.get(position);
//        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(int position) {
        Calculation calculation = data.get(position);
        Intent intent = new Intent(activity, Main3Activity.class );


//        Calculation calculation1 = new Calculation();
//        calculation.first= "";
//        calculation.second = "";
//        calculation.oparation ="";
//        calculation.result = "";

//        data.get(0).first = "";
//        data.get(0).second = "";
//        data.get(0).oparation = "";
//        data.get(0).result = "";

        //ArrayList<Calculation> calculations = new ArrayList<>();

        intent.putExtra("textKey", data);
        activity.startActivity(intent);
    }
}

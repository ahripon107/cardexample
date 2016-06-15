package com.therap.amin.demorecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by amin on 6/15/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    private ArrayList<Data> datas;
    private Context context;

    public DataAdapter(ArrayList<Data> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourcard,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.textView.setText(data.getTextView());
        holder.button.setText(data.getButtonText());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,holder.button.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        protected TextView textView;
        protected Button button;

        public DataViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tourTitle);
            button = (Button) itemView.findViewById(R.id.button2);
        }
    }
}



package com.example.gsontest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<TestJSON> list;
    private String city;


    public DataAdapter(ArrayList<TestJSON> list,String city) {
        this.city = city;
        this.list = list;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardrow, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {


        viewHolder.tv_name.setText("День" + i + " Город : " + city );

        viewHolder.max_temp.setText("Максимальная температура : " + list.get(i).getMaxTemp());
        viewHolder.min_temp.setText("Минимальная температура : "+list.get(i).getMinTemp());
        viewHolder.wind_speed.setText("Скорость ветра : " + list.get(i).getWindSpeed());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,max_temp,min_temp,wind_speed;
        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView)view.findViewById(R.id.tv_name);
            max_temp = (TextView)view.findViewById(R.id.max_temp);
            min_temp = (TextView)view.findViewById(R.id.min_temp);
            wind_speed = (TextView)view.findViewById(R.id.wind_speed);

        }
    }

}

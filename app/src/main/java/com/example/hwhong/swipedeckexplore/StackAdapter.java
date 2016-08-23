package com.example.hwhong.swipedeckexplore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hwhong on 8/23/16.
 */
public class StackAdapter extends BaseAdapter {

    private int[] imgArray;
    private List<String> data;
    private Context context;

    public StackAdapter(List<String> data, int[] array, Context context) {
        this.data = data;
        this.context = context;
        this.imgArray = array;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null){
            LayoutInflater inflater = LayoutInflater.from(context);

            v = inflater.inflate(R.layout.card, parent, false);
        }
        ((TextView) v.findViewById(R.id.textView)).setText(data.get(position));
        ((ImageView) v.findViewById(R.id.imageView)).setImageResource(imgArray[position]);

        return v;
    }
}

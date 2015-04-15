package com.example.lo.calendrier;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by léo on 13/04/2015.
 */
public class DayItem extends BaseAdapter {

    private Context context;
    /*private String[] values = {
            "Lun.","Mar.","Mer.","Jeu.","Ven.","Sam.","Dim."
    };*/
    private ArrayList<String> values;

    public DayItem(Context c)
    {
        this.context = c;
        values = new ArrayList<String>();
        values.add("Lun.");
        values.add("Mar.");
        values.add("Mer.");
        values.add("Jeu.");
        values.add("Ven.");
        values.add("Sam.");
        values.add("Dim.");
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item = inflater.inflate(R.layout.item_day, viewGroup, false);
        TextView tv = (TextView) item.findViewById(R.id.Day);
        tv.setText(values.get(position));

        return item;
    }

    public View setSelected(View view)
    {
        return null;
    }
}

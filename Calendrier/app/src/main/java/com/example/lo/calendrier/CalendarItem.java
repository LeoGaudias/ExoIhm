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
public class CalendarItem extends BaseAdapter {

    private Context context;
    //private ArrayList<String> values;

    public CalendarItem(Context c)
    {
        this.context = c;
        /*values = new ArrayList<String>();
        values.add();
        values.add();
        values.add();
        values.add();
        values.add();
        values.add();*/
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item = inflater.inflate(R.layout.item_calendrier, viewGroup, false);
        TextView numJ = (TextView) item.findViewById(R.id.NumJ);
        //numJ.setText(values.get(i));
        return null;
    }

    public View setSelected(View view)
    {
        return null;
    }
}

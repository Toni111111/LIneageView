package ru.flippy.lineageview;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tony on 2/04/17.
 */

public class AdapterHorizontal extends BaseAdapter {

    private  String[] dataObjects = new String[100];

    public AdapterHorizontal(String[] dataObjects) {
        this.dataObjects = dataObjects;



    }

    @Override
    public int getCount() {
        return dataObjects.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        View retval = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewitem, null);
        TextView title = (TextView) retval.findViewById(R.id.tittle);

        title.setText(dataObjects[position]);



        return retval;
    }

};



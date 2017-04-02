package ru.flippy.lineageview;

import android.app.*;
import android.graphics.Color;
import android.os.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        int value1[] = new int[100];
        String values[] = new String[100];

        for (int i = 0; i < 100; i++) {
            value1[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            values[i] = String.valueOf(value1[i]);
        }


        HorizontalListView listview = (HorizontalListView) findViewById(R.id.listview_horizontal);
        AdapterHorizontal adapterHorizontal = new AdapterHorizontal(values);
        listview.setAdapter(adapterHorizontal);

        listview.setClickable(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setBackgroundColor(Color.RED);
            }
        });



 /*   private BaseAdapter mAdapter = new BaseAdapter() {



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
        public View getView(int position, View convertView, ViewGroup parent) {
            View retval = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewitem, null);
            TextView title = (TextView) retval.findViewById(R.id.title);

            title.setText(dataObjects[position]);

            return retval;
        }

    };

*/
    }
}
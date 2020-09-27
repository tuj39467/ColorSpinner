package edu.temple.colorspinner;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        TextView textView = new TextView(context);
        textView.setText(getItem(position).toString());
        if(position == 1){
            textView.setBackgroundColor(Color.RED);
        }
        return textView;
    }
}

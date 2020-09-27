package edu.temple.colorspinner;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String[] colors;

    public ColorAdapter(Context context,String[] colors){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        final int[] colored = {Color.WHITE, Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.CYAN, Color.BLACK, Color.MAGENTA, Color.GRAY, Color.LTGRAY, Color.DKGRAY};

        TextView textView;
        if(convertView == null) {
            textView = new TextView(context);
        }
        else{
            textView = (TextView) convertView;
        }
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(colored[position % colored.length]);


        return textView;

    }
    public View getDropDownView(int position, View convertView, ViewGroup parent){
        return getView(position,convertView,parent);
    }
}

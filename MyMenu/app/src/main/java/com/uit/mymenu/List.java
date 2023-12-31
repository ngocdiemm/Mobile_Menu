package com.uit.mymenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class List extends CustomBaseAdapter {
    String[][] childrenList;
    public List(Context ctx, String[] listFood, int[] images, String[][] childrenList) {
        super(ctx,listFood,images);
        this.childrenList = childrenList;
    }

    @Override
    public boolean canClickItem() {
        return super.canClickItem();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =  inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.textView);
        TextView desTextView = (TextView) convertView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        nameTextView.setText (listFood[position]);
        desTextView.setText("Số món: " + childrenList[position].length);
        imageView.setImageResource(listImages[position]);
        return convertView;
    }
}

package com.uit.myexercise;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MenuAdapter extends BaseAdapter {

    private Activity activity;
    private int layout_dishes;

    private List<Menu.Dishes> dishesList;


    public MenuAdapter(Activity activity,int layout_dishes, List<Menu.Dishes> dishesList){
        this.activity = activity;
        this.layout_dishes = layout_dishes;
        this.dishesList = dishesList;
    }
    @Override
    public int getCount() {
        return dishesList.size();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    //Truyền từ item_name.xml vào Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.layout_dishes, null);
        Menu.Dishes dishes = dishesList.get(i);
        TextView tvDishes = view.findViewById(R.id.btnDishes);
        TextView tvQuantity = view.findViewById(R.id.tvDishQuantity);
        TextView tvDiscount = view.findViewById(R.id.tvDishDiscount);
        ImageView imgDishes = view.findViewById(R.id.imgDishes);

        tvDishes.setText(dishes.getDishes());
        tvQuantity.setText(dishes.getQuantity());
        tvDiscount.setText(dishes.getDiscount());
        imgDishes.setImageResource(dishes.getImages());
        return view;
    }
}

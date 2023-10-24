package com.uit.myexercise;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log; // Import Log

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    private ListView listView;
    ArrayList<Dishes> dishesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Log.d("Trạng thái", "on create");

        //Truyền Adapter vào Menu
        listView = (ListView)findViewById(R.id.menu);
        dishesList = new ArrayList<>();
        dishesList.add(new Dishes("Món mặn", "5 sản phẩm", "5 đang giảm giá", R.drawable.monman));
        dishesList.add(new Dishes("Món canh", "10 sản phẩm", "10 đang giảm giá", R.drawable.moncanh));
        dishesList.add(new Dishes("Món xào", "10 sản phẩm", "10 đang giảm giá", R.drawable.monxao));
        MenuAdapter adapter = new MenuAdapter(Menu.this, R.layout.layout_dishes, dishesList);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Trạng thái", "on start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Trạng thái", "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Trạng thái", "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Trạng thái", "on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Trạng thái", "on destroy");
    }
    public class Dishes {
        private String dishes;
        private String quantity;
        private String discount;
        private int images;

        public Dishes(String dishes, String quantity, String discount, int images) {
            this.dishes = dishes;
            this.quantity = quantity;
            this.discount = discount;
            this.images = images;
        }
        public String getDishes(){
            return dishes;
        }

        public void setDishes(String dishes) {
            this.dishes = dishes;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getDiscount(){
            return discount;
        }
        public void setDiscount(String discount) {
            this.discount = discount;
        }
        public int getImages(){
            return images;
        }

        public void setImages(int images) {
            this.images = images;
        }
    }
}



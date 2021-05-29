package com.snovia.orderfood;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.snovia.orderfood.Adapters.OrderAdapter;
import com.snovia.orderfood.Models.OrderModel;
import com.snovia.orderfood.databinding.ActivityOrderBinding;

import java.util.ArrayList;
import java.util.List;

import static android.view.View.*;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding orderBinding;
    DBHelper dbHelper;
    OrderAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        orderBinding=ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(orderBinding.getRoot());

        dbHelper=new DBHelper(this);
        ArrayList<OrderModel> list= dbHelper.getOrders();

        adapter=new OrderAdapter(list,this);
        orderBinding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        orderBinding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}
package com.snovia.orderfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import com.snovia.orderfood.Adapters.MainItemsAdapter;
import com.snovia.orderfood.Models.MainItemsModel;
import com.snovia.orderfood.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        ArrayList<MainItemsModel> itemList= new ArrayList<>();
        itemList.add(new MainItemsModel(R.drawable.pizzamain,"Pizza"));
        itemList.add(new MainItemsModel(R.drawable.burger,"Burger"));
        itemList.add(new MainItemsModel(R.drawable.wrapmain,"Wrap"));
        itemList.add(new MainItemsModel(R.drawable.pastamain,"Pasta"));
        itemList.add(new MainItemsModel(R.drawable.appetizers,"Appetizers"));
        itemList.add(new MainItemsModel(R.drawable.ricemain,"Rice"));
        itemList.add(new MainItemsModel(R.drawable.bbqmain,"BBQ"));
        itemList.add(new MainItemsModel(R.drawable.drinksmain,"Drinks"));
        itemList.add(new MainItemsModel(R.drawable.saladmain,"Salad"));
        itemList.add(new MainItemsModel(R.drawable.desserts,"Dessert"));

        MainItemsAdapter mainItemsAdapter= new MainItemsAdapter(itemList,this);
        mainBinding.MainItemsRecyclerView.setAdapter(mainItemsAdapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        mainBinding.MainItemsRecyclerView.setLayoutManager(gridLayoutManager);


    }
}
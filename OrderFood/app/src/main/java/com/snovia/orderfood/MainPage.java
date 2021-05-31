package com.snovia.orderfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.snovia.orderfood.Adapters.MainAdapter;
import com.snovia.orderfood.Models.MainModel;
import com.snovia.orderfood.databinding.ActivityMainPageBinding;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {

    ActivityMainPageBinding mainPageBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPageBinding=ActivityMainPageBinding.inflate(getLayoutInflater());
        setContentView(mainPageBinding.getRoot());

        ArrayList<MainModel> list=new ArrayList<>();
        Bundle bundle=getIntent().getExtras();
        if(bundle.getString("name").equals("pizza")){
            list.add(new MainModel(R.drawable.creamysupermax,"Creamy Supermax Pizza","399","Creamy Sauce, Spicy Chicken, Mushrooms, Jalapenos & Cheese"));
            list.add(new MainModel(R.drawable.perimax,"Perimax Pizza","399","Garlic Sauce, Spicy Chicken, Olives, Jalapenos, Capsicum, Mushrooms, Cheese & Topped with Garlic Sauce"));
            list.add(new MainModel(R.drawable.spicyitalian,"Spicy Italian Pizza","399","Tomato Sauce, Spicy Chicken, Jalapenos, Capsicum, Mushrooms, Olives & Cheese"));
            list.add(new MainModel(R.drawable.italianlight,"Italian Light Pizza","399","Tomato Sauce, Chicken Sausages, Afghani Chicken, Mushroom, Capsicum, Olives, Tomatoes & Cheese"));
            list.add(new MainModel(R.drawable.fajita,"Chicken Fajita Pizza","350","Tomato Sauce, Spicy Chicken, Onions, Capsicum & Cheese"));
            list.add(new MainModel(R.drawable.malaiboti,"Malai Boti Pizza","350","Garlic Sauce, Malai Chicken, Onions, Mushrooms, Capsicum, Cheese & Topped with Garlic Sauce"));
        }
        else if(bundle.getString("name").equals("burger")){
            list.add(new MainModel(R.drawable.zinger_burger,"Zinger Burger","5","Chicken Burger with special cheese"));
            list.add(new MainModel(R.drawable.jalpenobuz,"Jalapeno Burger","431.03","A crispy chicken burger with chicken pepperonis, jalapeno, ice berg and lab's special sauce"));
            list.add(new MainModel(R.drawable.quadareloaded,"Quadra Reloaded","724.14","4 smashed beef paties with melted cheese topped with crispy onion rings, grilled mushrooms, smoke and BBQ sauces"));
            list.add(new MainModel(R.drawable.chickensuppremo,"Chicken Supremo","499","Crispy thigh fillet with cheddar cheese sauce, jalapenos & onion fries"));
            list.add(new MainModel(R.drawable.spicygrandchicken,"Spicy Grand Chicken","970","Sizzling Spicy Grand Chicken patty dressed with Emmental cheese slice, 2 tomato slices with shredded lettuce and Dejon sauce clubbed in grand corn meal bun"));
        }
        else if(bundle.getString("name").equals("wrap")){
            list.add(new MainModel(R.drawable.caesarsaladwrap,"Caesar Salad Wrap","365.50","Grilled chicken, iceberg, caesar dressing, croutons & olives"));
            list.add(new MainModel(R.drawable.crazyzingerwrap,"Crazy Zinger Wrap","365.50","Zinger fillet, bologna slice, iceberg, tomatoes, sauces & cheese slice"));
            list.add(new MainModel(R.drawable.lavawrap,"Lava Beef Loaded Wrap","501.50","Grilled beef patty, iceberg, sauces, onions, mozzarella stick, bologna slice & cheese slice"));
            list.add(new MainModel(R.drawable.tenderfillet,"Tender Fillet Wrap","365.50","Chicken tenders, iceberg, tomatoes, jalapenos, sauces & cheese slice"));
            list.add(new MainModel(R.drawable.sigbeefloadedwrap,"Signature Beef Loaded Wrap","399.50","Grilled beef patty, iceberg, onions, sauces & cheese slice"));

        }
        else if(bundle.getString("name").equals("pasta")){
            list.add(new MainModel(R.drawable.creamypastapng,"Creamy Pasta","499","Creamy Sauce, Pasta, Chicken Tikka, Cheese, Capsicum, Sweet Corn & Mushrooms; Served with Garlic Bread"));
            list.add(new MainModel(R.drawable.chickenpasta,"Chicken Pasta","499","White Sauce, Pasta, Chicken Tikka, Cheese, Capsicum, Sweet Corn & Mushrooms; Served with Garlic Bread"));
            list.add(new MainModel(R.drawable.creamylasagne,"Creamy Lasagne","499","Creamy Sauce, Chicken Tikka, 4 Long Strips of Lasagne Filled with Cheese & Mushrooms; Served with Garlic Bread"));
            list.add(new MainModel(R.drawable.chickenlasagne,"Chicken Lasagne","499","White Sauce, Chicken Tikka, 4 Long Strips of Lasagne Filled with Cheese & Mushrooms; Served with Garlic Bread"));
            list.add(new MainModel(R.drawable.beeflasagne,"Beef Lasagne","499","Red Sauce, Marinated Beef, 4 Long Strips of Lasagne Filled with Cheese & Mushrooms; Served with Garlic Bread"));
            list.add(new MainModel(R.drawable.chickenspaghtte,"Chicken Spaghetti","499","White Sauce, Chicken Tikka, Noodles Filled with Cheese, Capsicum & Mushrooms; Served with Garlic Bread"));
        }
        else if(bundle.getString("name").equals("appetizers")){
            list.add(new MainModel(R.drawable.creamybread,"Cheese Garlic Bread","299","4PCS served with Dip Sauce"));
            list.add(new MainModel(R.drawable.nuggets,"Chicken Nuggets","250","5PCS & 12PCS served with Dip Sauce"));
            list.add(new MainModel(R.drawable.wings,"Chicken Wings","350","6PCS & 12PCS served with Dip Sauce"));
            list.add(new MainModel(R.drawable.mozzrelasticks,"Mozzarella Sticks","299","4 PCS served with Dip Sauce"));
            list.add(new MainModel(R.drawable.fries,"French Fries","199","Large Portion served with Dip Sauce"));
            list.add(new MainModel(R.drawable.garlicdip,"Garlic DIP","30","DIP Sauce"));
        }
        else if(bundle.getString("name").equals("rice")){
            list.add(new MainModel(R.drawable.chickenbiryani,"Chicken Biryani","102","Single/Double"));
            list.add(new MainModel(R.drawable.sadarice,"Sada Biryani","68","Single/Full"));
            list.add(new MainModel(R.drawable.palao,"Palao","91","Single/Full"));
            list.add(new MainModel(R.drawable.chickenfriedrice,"Chicken Fried Rice","113","Single/Full"));
            list.add(new MainModel(R.drawable.eggfriedrice,"Egg Fried Rice","113","Single/Full"));
        }
        else if(bundle.getString("name").equals("bbq")){
            list.add(new MainModel(R.drawable.khoyakabab,"Chicken Khoya Kabab","425","Serves 2-4 Person"));
            list.add(new MainModel(R.drawable.beefkhoya,"Beef Khoya Kabab","450.50","Serves 2-4 Person, raita & chutney imli aloo bukhara"));
            list.add(new MainModel(R.drawable.chikentikka,"Chicken Tikka","365.50","Serves 2-4 Person , raita & chutney imli aloo bukhara"));
            list.add(new MainModel(R.drawable.chickenlegpiece,"Chicken Leg Piece","212.50","Serves 1"));
            list.add(new MainModel(R.drawable.kastooribooti,"Special Kastoori Boti","408","Serves 2-4 Person"));
        }
        else if(bundle.getString("name").equals("drinks")){
            list.add(new MainModel(R.drawable.pepsi,"Pepsi","60","Single Serving"));
            list.add(new MainModel(R.drawable.sevenup,"7up","60","Single Serving"));
            list.add(new MainModel(R.drawable.mirinda,"Mirinda","60","Single Serving"));
            list.add(new MainModel(R.drawable.mountaindew,"MountainDew","60","Single Serving"));
            list.add(new MainModel(R.drawable.mineralwater,"Mineral Water (Aquafina)","90","Single Serving"));
            list.add(new MainModel(R.drawable.pineapple,"Pineapple Juice","120","Single Serving"));
            list.add(new MainModel(R.drawable.orange,"Orange Juice","120","Single Serving"));
            list.add(new MainModel(R.drawable.falsa,"Falsa Juice","120","Single Serving"));
        }
        else if(bundle.getString("name").equals("salad")){
            list.add(new MainModel(R.drawable.caesarsalad,"Caesar Salad","799","Grilled chicken, crispy iceberg, olives, parmesan & croutons"));
            list.add(new MainModel(R.drawable.torrilasalad,"Tortilla Salad","1090","Main. Stewed beef, salsa, corn kernels & sour cream"));
            list.add(new MainModel(R.drawable.tossedsalad,"Tossed Salad","455","Classic mixed greens, vegetables & Italian dressing"));
        }
        else if(bundle.getString("name").equals("dessert")){
            list.add(new MainModel(R.drawable.biscoffeclairs,"Biscoff Eclairs","180","Piece"));
            list.add(new MainModel(R.drawable.doublechoclatecake,"Double Choclate Cake","699","1 pound"));
            list.add(new MainModel(R.drawable.stawberrychoclate,"Strawberry Chocolate Cake","699","1 pound"));
            list.add(new MainModel(R.drawable.chocolateicecream,"Chocolate Icecream","799","800ml"));
            list.add(new MainModel(R.drawable.pineappleicecream,"Pineapple Icecream","799","800ml"));
            list.add(new MainModel(R.drawable.pistaicecream,"Pista Icecream","799","800ml"));
            list.add(new MainModel(R.drawable.donuts,"Doughnuts","120","Piece"));
            list.add(new MainModel(R.drawable.strawberrysundae,"Strawberry Sundae","300","Serves 1"));
            list.add(new MainModel(R.drawable.sundaes,"Chocolate with Brownie Sundae","300","Serves 1"));
            list.add(new MainModel(R.drawable.choclatefudgesundae,"Chocolate Fudge Sundae","300","Serves 1"));
            list.add(new MainModel(R.drawable.oreoblizards,"Oreo Blizzards","300","Serves 1"));
        }

        MainAdapter mainAdapter=new MainAdapter(list,this);
        mainPageBinding.MainPageRecyclerView.setAdapter(mainAdapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        mainPageBinding.MainPageRecyclerView.setLayoutManager(linearLayoutManager);

        mainPageBinding.MainPageSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mainAdapter.getFilter().filter(newText.toString());
                return false;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu cart) {
        getMenuInflater().inflate(R.menu.order_btn,cart);
        return super.onCreateOptionsMenu(cart);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainPage.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
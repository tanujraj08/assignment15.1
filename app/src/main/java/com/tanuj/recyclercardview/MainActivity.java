package com.tanuj.recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type Cast XML Object to Recycler View Java Object.
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        // Assign Data to ItemsData Collection
        ItemData[] itemDatas = {
                new ItemData("Alpha"),
                new ItemData("Beta"),
                new ItemData("CupCake"),
                new ItemData("Donut"),
                new ItemData("Eclair"),
                new ItemData("Froyo"),
                new ItemData("Gingerbread"),
                new ItemData("Honeycomb"),
                new ItemData("Ice Cream Sandwich"),
                new ItemData("Jelly Bean"),
                new ItemData("KitKat"),
                new ItemData("Lollipop"),
                new ItemData("Marshmallow"),
                new ItemData("Nougat"),
                new ItemData("Oreo"),
        };

        // Set layout to Recycler View.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create Object of Custom Adapter and Initialize with ItemData Class Object.
        CustomAdapter customAdapter = new CustomAdapter(itemDatas);

        // Set Custom Adapter to Recycler View Object.
        recyclerView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate Menu to Display Options Menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Show Toast On Each Menu Item Click.
        Toast.makeText(this, item.getTitle() + " Clicked", Toast.LENGTH_SHORT).show();

        return true;
    }
}




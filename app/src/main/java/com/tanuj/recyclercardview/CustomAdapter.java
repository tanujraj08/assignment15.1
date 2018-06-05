package com.tanuj.recyclercardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    // Item Data Object Collection.
    private ItemData[] itemData;

    // Create Constructor which will assign data to ItemData Variable.
    public CustomAdapter(ItemData[] itemData) {
        this.itemData = itemData;
    }

    // Override OnCreateView Holder Method which will assign the Layout to Recycler View.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Inflate Layout to display number of rows based on the available data in Item Data Collection.
        View itemLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.version_row,null,false);

        // Set The Layout to ViewHolder
        ViewHolder viewHolder = new ViewHolder(itemLayout);

        // return view holder.
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // On Bind View Holder set Android Version Name text to TextView.
        holder.nameTextView.setText(itemData[position].getAndroidVersionName());
    }


    // Return Item Data Array Count.
    @Override
    public int getItemCount() {
        return itemData.length;
    }


    // Create View HOlder Extends from RecyclerView View Holder Class
    public class ViewHolder extends RecyclerView.ViewHolder{

        // Create TextView Type Object.
        public TextView nameTextView;

        // View Holder class Constructor
        public ViewHolder(View itemView) {
            super(itemView);
            // TypeCast as Java Object TextView From version_row.xml
            nameTextView = itemView.findViewById(R.id.versionNameTextView);
        }
    }
}



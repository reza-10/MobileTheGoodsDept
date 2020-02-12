package com.example.thegoodsdept;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    private List<TshirtData> tshirtDataList;

    public RecyclerViewAdapter(List<TshirtData> tshirtDataList){
        this.tshirtDataList = tshirtDataList;
    }

    public RecyclerViewAdapter() {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return tshirtDataList.size();
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView mProductImage;
        private TextView mProductName;
        private TextView mProductPrice;

        public ListViewHolder(View itemView){

            super(itemView);
            mProductImage = (ImageView) itemView.findViewById(R.id.ProductImage);
            mProductName = (TextView) itemView.findViewById(R.id.ProductName);
            mProductPrice = (TextView) itemView.findViewById(R.id.ProductPrice);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position){
            TshirtData td = tshirtDataList.get(position);
            mProductImage.setImageResource(td.getProductImage());
            mProductName.setText(td.getProductName());
            mProductPrice.setText(td.getProductPrice());
        }

        @Override
        public void onClick(View view) {

        }
    }
}

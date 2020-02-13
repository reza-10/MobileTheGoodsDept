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

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<TshirtData> tshirtDataList;

    public RecyclerViewAdapter(List<TshirtData> tshirtDataList) {
        this.tshirtDataList = tshirtDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TshirtData td = tshirtDataList.get(position);
        Picasso.get().load(td.getProductImage()).into(holder.mProductImage);
        holder.mProductName.setText(td.getProductName());
        holder.mProductPrice.setText(td.getProductPrice());
    }

    @Override
    public int getItemCount() {
        return tshirtDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements com.example.thegoodsdept.ViewHolder {

        private ImageView mProductImage;
        private TextView mProductName;
        private TextView mProductPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mProductImage = itemView.findViewById(R.id.ProductImage);
            mProductName = itemView.findViewById(R.id.ProductName);
            mProductPrice = itemView.findViewById(R.id.ProductPrice);
        }
    }
}

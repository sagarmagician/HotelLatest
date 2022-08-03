package com.example.thehotel2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.myviewHolder>{
    private ArrayList<Hotel> hotelArrayList;
    Context context;

    public recyclerAdapter(ArrayList<Hotel> hotelArrayList1, Context context){
        this.hotelArrayList = hotelArrayList1;
        this.context = context;
    }


    @NonNull
    @Override
    public recyclerAdapter.myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.samplehotelitem, parent, false);
        return new myviewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.myviewHolder holder, int position) {
        final Hotel hotel = hotelArrayList.get(position);
        holder.imageView.setImageResource(hotel.getHotelImage());
        holder.name.setText(hotel.getHotelName());
        holder.price.setText(hotel.getPrice());
        holder.withsc.setText(hotel.getWithsc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ContactSoon.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hotelArrayList.size();
    }

    public class myviewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView price;
        private TextView withsc;
        private ImageView imageView;

        public myviewHolder(final View view){
            super(view);
            name = view.findViewById(R.id.hotelname);
            price = view.findViewById(R.id.price);
            withsc = view.findViewById(R.id.withsc);
            imageView = view.findViewById(R.id.imageView);
        }
    }
}

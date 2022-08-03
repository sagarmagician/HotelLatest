 package com.example.thehotel2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView2);

        ArrayList<Hotel> hotelArrayList = new ArrayList<>();

        hotelArrayList.add(new Hotel(R.drawable.hotel1, "per day with out ac 10000 ",  "SAI KRISHNA", "per day with ac 16000"));
        hotelArrayList.add(new Hotel(R.drawable.hotel2, "per day with out ac 9500", "SAI SURYA", "per day with ac 15000"));
        hotelArrayList.add(new Hotel(R.drawable.jag, "per day without ac 8400", "SATYA RESIDENT", "per day with ac 16050"));
        hotelArrayList.add(new Hotel(R.drawable.satya, "per day without ac 8000", "JAGANATH PALACH", "per day with ac 20000"));
        hotelArrayList.add(new Hotel(R.drawable.xyz2, "per day without ac 9000", "HOTEL HIGHWAY", "per day with ac 50000"));
        hotelArrayList.add(new Hotel(R.drawable.xyz3, "per day without ac 1500", "THE GREEN STAR", "per day with ac 15050"));


        recyclerAdapter adapter = new recyclerAdapter(hotelArrayList, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
package com.example.bt5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ListView lvCountry;
        ArrayList<country> arrayCountry;
        country_adapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            AnhXa();

            adapter = new country_adapter(this,R.layout.dong_country,arrayCountry);
            lvCountry.setAdapter(adapter);
        }
        private void  AnhXa(){
            lvCountry = (ListView) findViewById(R.id.listViewcountry);
            arrayCountry = new ArrayList<>();
            arrayCountry.add(new country("Việt Nam","Xứ sở hoa sen",R.drawable.vietnam));
            arrayCountry.add(new country("Canada","Xứ sở lá phong",R.drawable.canada));
            arrayCountry.add(new country("Thái lan","Xứ sở chùa vàng",R.drawable.thailan));
            arrayCountry.add(new country("Philippin","Xứ sở nghìn đảo",R.drawable.philippine));
            arrayCountry.add(new country("Anh","Xứ sở sương mù",R.drawable.anh));
        }
    }
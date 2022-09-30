package com.example.bt5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

    public class country_adapter extends BaseAdapter {
        private Context context;
        private int layout;
        private List<country> countryList;



        public country_adapter(Context context, int layout, List<country>  countryList) {
            this.context = context;
            this.layout = layout;
            this. countryList =  countryList;
        }

        @Override
        public int getCount() {
            return  countryList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        private class ViewHolder{
            ImageView intHinh ;
            TextView txtTen,txtMoTa;

        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {

            ViewHolder holder;
            if(view == null ){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view  = inflater.inflate(layout, null);
                holder = new ViewHolder();
                holder.txtTen = (TextView) view.findViewById(R.id.textview1);
                holder.txtMoTa = (TextView) view.findViewById(R.id.textview2);
                holder.intHinh = (ImageView) view.findViewById(R.id.image1);
                view.setTag(holder);


            }else{
                holder = (ViewHolder) view.getTag();
            }

            country ct =  countryList.get(position);
            holder.txtTen.setText(ct.getTen());
            holder.txtMoTa.setText(ct.getMoTa());
            holder.intHinh.setImageResource(ct.getHinh());


            return view;
        }
    }

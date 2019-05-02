package com.example.suresh.privateproject.notificationtm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.suresh.privateproject.R;

import java.util.ArrayList;

public class CustomNotificationGridAdapter extends BaseAdapter {

    private ArrayList<MenuItemModel> items;

    public CustomNotificationGridAdapter(ArrayList<MenuItemModel> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_menu_item,null);
            holder = new CustomHolder();
            holder.imageView = convertView.findViewById(R.id.imageView3);
            holder.textView = convertView.findViewById(R.id.textView2);
            convertView.setTag(holder);

        }else{
            holder = (CustomHolder) convertView.getTag();
        }
        holder.textView.setText(items.get(position).getItemName());
        holder.textView.setTextColor(items.get(position).getColor());
        holder.imageView.setImageResource(items.get(position).getImage());

        return convertView;
    }

    class CustomHolder{

        TextView textView;
        ImageView imageView;


    }

}

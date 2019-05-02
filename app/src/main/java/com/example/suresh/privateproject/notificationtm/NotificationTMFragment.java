package com.example.suresh.privateproject.notificationtm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.suresh.privateproject.R;
import com.example.suresh.privateproject.approval.ApprovalFragment;
import com.example.suresh.privateproject.databinding.LayoutNotificationTmBinding;

import java.util.ArrayList;

public class NotificationTMFragment extends Fragment {

    private ArrayList<MenuItemModel> items;
    private CustomNotificationGridAdapter adapter;
    private LayoutNotificationTmBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.layout_notification_tm,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        items = new ArrayList<>();
        items.add(new MenuItemModel(getResources().getString(R.string.approval),true,getResources().getColor(R.color.orange),R.drawable.approvals_icon));
        items.add(new MenuItemModel(getResources().getString(R.string.orders),true,getResources().getColor(R.color.light_red),R.drawable.orders_icon));
        items.add(new MenuItemModel(getResources().getString(R.string.assistance),true,getResources().getColor(R.color.light_pink),R.drawable.assistance_icon));
        items.add(new MenuItemModel(getResources().getString(R.string.devices),true,getResources().getColor(R.color.pink),R.drawable.device_icon));
        items.add(new MenuItemModel(getResources().getString(R.string.customers),true,getResources().getColor(R.color.pink),R.drawable.customers_icon));

        adapter = new CustomNotificationGridAdapter(items);
        binding.gridview.setAdapter(adapter);
        binding.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new ApprovalFragment()).addToBackStack("").commit();
            }
        });
    }



}

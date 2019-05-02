package com.example.suresh.privateproject.notificationtm;

public class MenuItemModel {

    private String itemName;
    private boolean isActive;
    private int color;
    private int image;

    public MenuItemModel(String itemName,boolean isActive,int color,int image){
        this.itemName = itemName;
        this.isActive = isActive;
        this.image = image;
        this.color = color;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getColor() {
        return color;
    }

    public int getImage() {
        return image;
    }
}

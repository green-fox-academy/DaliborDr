package webshop.webshop.models;

import javax.swing.*;

public class ShopItem {
    private String name;
    private String description;
    private int price;
    private int quantityOfStock;

    public int getQuantityOfStock() {
        return quantityOfStock;
    }



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }




    public ShopItem(String name, String description, int price,int quantityOfStock ) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }


}

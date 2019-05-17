package webshop.webshop.models;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ShopItemStore {
    private List<ShopItem> shopItemList;

    public ShopItemStore() {
        this.shopItemList = new ArrayList<>();
        shopItemList.add(new ShopItem("Running Shoes", "Nike running shoes for every day sport", 1000, 5));
        shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
        shopItemList.add(new ShopItem("Coca Cola", "0,5l standard coke", 25, 0));
        shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        shopItemList.add(new ShopItem("T-shirt", "Blue with corgi on a bike", 300, 1));
    }
    public List<ShopItem> getOnlyAvailable() {
        List<ShopItem> listOfAvailableItems = new ArrayList<>();
        listOfAvailableItems = shopItemList.stream().filter(shopItem -> shopItem.getQuantityOfStock() > 0).collect(Collectors.toList());
        return listOfAvailableItems;
    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public List<ShopItem> getCheapestFirst() {
        List result = shopItemList.stream().sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).collect(Collectors.toList());
        return result;
    }

    public List<ShopItem> getContainsNike() {
        List result = shopItemList.stream().filter(shopItem -> shopItem.getDescription().contains("Nike")).collect(Collectors.toList());
        return result;
    }

    public Double getAverage() {
        Double average = shopItemList.stream().mapToInt(shopItemList -> shopItemList.getQuantityOfStock()).average().getAsDouble();
        return average;
    }

    public List<ShopItem> getMostExpensive() {
        Integer max = shopItemList
                .stream()
                .mapToInt(v -> v.getPrice())
                .max().orElseThrow(NoSuchElementException::new);
        List mostExepnsiveList = shopItemList.stream().filter(shopItem -> shopItem.getPrice()== max).collect(Collectors.toList());
        return mostExepnsiveList;
    }
}

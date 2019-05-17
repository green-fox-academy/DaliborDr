package webshop.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webshop.webshop.models.ShopItemStore;

@Controller
public class ProduceListController {
    ShopItemStore shopItemStore = new ShopItemStore();

    @RequestMapping("/web")
    public String showList(Model model) {
        model.addAttribute("myItems",shopItemStore.getShopItemList());
        return "WebShop";
    }

    @RequestMapping("/web/only-available")
    public String showAvailableList(Model model) {
        model.addAttribute("myItems",shopItemStore.getOnlyAvailable());
        return "WebShop";
    }

    @RequestMapping("/web/cheapest-first")
    public String showCheapestFirst(Model model) {
        model.addAttribute("myItems",shopItemStore.getCheapestFirst());
        return "WebShop";
    }

    @RequestMapping("/web/contains-nike")
    public String showContainsNike(Model model) {
        model.addAttribute("myItems",shopItemStore.getContainsNike());
        return "WebShop";
    }

    @RequestMapping("/web/average-stock")
    public String showAverageStock(Model model) {
        model.addAttribute("myItems",shopItemStore.getAverage());
        return "WebShopAverage";
    }

    @RequestMapping("/web/most-expensive")
    public String showMostExpensive(Model model) {
        model.addAttribute("myItems", shopItemStore.getMostExpensive());
        return "WebShop";
    }


}

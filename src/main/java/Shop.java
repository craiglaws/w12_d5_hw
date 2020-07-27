import items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;
    private String name;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getStock() {
        return stock;
    }

    public void addToStock(Item item){
        this.stock.add(item);
    }

    public void removeFromStock(Item item){
        int index = stock.indexOf(item);
        this.stock.remove(index);
    }

    public double calculateTotalMarkUp(){
        double total = 0;
        for (Item item : stock){
            total += item.calculateMarkUp();
        }
        return total;
    }


}

package R08_OOP.TJMaxx;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TJMaxx {


    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;


    public TJMaxx() {
        this.regularItems = new ArrayList<>();
        this.onSaleItems = new ArrayList<>();
    }


    public void addRegularItem(Item... item) {
        regularItems.addAll(Arrays.asList(item));
    }


    public void addOnSaleItem(OnSaleItem... item) {
        onSaleItems.addAll(Arrays.asList(item));
    }

    public List<Item> getRegularItems() {
        return regularItems;
    }

    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    public int regularItemsCount() {
        return regularItems.size();
    }

    public int onSaleItemsCount() {
        return onSaleItems.size();
    }


    public List<String> getAllItemNames() {
        List<String> names;
        names = regularItems.stream()
                .map(Item::getName)
                .collect(Collectors.toList());
        names.addAll(onSaleItems.stream()
                .map(Item::getName)
                .collect(Collectors.toList()));
        return names;
    }

    public double getItemPrice(int catalogNumber) {
        double price = 0;
        for (int i = 0, j = 0; i < regularItems.size() || j < onSaleItems.size(); i++, j++) {
            if (i < regularItems.size() && regularItems.get(i).getCatalogNumber() == catalogNumber) {
                price = regularItems.get(i).getPrice();
                break;
            }
            if (j < onSaleItems.size() && onSaleItems.get(j).getCatalogNumber() == catalogNumber) {
                price = onSaleItems.get(j).getPrice();
                break;
            }
        }
        return price;
    }

    public OnSaleItem getOnSaleItem(String name) { // if it doesn't exist this method returns null
        return onSaleItems.stream()
                .filter(item -> item.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public void removeItem(int catalogNumber) {
        regularItems.removeIf(item -> item.getCatalogNumber() == catalogNumber);
        onSaleItems.removeIf(item -> item.getCatalogNumber() == catalogNumber);
    }

    public void buyItem(int catalogNumber) {
        for (int i = 0, j = 0; i < regularItems.size() || j < onSaleItems.size(); i++, j++) {
            if (i < regularItems.size() && regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.get(i).setQuantity(regularItems.get(i).getQuantity() - 1);
                if (regularItems.get(i).getQuantity() == 0) {
                    removeItem(catalogNumber);
                }
            }
            if (j < onSaleItems.size() && onSaleItems.get(j).getCatalogNumber() == catalogNumber) {
                onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity() - 1);
                if (onSaleItems.get(i).getQuantity() == 0) {
                    removeItem(catalogNumber);
                }
            }
        }
    }
}
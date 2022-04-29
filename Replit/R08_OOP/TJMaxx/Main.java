package R08_OOP.TJMaxx;

public class Main {
    public static void main(String[] args) {
        TJMaxx store = new TJMaxx();

        Item i1 = new Item("item1", 1, 3, 10);
        Item i2 = new Item("item2", 2, 3, 20);
        Item i3 = new Item("item3", 3, 3, 30);
        Item i4 = new Item("item4", 4, 3, 40);
        Item i5 = new Item("item5", 5, 3, 50);
        Item i6 = new Item("item6", 6, 3, 60);
        Item i7 = new Item("item7", 7, 3, 70);

        OnSaleItem saleItem1 = new OnSaleItem("saleItem1", 11, 3, 11, 10);
        OnSaleItem saleItem2 = new OnSaleItem("saleItem2", 12, 3, 12, 20);
        OnSaleItem saleItem3 = new OnSaleItem("saleItem3", 13, 3, 13, 30);

        store.addRegularItem(i1, i2, i3, i4, i5, i6, i7);
        store.addOnSaleItem(saleItem1, saleItem2, saleItem3);

        System.out.println(store.getItemPrice(4));

        System.out.println(store.getOnSaleItem(saleItem1.getName()).getDiscount());
    }
}

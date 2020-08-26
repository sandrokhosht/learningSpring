package org.example;

public class Market {

    private Item item;
    private int tax;

    // IoC
    public Market(Item item){
        this.item=item;
    }
    public Market(){ }

    public void sellItem() {
        System.out.println("Sold " + item.getItemName());
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}

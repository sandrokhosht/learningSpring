package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Market {

    @Autowired
    private Item item;

    private int tax;


    public Market(Item item){
        this.item=item;
    }
    public Market(){

    }


    public void setItem(Item item) {
        this.item = item;
    }

    public String sellItem() {
        return "Sold - " + item.getItemName();
    }



    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}

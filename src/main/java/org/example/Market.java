package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Market {
    private Item item1;
    private Item item2;


    @Autowired
    public Market(@Qualifier("keyboard") Item item1, @Qualifier("mouse") Item item2){
        this.item1=item1;
        this.item2=item2;
    }





    public String sellItem() {
        return "Sold - " + item1.getItemName() + " and " + item2.getItemName();
    }




}

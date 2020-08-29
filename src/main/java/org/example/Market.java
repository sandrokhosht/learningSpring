package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Market {
    private Item item1;
    private Item item2;

    @Value("${market.tax}")
    private int tax;

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Autowired
    public Market(@Qualifier("keyboard") Item item1, @Qualifier("keyboard") Item item2){
        this.item1=item1;
        this.item2=item2;
    }





    public String sellItem() {
        return "Sold - " + item1.getItemName() + " and " + item2.getItemName();
    }




}

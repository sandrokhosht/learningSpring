package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private int id;
    private Market market;

    @Autowired
    public Company(Market market) {
        this.id=1;
        this.market = market;
    }

    @Override
    public String toString() {
        return "Company " + id + " | " + market.sellItem();
    }
}

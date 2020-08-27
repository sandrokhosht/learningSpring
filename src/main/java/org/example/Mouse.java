package org.example;

import org.springframework.stereotype.Component;

@Component
public class Mouse implements Item {
    public String getItemName() {
        return "Mouse";
    }
}

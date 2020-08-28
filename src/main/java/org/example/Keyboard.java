package org.example;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements Item {
    public String getItemName() {
        return "Keyboard";
    }
}

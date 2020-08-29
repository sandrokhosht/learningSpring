package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Mouse implements Item {
    public String getItemName() {
        return "Mouse";
    }
}

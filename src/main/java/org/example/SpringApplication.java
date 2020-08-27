package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        // Market market = new Market(new Mouse());   Default

        // DI
        Item item = context.getBean("mouse", Item.class);
        Market market = new Market(item);
        market.sellItem();


        context.close();
    }
}

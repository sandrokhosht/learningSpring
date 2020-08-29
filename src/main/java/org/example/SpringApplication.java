package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


       /* Company company = context.getBean("company",Company.class);

        System.out.println(company);*/

        Market market = context.getBean("market",Market.class);

        System.out.println(market.getTax() + "%");

        Market market1 = context.getBean("market",Market.class);
        Market market2 = context.getBean("market",Market.class);



        System.out.println(market1==market2);


        context.close();
    }
}

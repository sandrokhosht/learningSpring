package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        // Market market = new Market(new Mouse());   Default

        // DI
      //  Market market = context.getBean("market", Market.class);

        Company company= context.getBean("company",Company.class);

        System.out.println(company);


        context.close();
    }
}

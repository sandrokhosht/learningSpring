package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        Company company = context.getBean("company",Company.class);

        System.out.println(company);


        context.close();
    }
}

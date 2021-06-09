package com.how2java.test;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;
public class TestSpring {
    public static void main(String[] args) {
        //test1();
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        ProductService s = (ProductService) context.getBean("s");
        s.doit();
    }

    public static void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

        Category c = (Category) context.getBean("c");

        Product p = (Product) context.getBean("glue") ;
        System.out.println(p.getPrice());
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());

        System.out.println(c.getName());
    }
}

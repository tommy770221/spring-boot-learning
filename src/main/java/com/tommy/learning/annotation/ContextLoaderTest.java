package com.tommy.learning.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoaderTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigAll.class);
        Car car=(Car) context.getBean("toyota");
        car.print();
        Car car1=(Car) context.getBean("bmw");
        car1.print();

    }
}

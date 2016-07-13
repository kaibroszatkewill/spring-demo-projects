package com.kewill.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
   public static void main(String[] args) {
      ApplicationContext context = 
              new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
      
      MyService serviceInstance = (MyService) context.getBean("myService");

      System.out.println(serviceInstance.getMyProperty());
   }
}
package com.example.pluralsightspringaop2022;

import com.example.pluralsightspringaop2022.repository.PassengerDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PluralSightSpringAop2022Application {

    public static void main(String[] args) {
        //SpringApplication.run(PluralSightSpringAop2022Application.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        System.out.println(passengerDao.getPassenger(1));
        context.close();
    }

}

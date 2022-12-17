package com.example.testapp;

import com.example.testapp.models.ArithmeticExp;
import com.example.testapp.repositories.ArithmeticExpRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
    }
        private final ArithmeticExpRepository arithmeticExpRepository;

    public TestAppApplication(ArithmeticExpRepository arithmeticExpRepository) {
        this.arithmeticExpRepository = arithmeticExpRepository;
    }

    //@EventListener(ApplicationReadyEvent.class)
    public void applicationReady() {
        ArithmeticExp a1 = new ArithmeticExp(0, "4,52+5,55", 555.55);
        arithmeticExpRepository.save(a1);
    }

}

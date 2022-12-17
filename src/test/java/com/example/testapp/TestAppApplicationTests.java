package com.example.testapp;

import com.example.testapp.repositories.ArithmeticExpRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestAppApplicationTests {

    @Autowired
    ArithmeticExpRepository arithmeticExpRepository;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(arithmeticExpRepository,() -> String.format("%s", 111));
    }

}

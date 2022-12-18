package com.example.testapp.repositories;

import com.example.testapp.models.ArithmeticExp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ArithmeticExpRepositoryTest {

    @Autowired
    private ArithmeticExpRepository arithmeticExpRepository;

    private static ArithmeticExp a1 = new ArithmeticExp(0, "4,52+5,55", 555.55);
    private static ArithmeticExp a2 = new ArithmeticExp(0, "4+5,55", 545.55);

    @Test
    public void save() {
        ArithmeticExp a1_saved = arithmeticExpRepository.save(a1);
        ArithmeticExp a2_saved = arithmeticExpRepository.save(a2);
        a1.setId(a1_saved.getId());
        a2.setId(a2_saved.getId());
    }
}

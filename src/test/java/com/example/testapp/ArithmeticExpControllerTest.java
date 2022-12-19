package com.example.testapp;

import com.example.testapp.models.ArithmeticExp;
import com.example.testapp.services.data.ArithmeticExpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArithmeticExpControllerTest {

    @Autowired
    private ArithmeticExpService arithmeticExpService;

    ArithmeticExp a1 = new ArithmeticExp(0, "222/(5+5)-6.7+43*5", 0d);

    @Test
    public void save() {
        a1.setResult(a1.eval(a1.getExpression()));
        arithmeticExpService.save(a1);
        System.err.println(a1);
    }
}
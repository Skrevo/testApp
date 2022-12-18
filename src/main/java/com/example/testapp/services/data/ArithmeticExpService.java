package com.example.testapp.services.data;

import com.example.testapp.models.ArithmeticExp;

import java.util.List;

public interface ArithmeticExpService {
    ArithmeticExp save(ArithmeticExp arithmeticExp);

    List<ArithmeticExp> findAll();
}

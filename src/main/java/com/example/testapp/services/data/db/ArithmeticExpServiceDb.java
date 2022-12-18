package com.example.testapp.services.data.db;

import com.example.testapp.models.ArithmeticExp;
import com.example.testapp.repositories.ArithmeticExpRepository;
import com.example.testapp.services.data.ArithmeticExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArithmeticExpServiceDb implements ArithmeticExpService {

    @Autowired
    private ArithmeticExpRepository arithmeticExpRepository;

    @Override
    public ArithmeticExp save(ArithmeticExp arithmeticExp) {
        return arithmeticExpRepository.save(arithmeticExp);
    }

    @Override
    public List<ArithmeticExp> findAll() {
        return arithmeticExpRepository.findAll();
    }
}

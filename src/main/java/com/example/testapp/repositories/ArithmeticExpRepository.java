package com.example.testapp.repositories;

import com.example.testapp.models.ArithmeticExp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArithmeticExpRepository extends JpaRepository<ArithmeticExp, Integer> {
    List<ArithmeticExp> findByResult(Double result);
}

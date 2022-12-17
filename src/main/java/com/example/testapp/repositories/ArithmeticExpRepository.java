package com.example.testapp.repositories;

import com.example.testapp.models.ArithmeticExp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArithmeticExpRepository extends JpaRepository<ArithmeticExp, Integer> {
}

package com.example.testapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//
@Entity
@Table(name = "arithmetic_exp")
public class ArithmeticExp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String expression;
    @Column(nullable = false)
    private Double result;

    @Override
    public String toString() {
        return "ArithmeticExp{" +
                "id=" + id +
                ", expression='" + expression + '\'' +
                ", result=" + result +
                '}';
    }
}

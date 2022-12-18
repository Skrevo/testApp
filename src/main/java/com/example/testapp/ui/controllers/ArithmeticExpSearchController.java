package com.example.testapp.ui.controllers;

import com.example.testapp.models.ArithmeticExp;
import com.example.testapp.services.data.ArithmeticExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ArithmeticExpSearchController {
    @Autowired
    private ArithmeticExpService arithmeticExpService;

    @GetMapping("arithmeticSearch")
    public String load(@RequestParam("result") Double result, Model model) {
        List<ArithmeticExp> list = arithmeticExpService.findByResult(result);
        //System.out.println(list);
        model.addAttribute("arithmeticExps", list);
        return "arithmeticSearch";
    }
}

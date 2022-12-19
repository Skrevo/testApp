package com.example.testapp.ui.controllers;

import com.example.testapp.models.ArithmeticExp;
import com.example.testapp.services.data.ArithmeticExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class ArithmeticExpUpdateController {
    @Autowired
    private ArithmeticExpService arithmeticExpService;

    @GetMapping("arithmeticExpUpdate")
    public String load(@RequestParam("id") Integer id, Model model) {
        ArithmeticExp arithmeticExp = arithmeticExpService.findById(id);
        model.addAttribute("arithmeticExp",arithmeticExp);
        return "arithmeticExpUpdate";
    }

    @PostMapping("updateArithmeticExpForm")
    public ModelAndView updateArithmeticExpForm(@ModelAttribute ArithmeticExp arithmeticExp){
        arithmeticExp.setResult(arithmeticExp.eval(arithmeticExp.getExpression()));
        arithmeticExpService.save(arithmeticExp);
        return new ModelAndView("redirect:arithmeticExp", new ModelMap("id", arithmeticExp.getId()));
    }
}

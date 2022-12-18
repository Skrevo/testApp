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
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ArithmeticExpController {
    @Autowired
    public ArithmeticExpService arithmeticExpService;

    @GetMapping("arithmeticExp")
    public String load(Model model) {
        List<ArithmeticExp> list = arithmeticExpService.findAll();
        model.addAttribute("arithmeticExps",list);
        return "arithmeticExp";
    }
    @PostMapping("addArithmeticExpForm")
    public String addArithmeticExpForm(@ModelAttribute ArithmeticExp arithmeticExp) {
        arithmeticExpService.save(arithmeticExp);
        System.err.println(arithmeticExp);
        return "redirect:arithmeticExp";
    }

    @PostMapping("openArithmeticExpForm")
    public ModelAndView openArithmeticExpForm(Integer id) {
        return new ModelAndView("redirect:arithmeticExpUpdate", new ModelMap("id", id));
    }

}

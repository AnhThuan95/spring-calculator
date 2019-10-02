package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/calculate")
    public String getResult(Model model, @RequestParam Float firstOperand, @RequestParam Float secondOperand, @RequestParam Character operator) {
        try {
            if (firstOperand == null || secondOperand == null) {
                model.addAttribute("exception", "Vui long nhap vao gia tri.");
                return "error";
            }
            float result = Calculator.calculate(firstOperand, secondOperand, operator);
            model.addAttribute("firstOperand", firstOperand);
            model.addAttribute("operator", operator);
            model.addAttribute("secondOperand", secondOperand);
            model.addAttribute("result", result);
            return "result";
        } catch (Exception e) {
            model.addAttribute("exception", e.getMessage());
            return "error";
        }
    }

}

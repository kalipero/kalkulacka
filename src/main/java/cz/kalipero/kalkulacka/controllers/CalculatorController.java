package cz.kalipero.kalkulacka.controllers;

import models.CalculatorDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @GetMapping()
    public String renderCalculator(@ModelAttribute CalculatorDTO calculatorDTO){
        return "calculator";
    }
}

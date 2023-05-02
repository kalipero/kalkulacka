package cz.kalipero.kalkulacka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @GetMapping()
    public String renderCalculator(){
        return "calculator";
    }
}

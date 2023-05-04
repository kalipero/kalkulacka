package cz.kalipero.kalkulacka.controllers;

import ch.qos.logback.core.model.Model;
import models.CalculatorDTO;
import models.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @GetMapping()
    public String renderCalculator(@ModelAttribute CalculatorDTO calculatorDTO){
        return "calculator";
    }
    @PostMapping
    public String calculate(
            @ModelAttribute CalculatorDTO calculatorDTO,
            Model model
    ) {
        float result = calculatorService.calculate(calculatorDTO);
        model.addAttribute("result", result);
        return "result";
    }


}

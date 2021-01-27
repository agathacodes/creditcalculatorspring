package pl.agataroga.creditcalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.text.normalizer.NormalizerBase;

@Controller
public class MainController {

 @GetMapping("/")
public String index(){
     return "index";
 }
@PostMapping("/")
    public String userInput(Model model,
                            @RequestParam("salary") int monthIncome,
                            @RequestParam("bills") int monthOutcome,
                            @RequestParam("amountOfCredit") int requestedCredit,
                            @RequestParam("numberOfMonths") int requestedTime){
     model.addAttribute("gotCredit", (monthIncome-monthOutcome)*0.7>requestedCredit/requestedTime);
     return "index";
}


}

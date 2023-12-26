package com.futurenews.newsb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class Carmodels {
    @GetMapping("/carlist")
    public String showCars(Model model)
    {
        ArrayList<String> car = new ArrayList<>();
        car.add("Tesla Model3");
        car.add("Mazda");
        car.add("Mizubishi");
        model.addAttribute("car",car);
        return "carlist";
    }
}

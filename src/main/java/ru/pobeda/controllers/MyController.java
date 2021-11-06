package ru.pobeda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pobeda.DieselEngineImpl;
import ru.pobeda.FuelExeptionHandler;
import ru.pobeda.PetrolEngineImpl;

@Controller
@RequestMapping("/mvc/fuel")
public class MyController {


    PetrolEngineImpl petrolEngine = new PetrolEngineImpl();
    DieselEngineImpl dieselEngine = new DieselEngineImpl();

    @FuelExeptionHandler
    @GetMapping(value = "check")
    public String greeting(@RequestParam(name = "type", required = false) String type, Model model) throws Exception {

        if (type.equals("petrol"))
            model.addAttribute("name", petrolEngine.powerUp());
        else if (type.equals("diesel"))
            model.addAttribute("name", dieselEngine.powerUp());
        else throw new Exception("ex");
        return "mainpage";
    }



}

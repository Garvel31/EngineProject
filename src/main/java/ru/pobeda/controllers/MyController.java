package ru.pobeda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pobeda.DieselEngineImpl;
import ru.pobeda.Engine;
import ru.pobeda.FuelExeptionHandler;
import ru.pobeda.PetrolEngineImpl;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/mvc/fuel")
public class MyController {

    public static Map<String, Engine> engineMap = new HashMap<>();
    PetrolEngineImpl petrolEngine = new PetrolEngineImpl();
    DieselEngineImpl dieselEngine = new DieselEngineImpl();


    @FuelExeptionHandler
    @GetMapping(value = "check")
    public String greeting(@RequestParam(name = "type", required = false) String type, Model model) throws Exception {

        model.addAttribute("name", engineMap.get(type).powerUp());

        return "mainpage";
    }


}

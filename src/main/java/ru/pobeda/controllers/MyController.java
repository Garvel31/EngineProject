package ru.pobeda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pobeda.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/mvc/fuel")
public class MyController {



    @Autowired
    @Qualifier("actionEngineMap")
    HashMap<String, Engine> actionEngineMap;

    @FuelExeptionHandler
    @GetMapping(value = "check")
    public String greeting(@RequestParam(name = "type", required = false) String type, Model model) throws Exception {


        model.addAttribute("name", actionEngineMap.get(type).powerUp());
        return "mainpage";
    }


}

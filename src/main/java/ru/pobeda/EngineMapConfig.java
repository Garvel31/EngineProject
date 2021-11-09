package ru.pobeda;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Getter
public class EngineMapConfig {


    @Autowired
    PetrolEngineImpl petrolEngine;

    @Autowired
    DieselEngineImpl dieselEngine;

    @Bean
    public HashMap<String, Engine> actionEngineMap() {
        HashMap<String, Engine> engineMap = new HashMap<>();
        engineMap.put("petrol", petrolEngine);
        engineMap.put("diesel", dieselEngine);
        return engineMap;
    }
}
package ru.pobeda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class EngineMapConfig {

    @Bean
    public HashMap<String, Engine> actionEngineMap() {
        HashMap<String, Engine> engineMap = new HashMap<>();
        engineMap.put("petrol", new PetrolEngineImpl());
        engineMap.put("diesel", new DieselEngineImpl());
        return engineMap;
    }
}
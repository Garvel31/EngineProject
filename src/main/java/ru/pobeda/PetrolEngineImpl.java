package ru.pobeda;

import org.springframework.stereotype.Component;
import ru.pobeda.controllers.MyController;

@Component
public class PetrolEngineImpl implements Engine {

    public PetrolEngineImpl() {
//        MyController.engineMap.put("petrol", this);
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на бензине";
    }
}

package ru.pobeda;

import ru.pobeda.controllers.MyController;

public class PetrolEngineImpl implements Engine {

    public PetrolEngineImpl() {
        MyController.engineMap.put("petrol", this);
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на бензине";
    }
}

package ru.pobeda;

import ru.pobeda.controllers.MyController;

public class DieselEngineImpl implements Engine {

    public DieselEngineImpl() {
        MyController.engineMap.put("diesel", this);
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на дизельном топливе";
    }
}

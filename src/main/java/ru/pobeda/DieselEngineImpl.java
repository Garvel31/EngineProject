package ru.pobeda;

import org.springframework.stereotype.Component;
import ru.pobeda.controllers.MyController;

@Component
public class DieselEngineImpl implements Engine {


    public DieselEngineImpl() {
//        MyController.engineMap.put("diesel", this);
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на дизельном топливе";
    }
}

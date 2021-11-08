package ru.pobeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.pobeda.controllers.MyController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ServingWebContentApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);

    }


}
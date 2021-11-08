package ru.pobeda;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Getter
public class ActionEngineMapService {

    @Autowired
    HashMap<String, Engine> actionEngineMap;
}



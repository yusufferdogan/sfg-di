package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {
    PropertyInjectionController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectionController();

        controller.greetingService = new GreetingServiceImp();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
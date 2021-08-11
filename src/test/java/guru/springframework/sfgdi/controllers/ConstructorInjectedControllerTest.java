package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImp());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
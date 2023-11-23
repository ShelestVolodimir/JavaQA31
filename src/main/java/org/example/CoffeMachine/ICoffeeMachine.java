package org.example.CoffeMachine;

public interface ICoffeeMachine {
        void turnOn();

        void turnOff();

        void makeEspresso();

        void makeAmericano();

        void cleanGarbageBox();

        void addCoffee(int amount);

        void addWater(int amount);
}


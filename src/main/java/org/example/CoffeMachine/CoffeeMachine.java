package org.example.CoffeMachine;

import java.time.Duration;

public abstract class CoffeeMachine implements ICoffeeMachine {
    private int maxWaterLevel;
    private int maxCoffeeLevel;
    private int maxGarbageLevel;

    private int currentWaterLevel;
    private int currentCoffeeLevel;
    private int currentGarbageLevel;


    public CoffeeMachine() {
    }

    public CoffeeMachine(int maxWaterLevel, int maxCoffeeLevel, int maxGarbageLevel) {
        this.maxWaterLevel = maxWaterLevel;
        this.maxCoffeeLevel = maxCoffeeLevel;
        this.maxGarbageLevel = maxGarbageLevel;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void makeEspresso() {
        System.out.println("Ваше Еспрессо буде готове через 20 секунд");
        try {
            Thread.sleep(Duration.ofSeconds(20));
        } catch (InterruptedException e){}
        System.out.println("Ваша кава готова");
    }

    @Override
    public void makeAmericano() {
        System.out.println("Ваше Американо буде готове через 30 секунд ");
        try {
            Thread.sleep(Duration.ofSeconds(30));
        } catch (InterruptedException e){}
        System.out.println("Ваша кава готова");

    }

    @Override
    public void cleanGarbageBox() {

    }

    @Override
    public void addCoffee(int amount) {
        if (currentCoffeeLevel + amount > maxCoffeeLevel) {
            System.out.println("ПОМИЛКА: Забагато кави");
        } else {
            currentCoffeeLevel += amount;
            System.out.println("Кава додана успішно");
        }
    }

    @Override
    public void addWater(int amount) {

    }
}

package org.example.Lesson16;

public class Main {
    public static void main(String[] args) {
        Sailor sailor = new Sailor();
        sailor.setName("Jack ");
        sailor.goToSea();
        Builder builder = new Builder();
        builder.setName("Bob ");
        builder.building();
        Pilot pilot = new Pilot();
        pilot.setName("Cristian");
        pilot.fly();
    }
}

package ru.mts.hw2;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();
        createService.CreateAnimals(5);
        createService.CreateAnimals(10);
    }
}

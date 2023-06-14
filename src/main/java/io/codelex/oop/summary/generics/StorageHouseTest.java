package io.codelex.oop.summary.generics;

public class StorageHouseTest {
    public static void main(String[] args) {
        StorageHouse<String> stringHouse = new StorageHouse<>("First item");
        stringHouse.addMoreItems("Second item");
        stringHouse.printItems();

        StorageHouse<Double> doubleHouse = new StorageHouse<>(15.75);
        doubleHouse.addMoreItems(15.2);
        doubleHouse.printItems();
    }
}


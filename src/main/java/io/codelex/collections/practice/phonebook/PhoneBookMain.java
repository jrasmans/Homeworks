package io.codelex.collections.practice.phonebook;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.putNumber("John", "1234567890");
        phoneDirectory.putNumber("Alice", "9876543210");
        phoneDirectory.putNumber("Bob", "5555555555");

        System.out.println("John's number: " + phoneDirectory.getNumber("John"));
        System.out.println("Alice's number: " + phoneDirectory.getNumber("Alice"));
        System.out.println("Bob's number: " + phoneDirectory.getNumber("Bob"));
        System.out.println("Unknown's number: " + phoneDirectory.getNumber("Unknown"));

        phoneDirectory.putNumber("Alice", "1111111111");
        System.out.println("Alice's updated number: " + phoneDirectory.getNumber("Alice"));
    }
}


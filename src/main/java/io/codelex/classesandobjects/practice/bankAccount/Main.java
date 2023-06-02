package io.codelex.classesandobjects.practice.bankAccount;

class Main {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount();
        benben.name = "Benson";
        benben.balance = 17.25;
        System.out.println(benben.toString()); // Output: Benson, $17.25

        benben.balance = -17.5;
        System.out.println(benben.toString()); // Output: Benson, -$17.50
    }
}

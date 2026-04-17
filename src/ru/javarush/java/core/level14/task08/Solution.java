package ru.javarush.java.core.level14.task08;

public class Solution {
    public static void main(String[] args) {
        // Открываем счёт с заданным начальным балансом
        // Открываем счёт только с именем (баланс будет установлен в 0)
        // Пополняем второй счёт на 500 единиц
        // Выводим информацию о каждом счёте
        BankAccount owner1 = new BankAccount("Ann", 100);
        BankAccount owner2 = new BankAccount("Bob");
        owner2.deposit(500);

        owner1.printInfo();
        owner2.printInfo();


    }
}

// Класс банковского счёта с владельцем и текущим балансом
class BankAccount{
    String accountOwner;
    int accountBalance;

    public BankAccount(String accountOwner, int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.accountBalance = 0;
    }

    void deposit(int amount){
        accountBalance += amount;
    }

    void printInfo(){
        System.out.println("Владелец: " + accountOwner + ", баланс: " + accountBalance);
    }
}
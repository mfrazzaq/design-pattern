package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter amount");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        IAmount iAmount = new Amount(0,0,0,0,0,0);
        BankNote atm = new BankNote200(new BankNote100(new BankNote50(new BankNote20(new BankNote10(new BankNote5())))));
        atm.calculateBankNote(iAmount, amount);
        iAmount.info();

    }
}
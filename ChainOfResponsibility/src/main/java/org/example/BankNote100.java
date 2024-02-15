package org.example;

public class BankNote100 implements BankNote{
    private  BankNote50 bankNote50;

    public BankNote100(BankNote50 bankNote50) {
        this.bankNote50 = bankNote50;
    }

    @Override
    public IAmount calculateBankNote(IAmount amount, int state) {
        int remaining = state % 100;
        amount.note100 = state / 100;
        return remaining >= 5 ? this.bankNote50.calculateBankNote(amount,remaining) : amount;
    }
}

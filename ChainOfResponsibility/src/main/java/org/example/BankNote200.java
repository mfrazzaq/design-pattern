package org.example;

public class BankNote200 implements BankNote{
    private  BankNote100 bankNote100;

    public BankNote200(BankNote100 bankNote100) {
        this.bankNote100 = bankNote100;
    }

    @Override
    public IAmount calculateBankNote(IAmount amount, int state) {
        int remaining = state % 200;
        amount.note200 = state / 200;
        return remaining >= 5 ? this.bankNote100.calculateBankNote(amount,remaining) : amount;
    }
}

package org.example;

public class BankNote50 implements BankNote{
    private BankNote20 bankNote20;

    public BankNote50(BankNote20 bankNote20) {
        this.bankNote20 = bankNote20;
    }

    @Override
    public IAmount calculateBankNote(IAmount amount, int state) {
        int remaining = state % 50;
        amount.note50 = state / 50;
        return remaining >= 5 ? this.bankNote20.calculateBankNote(amount,remaining) : amount;
    }
}

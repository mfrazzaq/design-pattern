package org.example;

public class BankNote20 implements BankNote{
    private BankNote10 bankNote10;

    public BankNote20(BankNote10 bankNote10) {
        this.bankNote10 = bankNote10;
    }

    @Override
    public IAmount calculateBankNote(IAmount amount, int state) {
        int remaining = state % 20;
        amount.note20 = state / 20;
        return remaining >= 5 ? this.bankNote10.calculateBankNote(amount,remaining) : amount;
    }
}

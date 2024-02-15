package org.example;

public class BankNote10 implements BankNote{
    private BankNote5 bankNote5;

    public BankNote10(BankNote5 bankNote5) {
        this.bankNote5 = bankNote5;
    }

    @Override
    public IAmount calculateBankNote(IAmount amount, int state) {
        int remaining = state % 10;
        amount.note10 = state / 10;
        return remaining >= 5 ? this.bankNote5.calculateBankNote(amount,remaining) : amount;
    }
}

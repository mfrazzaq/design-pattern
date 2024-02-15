package org.example;

public class BankNote5 implements BankNote {

    @Override
    public IAmount calculateBankNote(IAmount amount, int state) {
        amount.note5 = state / 5;
        return amount;
    }

}

package org.example;

import java.util.ArrayList;

public abstract class IAmount {
    public int note5 = 0;
    public int note10 = 0;
    public int note20 = 0;
    public int note50 = 0;
    public int note100 = 0;
    public int note200 = 0;
    public void info() {
        System.out.println("Note of 5: ".concat(String.valueOf(note5)));
        System.out.println("Note of 10: ".concat(String.valueOf(note10)));
        System.out.println("Note of 20: ".concat(String.valueOf(note20)));
        System.out.println("Note of 50: ".concat(String.valueOf(note50)));
        System.out.println("Note of 100: ".concat(String.valueOf(note100)));
        System.out.println("Note of 200: ".concat(String.valueOf(note200)));

    };
    public int totalAmount() {
        return this.note200 * 200 + this.note100 * 100 + this.note50 * 50 + this.note20 * 20 + this.note10 * 10 + this.note5 * 5;
    };
}

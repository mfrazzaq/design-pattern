package org.example;

public class Amount extends IAmount{
    public int note5;
    public int note10;
    public int note20;
    public int note50;
    public int note100;
    public int note200;

    public Amount(int note5, int note10, int note20, int note50, int note100, int note200) {
        this.note5 = note5;
        this.note10 = note10;
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
        this.note200 = note200;
    }
}

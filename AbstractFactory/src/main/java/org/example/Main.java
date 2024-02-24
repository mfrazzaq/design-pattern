package org.example;

public class Main {
    public static void main(String[] args) {
        IAbstractMobileFactory apple = AppleFactory.getInstance();
        try{
            IMobile iphone = apple.createMobile("Iphone15");
            System.out.println(iphone.getDescription());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
package org.example;

public class AppleFactory implements IAbstractMobileFactory {

    @Override
    public IMobile createMobile(String name) throws Exception {
        if(name.equals("Iphone15")){
                return new Iphone15(200);
        } else if (name.equals("Iphone15ProMax")) {
                return new Iphone15ProMax(300);
        } else {
            throw new Exception("No such mobile exists");
        }
    }
}

package org.example;

public class SamsungFactory implements IAbstractMobileFactory {

    @Override
    public IMobile createMobile(String name) throws Exception {
        if(name.equals("S23")){
            return new S23(200);
        } else if (name.equals("S23Ultra")) {
            return new S23Ultra(300);
        } else {
            throw new Exception("No such mobile exists");
        }
    }
}

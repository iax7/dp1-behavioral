package com.iax.stateEx;

public class TransitMode implements Mode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}

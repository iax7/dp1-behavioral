package com.iax.stateEx;

public class DirectionService {
    private Mode mode;

    public Object getEta() {
        return mode.getEta();
    }

    public Object getDirection() {
        return mode.getDirection();
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode travelMode) {
        this.mode = travelMode;
    }
}

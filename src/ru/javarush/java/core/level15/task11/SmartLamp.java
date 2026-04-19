package ru.javarush.java.core.level15.task11;

public class SmartLamp {
    private boolean isCurrentlyOn = false;

    public SmartLamp() {
    }

    public boolean isCurrentlyOn() {
        return isCurrentlyOn;
    }

    public void setCurrentlyOn(boolean newState) {
        isCurrentlyOn = newState;
    }
}

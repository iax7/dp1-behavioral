package com.iax.templateEx;

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        beforeClose();

        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
        afterClose();
    }

    protected abstract void beforeClose();
    protected abstract void afterClose();
}

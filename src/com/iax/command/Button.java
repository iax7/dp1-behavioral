package com.iax.command;

public class Button {
    private String label;
    public Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }
}

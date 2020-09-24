package com.iax.templateEx;

public class MainWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Wraping up before.");
    }

    @Override
    protected void afterClose() {
        System.out.println("Finalizing all after.");
    }
}

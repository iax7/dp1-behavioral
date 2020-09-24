package com.iax.strategyEx;

public class DesEncryption implements Encryption {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return "d";
    }
}

package com.iax.strategyEx;

public class AesEncryption implements Encryption {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return "a";
    }
}

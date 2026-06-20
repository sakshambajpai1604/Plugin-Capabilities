package com.saksham;

public class Service implements Loggable, Auditable {

    @Override
    public void info() {
        System.out.println("Resolving default method conflict");

        Loggable.super.info();
        Auditable.super.info();
    }
}
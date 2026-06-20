package com.saksham;

public interface Auditable {

    default void audit() {
        System.out.println("Auditing activity...");
    }

    default void info() {
        System.out.println("Info from Auditable");
    }
}
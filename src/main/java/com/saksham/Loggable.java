package com.saksham;

public interface Loggable {

    default void log() {
        System.out.println("Logging activity...");
    }

    default void info() {
        System.out.println("Info from Loggable");
    }
}
package com.example.keasandwhichopgave.model;

public enum SandwhichBread {
    WHOLEGRAIN("Grovt brød"),
    LIGHTBREAD("Lyst brød");

    private String name;
    SandwhichBread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.example.keasandwhichopgave.model;

public enum SandwhichAddons {
    CHICKEN("Chicken"),
    FETA("Feta"),
    BACON("Bacon");

    private String name;
    SandwhichAddons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


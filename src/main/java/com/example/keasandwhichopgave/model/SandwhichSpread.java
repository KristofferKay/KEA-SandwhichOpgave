package com.example.keasandwhichopgave.model;

public enum SandwhichSpread {
    MAYO("Mayo"),
    KETCHUP("Ketchup"),
    BUTTER("Butter");

    private String name;
    SandwhichSpread(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

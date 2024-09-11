package com.example.keasandwhichopgave.model;

import java.util.UUID;

public class SandwhichOrder {
    private SandwhichBread sandwhichBread;
    private SandwhichAddons sandwhichAddons;
    private SandwhichSpread sandwhichSpread;
    private UUID uuid;

    public SandwhichOrder(SandwhichBread sandwhichBread, SandwhichAddons sandwhichAddons, SandwhichSpread sandwhichSpread) {
        this.sandwhichBread = sandwhichBread;
        this.sandwhichAddons = sandwhichAddons;
        this.sandwhichSpread = sandwhichSpread;
    }

    public SandwhichSpread getSandwhichSpread() {
        return sandwhichSpread;
    }

    public void setSandwhichSpread(SandwhichSpread sandwhichSpread) {
        this.sandwhichSpread = sandwhichSpread;
    }

    public SandwhichOrder(){}

    public SandwhichBread getSandwhichBread() {
        return sandwhichBread;
    }

    public void setSandwhichBread(SandwhichBread sandwhichBread) {
        this.sandwhichBread = sandwhichBread;
    }

    public SandwhichAddons getSandwhichAddons() {
        return sandwhichAddons;
    }

    public void setSandwhichAddons(SandwhichAddons sandwhichAddons) {
        this.sandwhichAddons = sandwhichAddons;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "SandwhichOrder{" +
                "sandwhichBread=" + sandwhichBread +
                ", sandwhichAddons=" + sandwhichAddons +
                ", sandwhichSpread=" + sandwhichSpread +
                ", uuid=" + uuid +
                '}';
    }
}

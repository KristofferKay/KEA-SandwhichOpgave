package com.example.keasandwhichopgave.repo;

import com.example.keasandwhichopgave.model.SandwhichOrder;

import java.util.ArrayList;
import java.util.List;

public class SandwhichRepo {
    private List<SandwhichOrder> sandwhichOrderList = new ArrayList<>();

    public List<SandwhichOrder> getSandwhichOrderList() {
        return sandwhichOrderList;
    }

    public List<SandwhichOrder> newOrder(SandwhichOrder sandwhichOrder){
        sandwhichOrderList.add(sandwhichOrder);
        return sandwhichOrderList;
    }
}

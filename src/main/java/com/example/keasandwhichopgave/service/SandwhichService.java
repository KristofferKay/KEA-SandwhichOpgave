package com.example.keasandwhichopgave.service;

import com.example.keasandwhichopgave.model.SandwhichOrder;
import com.example.keasandwhichopgave.repo.SandwhichRepo;

import java.util.List;
import java.util.UUID;

public class SandwhichService {
    private SandwhichRepo sandwhichRepo = new SandwhichRepo();

    public List<SandwhichOrder> newOrder(SandwhichOrder sandwhichOrder){
        return sandwhichRepo.newOrder(sandwhichOrder);
    }

    public List<SandwhichOrder> getAllOrders(){
        return sandwhichRepo.getSandwhichOrderList();
    }

    public SandwhichOrder editOrder(UUID id){
        return sandwhichRepo.editOrder(id);
    }
}

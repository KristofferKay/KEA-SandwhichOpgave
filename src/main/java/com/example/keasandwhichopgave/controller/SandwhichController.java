package com.example.keasandwhichopgave.controller;

import com.example.keasandwhichopgave.model.SandwhichOrder;
import com.example.keasandwhichopgave.model.*;
import com.example.keasandwhichopgave.service.SandwhichService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class SandwhichController {
    private SandwhichService sandwhichService = new SandwhichService();

    @GetMapping("/")
    public String showOrderForm(Model model) {
        SandwhichOrder sandwhichOrder = new SandwhichOrder();
        sandwhichOrder.setUuid(UUID.randomUUID());
        model.addAttribute("sandwhichOrder", sandwhichOrder);
        model.addAttribute("sandwhichAddons", SandwhichAddons.values());
        model.addAttribute("sandwhichBread", SandwhichBread.values());
        model.addAttribute("sandwhichSpread", SandwhichSpread.values());
        return "orderForm";
    }

    @GetMapping("/allorders")
    public String getAllOrders(Model model){
        model.addAttribute("orders", sandwhichService.getAllOrders());
        return "allorders";
    }

    //MAKE POST
    @PostMapping("order")
    public String newOrder(@ModelAttribute SandwhichOrder sandwhichOrder){
        sandwhichService.newOrder(sandwhichOrder);
        return "redirect:/allorders";
    }

    @GetMapping("/order/edit/{id}")
    public String editOrder(@PathVariable UUID id, Model model){
        SandwhichOrder sandwhichOrder = sandwhichService.editOrder(id);
        if (sandwhichOrder == null) {
            throw new IllegalArgumentException("Order ID not found");
        }
        // comments
        model.addAttribute("sandwhichOrder", sandwhichOrder);
        model.addAttribute("sandwhichAddons", SandwhichAddons.values());
        model.addAttribute("sandwhichBread", SandwhichBread.values());
        model.addAttribute("sandwhichSpread", SandwhichSpread.values());
        return "editorder";
        // test comment in test
    }

}

package com.company.controller;

import com.company.model.Repository.AdminRepository;
import com.company.model.Repository.InterfaceUserRepository;
import com.company.model.entitiies.Flight;

public class UserController {


    // in this class we return data from model (interraction with database) and give it to view and

    private final InterfaceUserRepository re;

    public UserController(InterfaceUserRepository userRepository) {
        this.re = userRepository;
    }


    public void registerNewTicket(Flight newFlight){
        re.registerNewTicket(newFlight);
    }
}

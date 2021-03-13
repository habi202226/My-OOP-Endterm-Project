package com.company.controller;

import com.company.model.Repository.AdminRepository;
import com.company.model.Repository.InterfaceAdminRepository;
import com.company.model.entitiies.Flight;

import java.util.ArrayList;

public class AdminController {


    // in this class we return data from model (interraction with database) and give it to view and

    private final InterfaceAdminRepository re;

    public AdminController(InterfaceAdminRepository re) {
        this.re = re;
    }
    public ArrayList<Flight> getAllFlights(){
        return re.getAllFlights();
    }
    public void deleteFlight(int id){
        re.deleteFlight(id);
    }
    public void addFlight(Flight newFlight){
        re.addFlight(newFlight);
    }

}

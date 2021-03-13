package com.company.model.Repository;

import com.company.model.entitiies.Flight;

import java.util.ArrayList;

public interface InterfaceAdminRepository {

    // interface for AdminRepository

    ArrayList<Flight> getAllFlights();
    void deleteFlight(int id);
    void addFlight(Flight newFlight);

}

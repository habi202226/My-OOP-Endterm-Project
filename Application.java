package com.company.view;

import com.company.controller.AdminController;
import com.company.controller.UserController;
import com.company.model.Repository.InterfaceAdminRepository;
import com.company.model.Repository.InterfaceUserRepository;
import com.company.model.entitiies.Flight;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    // declare controllers

    AdminController adminController;
    UserController userController;

    public Application(InterfaceAdminRepository interfaceAdminRepository, InterfaceUserRepository interfaceUserRepository){
        adminController = new AdminController(interfaceAdminRepository);
        userController = new UserController(interfaceUserRepository);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please choose");

        for(int i = 1; i <= 1000000; i++) {
            // interactive menu

            // if we had some queries or something we send it to controller which sends to database through repositories

            System.out.println("1) I am Admin");
            System.out.println("2) I want to buy ticket");

            int ch = scanner.nextInt();

            if(ch == 1){
                System.out.println("1) Show all flights");
                System.out.println("2) Add new flight");
                System.out.println("3) Delete flight");

                ch = scanner.nextInt();

                if(ch == 1){

                    ArrayList < Flight > alls = adminController.getAllFlights();

                    for(Flight flight : alls){
                        System.out.println(flight.toString());
                    }


                } else if(ch == 2){
                    String name, destination, date, time;
                    System.out.println("Input your name");
                    name = scanner.next();
                    System.out.println("Input destination");
                    destination = scanner.next();
                    System.out.println("Input date");
                    date = scanner.next();
                    System.out.println("input time");
                    time = scanner.next();

                    userController.registerNewTicket(new Flight(0, name, destination, date, time));
                } else if(ch == 3){
                    System.out.println("Input id");
                    int id = scanner.nextInt();
                    adminController.deleteFlight(id);
                }

            } else if(ch == 2){
                String name, destination, date, time;
                System.out.println("Input your name");
                name = scanner.next();
                System.out.println("Input destination");
                destination = scanner.next();
                System.out.println("Input date");
                date = scanner.next();
                System.out.println("input time");
                time = scanner.next();

                userController.registerNewTicket(new Flight(0, name, destination, date, time));

            }


        }


    }

}


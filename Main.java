package com.company;

import com.company.model.Repository.*;
import com.company.model.database.IDB;
import com.company.model.database.PostgresDB;
import com.company.view.Application;

public class Main {

    public static void main(String[] args) {

        IDB datab = new PostgresDB();

        InterfaceUserRepository userRepository = new UserRepository(datab);
        InterfaceAdminRepository adminRepository = new AdminRepository(datab);

        Application application = new Application(adminRepository, userRepository);

        application.start();

    }
}

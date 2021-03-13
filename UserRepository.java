package com.company.model.Repository;

import com.company.model.database.IDB;
import com.company.model.entitiies.Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRepository implements InterfaceUserRepository{
    private final IDB database;

    public UserRepository(IDB datab) {
        this.database = datab;
    }



    // in this table we shpuld add a new flight
    public void registerNewTicket(Flight newFlight){
        Connection con = null;

        try {
            con = database.getConnection();


            // we adding a new flight to our database through prepareStatement
            String sql = "insert into flightstable values (default, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, newFlight.getName());
            st.setString(2, newFlight.getDestination());
            st.setString(3, newFlight.getDate());
            st.setString(4, newFlight.getTime());


            //execute statement
            st.execute();



        } catch (Exception e){
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

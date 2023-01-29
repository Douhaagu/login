package user;


import loginda.connection.DBconn;
import loginda.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class managementUser {    
    public user signUp(user c) {
        Connection connection = DBconn.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement

                    ("INSERT INTO users(name ,email , password ) values(?,?,?)");

            ps.setString(1,c.getName());
            ps.setString(2,c.getEmail());
            ps.setString(3,c.getPassword());


            ps.executeUpdate();
            ps.close();






        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
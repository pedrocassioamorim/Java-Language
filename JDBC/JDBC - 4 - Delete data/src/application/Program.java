package application;

import db.DB;
import db.DBException;
import db.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id >= ?");

            st.setInt(1, 20);


            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Affected rows: " + rowsAffected);



        }catch (SQLException e){
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

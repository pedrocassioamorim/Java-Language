package application;

import db.DB;
import db.DBException;
import db.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);
            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 5090 WHERE DepartmentId = 1");

//            int x = 1;
//            if (x < 2){
//                throw new SQLException("Fake error!");
//            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("Done! Affected rows1: " + rows1);
            System.out.println("Done! Affected rows2: " + rows2);



        }catch (SQLException e){
            try {
                conn.rollback();

                throw new DBException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException f){
                throw new DBException("Error trying to Roll Back! Caused by: " + f.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

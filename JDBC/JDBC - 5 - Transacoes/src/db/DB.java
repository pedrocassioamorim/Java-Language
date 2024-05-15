package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e){
                throw new DBException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if(conn != null) {
            try {
                conn.close();
            }catch (SQLException e){
                throw new DBException(e.getMessage());
            }
        }
    }


    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("/home/amorim/IdeaProjects/Charp 21 - Banco de Dados/JDBC - 4 - Deletar Dados/src/db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;

        } catch (IOException e){
            throw new DBException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st){
        if(st != null){
            try{
                st.close();
            } catch (SQLException e){
                throw new DBException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            } catch (SQLException e){
                throw new DBException(e.getMessage());
            }
        }
    }

}

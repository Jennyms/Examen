/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jenni
 */
public class Conexion {

    public static final String DRIVER = "jdbc:postgresql://";
    public static final String SERVER = "localhost:5432/";
    public static final String DB = "Examen";
    public static final String USER = "postgres";
    public static final String PASS = "postgres";

    public static Connection conexion() {
        //Conectarse a la base de datos

        Connection conn = null;
        String url = DRIVER + SERVER + DB;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        return conn;
    }

}

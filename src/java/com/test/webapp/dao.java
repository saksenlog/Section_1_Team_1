/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webapp;

import com.test.webapp.dbconnector.ConnectionManager;
import com.test.webapp.servlet.UserRegistrationServlet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class dao {
    
    public String testConnection(){
    ConnectionManager dbCon = new ConnectionManager();
        Connection conn = null;
        try {
            conn = dbCon.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query = "select * from addresses";
        Statement sqlStmnt = null;
        try {
            sqlStmnt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ResultSet rsObj = null;
        
        try {
            rsObj =  sqlStmnt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rsObj.next()){
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       return ""; 
    }
}

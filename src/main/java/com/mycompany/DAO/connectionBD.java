/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

/**
 *
 * @author Zouzou zizaa
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class connectionBD {
        private  String URL;
	private  String Login;
	private  String Password;
	public connectionBD()
	{
		this.URL = "jdbc:mysql://localhost:3306/societe";
		this.Login = "root";
		this.Password = "";
	}
	static connectionBD connexion = new connectionBD();
	public static connectionBD getcnx() {
		return connexion;
	}
	public String getURL() {
		return URL;
	}
	public String getLogin() {
		return Login;
	}
	public String getPassword() {
		return Password;
	}
	public Connection openConnection()
	{
		Connection c = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(connexion.getURL(),connexion.getLogin(),connexion.getPassword());
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
                Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		return c;
	}
	public static void closeConnection(Connection c)
	{
		if(c != null)
		{
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


	
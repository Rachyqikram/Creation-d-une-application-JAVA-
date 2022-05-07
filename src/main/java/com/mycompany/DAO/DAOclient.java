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
import com.mycompany.classes.Client;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public  class DAOclient implements DAOInterface <Client >{
    
	 public DAOclient( ) {
		  super ();     
	 }
	@SuppressWarnings("static-access")
	public boolean ajouter(Client cle) {

                connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement insert = connexion.prepareStatement("INSERT INTO client(Noclient,Nom,Prenom,Adresse,Tél)VALUES(?,?,?,?,?)");
			insert.setInt(1,cle.getNumeroClient());
                        insert.setString(2,cle.getNom());
                        insert.setString(3,cle.getPrenom());
                        insert.setString(4,cle.getAdresse());
                        insert.setString(5,cle.getTel());
                        
                        insert.executeUpdate();
		} 
                catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			c.closeConnection(connexion);
		}
		
	 	return true;
	}

    @Override
    public boolean suppression(Client cle) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement delete = connexion.prepareStatement("DELETE FROM client WHERE Noclient=?");
			
                        delete.setInt(1,cle.getNumeroClient());
                        delete.executeUpdate();
                        
                        
		} 
                catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			c.closeConnection(connexion);
		}
		
	 	return true;
    }
    

    @Override
    public boolean modifier(Client cle) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement update = connexion.prepareStatement("UPDATE client set Nom=?,Prenom=?,Adresse=?,Tél=? WHERE Noclient=?");
			
                        update.setString(1,cle.getNom());
                        update.setString(2,cle.getPrenom());
                        update.setString(3,cle.getAdresse());
                        update.setString(4,cle.getTel());
                        update.setInt(5,cle.getNumeroClient());
                        update.executeUpdate();
                        
                        
		} 
                catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			c.closeConnection(connexion);
		}
		
	 	return true;
    }

	

}


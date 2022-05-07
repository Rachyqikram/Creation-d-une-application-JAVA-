/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import com.mycompany.classes.Livraison;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Zouzou zizaa
 */
public class DAOlivraison implements DAOInterface <Livraison>{
	
	 public DAOlivraison () {
		 super();
	 }

	

	@SuppressWarnings("static-access")
	public boolean ajouter(Livraison lv) {

                connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement insert = connexion.prepareStatement("INSERT INTO livraison(NoLivraison,DateLivraison)VALUES(?,?)");
			insert.setInt(1,lv.getNumeroLivraison());
                        
                        insert.setDate(2,java.sql.Date.valueOf(lv.getDateLivraison()));
                       
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
    public boolean suppression(Livraison lv) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement delete = connexion.prepareStatement("DELETE FROM livraison WHERE NoLivraison=?");
			
                        delete.setInt(1,lv.getNumeroLivraison());
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
    public boolean modifier(Livraison lv) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement update = connexion.prepareStatement("UPDATE livraison set DateLivraison=? WHERE NoLivraison=?");
			
                        update.setDate(1,java.sql.Date.valueOf(lv.getDateLivraison()));
                        update.setInt(2,lv.getNumeroLivraison());
                        
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

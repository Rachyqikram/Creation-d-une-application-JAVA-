/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import com.mycompany.classes.Facture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Zouzou zizaa
 */
public class DAOfacture implements DAOInterface <Facture> {
	 public DAOfacture() {
		 super();
	 }

	

	@SuppressWarnings("static-access")
	public boolean ajouter(Facture f) {

                connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement insert = connexion.prepareStatement("INSERT INTO facture(NoFacture,DateFacture,Montant)VALUES(?,?,?)");
			insert.setInt(1,f.getNumeroFacture());
                        insert.setDate(2,java.sql.Date.valueOf(f.getDateFacture()));
                        insert.setDouble(3,f.getMontant());
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
    public boolean suppression(Facture f) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement delete = connexion.prepareStatement("DELETE FROM facture WHERE NoFacture=?");
			
                        delete.setInt(1,f.getNumeroFacture());
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
    public boolean modifier(Facture f) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement update = connexion.prepareStatement("UPDATE facture set DateFacture=?,Montant=? WHERE NoFacture=?");
			
                        
                        update.setDate(1,java.sql.Date.valueOf(f.getDateFacture()));
                        update.setDouble(3,f.getMontant());
                        update.setInt(3,f.getNumeroFacture());
                       
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



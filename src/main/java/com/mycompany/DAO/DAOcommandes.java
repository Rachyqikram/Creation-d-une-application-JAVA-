/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;
import java.sql.*;
import com.mycompany.classes.Commandes;

 
public class DAOcommandes implements DAOInterface <Commandes>{
	
	 public DAOcommandes () {
		 super();
	 }

	

	@SuppressWarnings("static-access")
	public boolean ajouter(Commandes cm) {

                connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement insert = connexion.prepareStatement("INSERT INTO commande(NoCommande,DateCommande)VALUES(?,?)");
			insert.setInt(1,cm.getNumeroCommande());
                        
                        insert.setDate(2,java.sql.Date.valueOf(cm.getDateCommande()));
                       
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
    public boolean suppression(Commandes cm) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement delete = connexion.prepareStatement("DELETE FROM commande WHERE NoCommande=?");
			
                        delete.setInt(1,cm.getNumeroCommande());
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
    public boolean modifier(Commandes cm) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement update = connexion.prepareStatement("UPDATE commande set DateCommande=? WHERE NoCommande=?");
			java.sql.Date date = java.sql.Date.valueOf(cm.getDateCommande());
                        update.setDate(1,date);
                        update.setInt(2,cm.getNumeroCommande());
                        
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
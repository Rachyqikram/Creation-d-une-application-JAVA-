/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;
import com.mycompany.classes.Produits;
import java.sql.*;

/**
 *
 * @author Zouzou zizaa
 */
public class DAOproduits implements DAOInterface <Produits> {
	 public DAOproduits() {
		 super();
	 }

	

	@SuppressWarnings("static-access")
	public boolean ajouter(Produits pd) {

                connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement insert = connexion.prepareStatement("INSERT INTO produits(NoProduit,Nom,Quantite,Prix)VALUES(?,?,?,?)");
			insert.setInt(1,pd.getNumeroProduit());
                        insert.setString(2,pd.getNomProduit());
                        insert.setInt(3,pd.getQuantite());
                        insert.setDouble(4,pd.getPrix());
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
    public boolean suppression(Produits pd) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement delete = connexion.prepareStatement("DELETE FROM produits WHERE NoProduit=?");
			
                        delete.setInt(1,pd.getNumeroProduit());
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
    public boolean modifier(Produits pd) {
        connectionBD c = connectionBD.getcnx();
		Connection connexion = c.openConnection();
		
		try{
                        PreparedStatement update = connexion.prepareStatement("UPDATE produits set Nom=?,Quantite=?,Prix=? WHERE NoProduit=?");
			
                        update.setString(1,pd.getNomProduit());
                        update.setInt(2,pd.getQuantite());
                        update.setDouble(3,pd.getPrix());
                        update.setInt(4,pd.getNumeroProduit());
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



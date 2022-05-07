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
public interface DAOInterface <Table>{
    
	boolean ajouter(Table table);
	boolean suppression(Table table);
	//Object searchById(String id);
	boolean modifier (Table table1);
}

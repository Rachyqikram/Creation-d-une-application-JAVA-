package com.mycompany.classes;

import java.time.LocalDate;
import java.time.Month;

public class Commandes {
	private int numerocommandes;
	 private  LocalDate Date_commande;
	 
	 
	 public Commandes  () {
			super();
		}
	  public int  getNumeroCommande() {
			return numerocommandes;
		}
		public void setNumeroCommande(int numerocommandes) {
			this.numerocommandes = numerocommandes;
		}
		 public LocalDate  getDateCommande () {
				return Date_commande  ;
			}
			public void setDateCommande (int y ,int m , int j) {
				
				this.Date_commande =LocalDate.of(y,Month.of(m), j);
			}
			  public Commandes ( int num ,LocalDate date) {
				this. numerocommandes=num;
				Date_commande =date;
				
				
			  }
}

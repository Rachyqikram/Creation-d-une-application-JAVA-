package com.mycompany.classes;

import java.time.LocalDate;
import java.time.Month;

public class Livraison {
	private int numerolivraison ;
	 private  LocalDate Date_livraison;
	 
	 public Livraison   () {
			super();
		}
	 public int  getNumeroLivraison() {
			return numerolivraison ;
		}
	public void setNumeroLivraison(int numerolivraison) {
			this.numerolivraison = numerolivraison;
		}
	 public LocalDate  getDateLivraison () {
				return Date_livraison   ;
			}
	public void setDateLivraison (int y ,int m , int j) {	
				this.Date_livraison  =LocalDate.of(y,Month.of(m), j);
			}
			
	 public Livraison  ( int num ,LocalDate date) {
					this.numerolivraison =num;
					Date_livraison =date;	
				  }
}

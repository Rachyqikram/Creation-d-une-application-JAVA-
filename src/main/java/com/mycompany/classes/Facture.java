package com.mycompany.classes;

import java.time.LocalDate;
import java.time.Month;

public class Facture {
	private int numerofacture;
	 private  LocalDate Date_facture ;
	 private double montant ;
	 
	 public  Facture( int num ,LocalDate date, double montant ) {
			this.numerofacture =num;
			Date_facture  =date;
			this.montant  = montant ;	
		  }
	 public Facture() {
			super();
		}
	  public int  getNumeroFacture() {
			return numerofacture;
		}
		public void setNumeroFacture(int numerofacture) {
			this.numerofacture = numerofacture;
		}
		
		public LocalDate  getDateFacture() {
			return Date_facture   ;
		}
		public void setDateFacture (int y ,int m , int j) {
			
			this.Date_facture  =LocalDate.of(y,Month.of(m), j);
		}
		 public  double   getMontant () {
				return  montant;
		}
		public void setMontant (double  montant) {
				this.montant  = montant ;
		}
			  
				
}

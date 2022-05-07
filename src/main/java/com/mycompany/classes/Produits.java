package com.mycompany.classes;

public class Produits {
	private int  numeroproduits;
	private String nomproduits;
	private int quantite ;
	private double prix ;
	  public String toString() {
	 		return "produits  [numero_ produits =" + this.numeroproduits  + ",nom_produits =" + this.nomproduits + ", quantite  " + this.quantite
	 				+ ", prix_ produits" + this.prix+  "]";
	 		
	 }
	  public Produits  () {
	 		super();
	 	}
	     public int  getNumeroProduit() {
	 		return numeroproduits;
	 	}
	 	public void setNumeroProduit(int numeroproduits) {
	 		this.numeroproduits = numeroproduits;
	 	}
	 	public String  getNomProduit() {
	 		 return nomproduits; 
	 	 }
	 	 public void setNomProduit( String nom) {
	 		 this.nomproduits= nom; 	
	 		 }
	 	public int  getQuantite() {
	 		return quantite;
	 	}
	 	public void setQuantite(int quantite) {
	 		this.quantite = quantite;
	 	}
	 	public  double getPrix() {
	 		return prix ;
	 	}
	 	public void setPrix(double prix ) {
	 		this.prix = prix;
	 	}
	 	public Produits (int n,String nom , int q , double prix) {
	 		 super ();
	 		 this. numeroproduits = n;
	 		 this.nomproduits=nom;
	 		 this.quantite=q;
	 		 this.prix=prix;
	 	 }
}

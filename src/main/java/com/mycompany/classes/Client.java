package com.mycompany.classes;

public class Client {
	private  int numeroclient ;
    private  String nom;
    private String prenom;
    private String adresse ;
    private  String telephone;
    
    public String toString() {
		return "client  [numero_client =" + this.numeroclient  + ",nom_client =" + this.nom + ", prenom-client " + this.prenom
				+ ", adress_client " + this.adresse+ ", telephone_client" + this.telephone+  "]";
	}
    
    public Client () {
		super();
	}
    public int  getNumeroClient() {
		return numeroclient;
	}
	public void setNumeroClient(int numeroclient) {
		this.numeroclient = numeroclient;
	}
	 public String  getNom() {
		 return nom; 
	 }
	 public void setNom( String nom) {
		 this.nom= nom; 	 }
	 public String  getPrenom() {
		 return prenom; 
	 }
	 public void setPrenom( String prenom) {
		 this.prenom= prenom; 	 }
	 public String  getAdresse() {
		 return adresse; 
	 }
	 public void setAdresse( String adresse) {
		 this.adresse= adresse; 	 }

   public String  getTel() {
	return telephone;
}
public void setTel(String telephone) {
	this.telephone =telephone;
}
public Client (int n,String nom , String prenom , String  a , String tel ) {
	 super ();
	 this.numeroclient = n;
	 this.nom=nom;
	 this.prenom= prenom;
	 this.adresse=a;
	 this.telephone= tel;
}
}

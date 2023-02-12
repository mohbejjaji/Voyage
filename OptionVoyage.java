package poo.semaine3.examen;

public class OptionVoyage {
	
	   public static final double TARIF_LONG = 1500.0;
	   public static final double TARIF_BASE = 200.0;
	   private String nom;
	   private double prixForfaitaire;
	   
	   public OptionVoyage(String nom, double  prixForfaitaire){
		   this.nom = nom;
		   this.prixForfaitaire = prixForfaitaire;
	   }
	   public String getNom(){
		   return nom;
	   }
	   public double prix(){
		   return prixForfaitaire;
	   }
	   public String toString(){
		   return nom+" -> "+prixForfaitaire+" CHF";
	   }

}

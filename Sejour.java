package poo.semaine3.examen;

public class Sejour extends OptionVoyage {

	private int nombreNuit;
	private double prixNuit;
	   
	public Sejour(String nom, double prixForfaitaire, int nombreNuit, double prixNuit) {
		super(nom, prixForfaitaire);
		this.nombreNuit = nombreNuit;
		this.prixNuit = prixNuit;
	}
	@Override
	public double prix(){
		   return super.prix()+(nombreNuit*prixNuit);
	   }

	public int getNombreNuit() {
		return nombreNuit;
	}

	public double getPrixNuit() {
		return prixNuit;
	}

	
}

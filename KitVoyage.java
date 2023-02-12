package poo.semaine3.examen;

import java.util.ArrayList;

public class KitVoyage {
	
	ArrayList<OptionVoyage> kit = new ArrayList<OptionVoyage>();
	private String depart;
	private String destination;
	
	public KitVoyage(String depart, String destination) {
		super();
		this.depart = depart;
		this.destination = destination;
	}

	public String getDepart() {
		return depart;
	}

	public String getDestination() {
		return destination;
	}

	public double prix() {
		double somme = 0;
		for (OptionVoyage optionVoyage : kit) {
			somme +=optionVoyage.prix();
		}
		return somme;
	}

	@Override
	public String toString() {
		System.out.println("Voyage de " + depart + " à " + destination + " avec pour options : ");
		for (OptionVoyage optionVoyage : kit) {
			System.out.println(optionVoyage.toString());
		}
		return "Prix total : "+prix()+" CHF";
	}

	public void ajouterOption(OptionVoyage optionVoyage) {
		if(optionVoyage != null) {
			kit.add(optionVoyage);
		}
		
	}

	public void annuler() {
		kit.clear();
	}
	
    
}

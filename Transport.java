package poo.semaine3.examen;

public class Transport extends OptionVoyage {
	
	private boolean longeurTrajet;

	public Transport(String nom, double prixForfaitaire, boolean longeurTrajet) {
		super(nom, prixForfaitaire);
		this.longeurTrajet = longeurTrajet;
	}
	
	public Transport(String nom, double prixForfaitaire) {
		super(nom, prixForfaitaire);
		this.longeurTrajet = false;
	}

    @Override
	public double prix(){
		   if(longeurTrajet){
			   return super.prix() + TARIF_BASE;
		   }else {
			   return super.prix() + TARIF_LONG;
		   }
		   
	}
}

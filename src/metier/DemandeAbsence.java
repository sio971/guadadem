package metier;

import technique.DateFr;

public class DemandeAbsence {
	private DateFr laDateDemande;
	private DateFr laDateReponse;
	private String leMotifRefus;
	private Absence laAbsence;
	
	/**
	 * 
	 * @param uneDateDebut
	 * @param uneDateFin
	 * @param unMotif
	 * @param unSalarie
	 * @param uneDateDemande
	 */
	public DemandeAbsence(DateFr uneDateDebut, DateFr uneDateFin, String unMotif, Salarie unSalarie, DateFr uneDateDemande){
		laDateDemande=uneDateDemande;
	
		MotifAbsence leMotif = new MotifAbsence(unMotif);
		
		laAbsence=new Absence(uneDateDebut,uneDateFin,leMotif,unSalarie);
		laAbsence.setLeEtat("ATT");
		laAbsence.setLaDemande(this);
		
	}
	
	public DemandeAbsence(Absence uneAbsence){
		laDateDemande=new DateFr();
		laAbsence=uneAbsence;
		laAbsence.setLeEtat("ATT");
		laAbsence.setLaDemande(this);
	}

	public Absence getLaAbsence() {
		return laAbsence;
	}

	public DateFr getLaDateDemande() {
		return laDateDemande;
	}

	public DateFr getLaDateReponse() {
		return laDateReponse;
	}

	public String getLeMotifRefus() {
		return leMotifRefus;
	}
	
	public void accepter(){
		
	}
	/**
	 * Mission3-Question2
	 * constate le refus de la demande et en mémorise le motif
	 * 
	 * @param unMotifRefus
	 */
	public void refuser(String unMotifRefus){
		//todo
	}

	

	

	

	
	
	
	

}

package metier;


import java.util.ArrayList;
import java.util.List;

import technique.DateFr;

public class Absence {
	private DateFr laDateDebut;
	private DateFr laDateFin;
	private String leMotif;
	private String leEtat; //ATT pour attente, ACC pour accepté, REF pour refusé
	private Salarie leSalarie;
	private DemandeAbsence laDemande;
	
	public Absence(DateFr uneDateDebut, DateFr uneDateFin,MotifAbsence unMotif,Salarie unSalarie){
		laDateDebut=uneDateDebut;
		laDateFin=uneDateFin;
		leMotif=unMotif.getLeMotif();
		leSalarie=unSalarie;
		leEtat="ATT";
		unSalarie.ajouterAbsence(this);
		
		
	
	}

	public DateFr getLaDateDebut() {
		return laDateDebut;
	}

	public DateFr getLaDateFin() {
		return laDateFin;
	}

	public String getLeMotif() {
		return leMotif;
	}

	public String getLeEtat() {
		return leEtat;
	}

	public void setLeEtat(String leEtat) {
		this.leEtat = leEtat;
	}

	public Salarie getLeSalarie() {
		return leSalarie;
	}

	public DemandeAbsence getLaDemande() {
		return laDemande;
	}

	public void setLaDemande(DemandeAbsence laDemande) {
		this.laDemande = laDemande;
	}
	/**
	 * Mission3-Question4
	 * retourne laliste des jours ouvrables du mois spécifié que couvre l'absence
	 * le principe est de parcourir les jours d'absence et vérifier s'ils sont dans 
	 * le mois spécifié, et s'ils sont ouvrables
	 * exemple:pour une absence allant du 27/05/2016 au 06/06/2016
	 * cette méthode appelée avec les paramètres unMois=6 et uneAnnée = 2016 retournera 
	 * la collection des dates:
	 * {01/06/2016, 02/06/2016, 03/06/2016, 06/06/2016}
	 * les 4 et 5 juin 2016 ne sont pas ouvrables
	 * @param unMois
	 * @param ineAnnee
	 * @return
	 */
	public List<DateFr> getLesJoursAbsence(int unMois, int uneAnnee){
		
		
		return null;
	}

	
	


}

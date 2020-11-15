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
	 * Fournir le code de la méthode getJoursAbsence de la classe Absence.
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
		//on déclare la variable à retourner
		List<DateFr> lesJoursAbs = new ArrayList<DateFr>();
		//le principe est de parcourir les jours d'absence (entre la date début et la date fin)
		DateFr dateEnCours = this.laDateDebut;
		//on parcours les jours jusqu'à la date de fin (comprise)
		while (!dateEnCours.estApres(this.laDateFin)){
			//on regarde si la date correspond aux arguments passés (le mois, l'année)
			if (dateEnCours.getAnnee()== uneAnnee && dateEnCours.getMois() ==unMois) {
				//on regarde si le jour est ouvrable
				if (dateEnCours.estJourOuvrable()) {
					//si oui on l'ajoute aux jours d'absence
					lesJoursAbs.add(dateEnCours);
				}
			}
			//On passe au jour suivant
			dateEnCours = dateEnCours.getJourSuivant();
		}
		
		
		//on retourne le résultat
		return lesJoursAbs;
	}

	
	


}

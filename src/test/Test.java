package test;



import metier.Absence;
import metier.DemandeAbsence;
import metier.MotifAbsence;
import metier.Salarie;
import technique.DateFr;

public class Test {

	public static void main(String[] args) {
		//instancier un salarie
		Salarie paul = new Salarie("mat001", "Durand", "Paul");
		//instancier un motif d'absence
		MotifAbsence unMotif = new MotifAbsence("fatigue");
		
		//instancier une absence
		Absence uneAbsence = new Absence(new DateFr(27,5,2016), new DateFr(6,6,2016), unMotif, paul);
		
		
		//instancier une demande
		DemandeAbsence laDemande = new DemandeAbsence(uneAbsence);
		
		//afficher les demandes en attente
		
		System.out.println("les absences en attente de Paul: "+ paul.getLesAbsencesEnAttente());
		//afficher les jours d'absence
		System.out.println("les jours d'absence :"+ uneAbsence.getLesJoursAbsence(6, 2016).toString());
	}

}

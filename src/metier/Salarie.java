package metier;

import java.util.ArrayList;
import java.util.List;

public class Salarie {
	private String leMatricule;
	private String leNom;
	private String lePrenom;
	private List<Absence> lesAbsences=new ArrayList<Absence>();
	
	/**
	 * Constructeur
	 * @param unMatricule
	 * @param unNom
	 * @param unPrenom
	 */
	public Salarie(String unMatricule,String unNom,String unPrenom){
		this.leMatricule=unMatricule;
		this.leNom=unNom;
		this.lePrenom=unPrenom;
	}
	
	/**
	 * accesseur
	 * @return
	 */
	private String getLeMatricule() {
		return leMatricule;
	}
	/**
	 * 
	 * @return
	 */
	private String getLeNom() {
		return leNom;
	}
	/**
	 * 
	 * @return
	 */
	private String getLePrenom() {
		return lePrenom;
	}
	/**Fournir le code de la méthode ajouterAbsence de la classe Salarie.
	 * Mission3-Question1
	 * ajoute une absence à la collection les absences
	 * @param uneAbsence
	 */
	public void ajouterAbsence(Absence uneAbsence){
		lesAbsences.add(uneAbsence);
	}
	/**Mission3-Question3
	 * retourne la collection des absences en attente de traitement
	 * par le responsable (leEtat=ATT)
	 * @return
	 */
	public List<Absence> getLesAbsencesEnAttente(){
		
		return null;
		
		
	}
	
}

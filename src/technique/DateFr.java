package technique;


import java.time.LocalDate;
import java.util.Locale;




public class DateFr implements Comparable<DateFr> {
	
	
	LocalDate day;
	
	/**
	 * initialisation avec la date du jour
	 */
	public DateFr(){
		day=LocalDate.now();
	
	
	
	
	}
	/**
	 * initialisation avec les valeurs des paramètres
	 * @param jour
	 * @param mois
	 * @param annee
	 */
	public DateFr(int jour,int mois, int annee){
		
		
		day = LocalDate.of(annee,mois, jour);
		
	}
	
	public int getJour(){
			
		return day.getDayOfMonth();
	}
	
	public int getMois(){
		return day.getMonthValue();
	}
	
	public int getAnnee(){
		return day.getYear();
	}
	/**
	 * retourne le nb de jours dans le mois
	 * @return
	 */
	public int getNbJoursMois(){
		int nbJours = day.lengthOfMonth();
		
		return nbJours;
	}
	/**
	 * retourne true si la date est avant une date
	 * @param uneDate
	 * @return
	 */
	public boolean estAvant(DateFr uneDate){
		LocalDate autreDate=LocalDate.of(uneDate.getAnnee(),uneDate.getMois(),uneDate.getJour());
		return day.isBefore(autreDate);
	}
	/**
	 * renvoie true si la date courante est égale au paramètre
	 * uneDate
	 * false sinon
	 * @param uneDate
	 * @return
	 */
	public boolean estEgale(DateFr uneDate) {
		LocalDate autreDate = LocalDate.of(uneDate.getAnnee(),uneDate.getMois(), uneDate.getJour());
		return day.equals(autreDate);
	}
	/**
	 * retourne true si la date est après une date
	 * @param uneDate
	 * @return
	 */
	public boolean estApres(DateFr uneDate){
		LocalDate autreDate=LocalDate.of(uneDate.getAnnee(),uneDate.getMois(),uneDate.getJour());
		return day.isAfter(autreDate);
	}
	
	/**
	 * retourne la date du jour suivant
	 * @return
	 */
	public DateFr getJourSuivant(){
		
		 
		 LocalDate demain=day.plusDays(1);
		
		 int jour =demain.getDayOfMonth();
		 int  mois =demain.getMonthValue();
		 int  annee =demain.getYear();
		 
		 return new DateFr(jour,mois,annee);
	}
	public String toString(){
		return getJour()+"/"+getMois()+"/"+getAnnee();	}
	
	@Override
	public int compareTo(DateFr uneDate) {
		int res = 0;
		if (this.estAvant(uneDate)) {res = -1;}
		else { if (this.estApres(uneDate)){res = 1;}
		
		}
		return res;
	}
	
	public boolean estJourOuvrable() {
		boolean result = true;
		String jourSemaine = day.getDayOfWeek().toString().toLowerCase();
		
		
		if (jourSemaine.equals("sunday")||jourSemaine.equals("saturday")){
			result=false;
		}
		return result;
				
	}
	
	
	
	
	
	
}

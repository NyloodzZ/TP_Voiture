/**
 * Classe principale pour tester la classe Voiture
 * @author MoiMême
 * @version 1.0
 */
public abstract class AppliVoiture {
	/**
	 * Constructeur par défaut
	 */
	public AppliVoiture() {
	}

	/**
	 * Méthode principale
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String args[]){
		
		/**
		Voiture v = new Voiture(7); // voiture créée avec puissance de 7cv
		v.afficherEtat();
		v.demarre();
		v.afficherEtat();
		v.passeVitesseSup() ;			// passe la 1ère vitesse
		System.out.println("Vitesse en cours : "+v.getVitesse());
		v.retrograde() ;
		System.out.println("Vitesse en cours : "+v.getVitesse());
		v.passeVitesseSup() ;			// passe la 1ère vitesse
		v.retrograde() ; 				// point mort
		v.afficherTout();
		v.passeVitesseSup() ;			// passe la 1ère vitesse
		v.passeVitesseSup();			// passe la 2nde vitesse
		v.afficherEtat();
		v.passeVitesseSup() ;			// passe la 3ème vitesse
		v.afficherEtat();
		v.passeVitesseSup() ;			// passe la 4ème vitesse
		v.passeVitesseSup() ;			// passe la 5ème vitesse
		System.out.println("Vitesse en cours : "+v.getVitesse());
		v.passeVitesseSup() ;			// reste en 5ème !!!
		System.out.println("Vitesse en cours : "+v.getVitesse());
		v.retrograde() ;				// passe en 4ème 
		v.retrograde() ;				// passe en 3ème 
		v.retrograde() ;				// passe en 2nde 
		v.retrograde() ;				// passe en 1ère 
		v.afficherEtat();
		v.retrograde() ;				// passe au point mort
		v.afficherEtat();
		v.arrete();
		v.afficherEtat(); 
		
		*/

// Cette première ligne est le résultat du 1er appel de la méthode afficherEtat()



		Voiture v = new Voiture(7, 6);
		v.afficherEtat();
		v.passeVitesseSup();
		v.demarre();
		v.afficherEtat();
		v.passeVitesseSup();
		System.out.println("Vitesse en cours : "+v.getVitesse());
		v.passeVitesseSup();
		v.passeVitesseSup();
		v.passeVitesseSup();
		v.passeVitesseSup();
		v.passeVitesseSup();
		v.passeVitesseSup();
		System.out.println("Vitesse en cours : "+v.getVitesse());
		v.afficherTout();
		v.arrete();
		v.retrograde();
		v.retrograde();
		v.retrograde();
		v.retrograde();
		v.retrograde();
		v.retrograde();
		v.retrograde();
		v.afficherEtat();
		v.arrete();
		v.afficherEtat();

	}
}
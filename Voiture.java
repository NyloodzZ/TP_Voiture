/** Classe représentant une voiture
 * @author MoiMême
 * @version 1.0
 */
public class Voiture {
    
    // attributs privés
    private final int puissance; // en chevaux
    private int vitesse = 0;   // levier de vitesse
    private int NbVitesse = 5;  // Nombre de vitesse dans la voiture
    private boolean demarree = false; // true si la voiture est démarrée, false sinon

    // constructeurs
    // constructeur 1
    /**
     * Constructeur de la classe Voiture
     * @param puissanceCV La puissance de la voiture en chevaux
     */
    public Voiture(int puissanceCV){
        this.puissance = puissanceCV;
    }

    // constructeur 2
    /**
     * Constructeur de la classe Voiture avec nombre de vitesses personnalisé
     * @param puissanceCV La puissance de la voiture en chevaux
     * @param LeNbVitesse Le nombre de vitesses de la voiture
     */
    public Voiture(int puissanceCV, int LeNbVitesse){
        this.puissance = puissanceCV;
        this.NbVitesse = LeNbVitesse;
    }

    // méthodes publiques
    /**
     * Démarre la voiture en mettant la vitesse à 0
     */
    public void demarre() {
        this.vitesse = 0;
        this.demarree = true;
    }
    
    /**
     * Arrête la voiture si elle est au point mort (vitesse 0)
     */
    public void arrete() {
        if (this.vitesse == 0) {
            this.demarree = false;
            this.vitesse = 0;
        } else {
            System.out.println("Vous ne pouvez pas vous arreter si vous n'êtes pas au point mort !");
        }
    }

    /**
     * Retrograde la voiture si elle est en marche
     */
    public void retrograde() {
        if (this.vitesse > 0) {
            this.vitesse--;
        } else {
            System.out.println("Vous ne pouvez pas retrograder en dessous de la vitesse 0 (point mort)");
        }
    }

    /**
     * Passe à la vitesse supérieure si la voiture est en marche
     */
    public void passeVitesseSup() {
        if (!this.demarree){
            System.out.println("Vous devez demarrer la voiture pour passer une vitesse !");
        } else if (this.vitesse < this.NbVitesse) {
            this.vitesse++;
        } else {
            System.out.println("Vous êtes déjà à la vitesse maximale");
        }
    }

    /**
     * Getter de la puissance
     * @return la puissance actuelle de la voiture
     */
    public int getPuissance() {
        return this.puissance;
    }

    /**
     * Getter de la vitesse
     * @return la vitesse actuelle de la voiture
     */
    public int getVitesse() {
        return this.vitesse;
    }

    /**
     * Indique si la voiture est démarrée
     * @return true si la voiture est démarrée, false sinon
     */
    public boolean estDemarree() {
        return this.demarree;
    }

    /**
     * Affiche l'état complet de la voiture
     */
    public void afficherTout() {
        if (this.demarree) {
            System.out.println("La voiture est démarrée. A la vitesse "+getVitesse()+" avec "+getPuissance()+" de puissance.");
        } else {
            System.out.println("La voiture n'est pas démarrée, donc est à la vitesse 0 et a "+getPuissance()+" de puissance.");
        }
    }

    /**
     * Affiche l'état de la voiture (démarrée/arrêtée et vitesse)
     */
    public void afficherEtat() {
        if (!this.demarree) {
            System.out.println("Voiture arrêtée.");
        } else if (this.vitesse == 0) {
            System.out.println("Voiture démarée au point mort.");
        } else if (this.vitesse == 1) {
            System.out.println("Voiture démarrée en " + this.vitesse + "ère vitesse.");
        } else if (this.vitesse == 2) {
            System.out.println("Voiture démarrée en " + this.vitesse + "nde vitesse.");
        } else {
            System.out.println("Voiture démarrée en " + this.vitesse + "ème vitesse.");
        }
    }
}

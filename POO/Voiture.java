package POO;

public class Voiture {
    private String nom = "Aucun nom";
    public int vitesse = 0;
    String color = "Incolore";

    // constructeur
    Voiture() {
        System.out.println("constructeur");
    }

    Voiture(String nom, int vitesse, String color) {
        this.nom = nom;
        this.color = color;
        this.vitesse = vitesse;
    }

    // accesseurs - modificateurs
    public String getNom(){return this.nom;} 

    public void setNom(String nom){this.nom = nom;} 


    // méthodes
    static void accélérer() {
        System.out.println(" accélération");
    }

    public void tourner() {
        System.out.println(this.nom + " tourne");
    }

    public void rouler() {
        System.out.println(this.nom + " roule");
    }

    public void freiner() {
        System.out.println(this.nom + " freine");
    }
}
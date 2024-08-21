package GDE;

public class Employe {
    private int ID;
    private String nom;
    private String poste;
    private Double salaire;

    Employe(String nom, String poste, Double salaire) {
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    public void getEmployee() {
        System.err.println("ID : " + this.ID);
        System.err.println("NOM : " + this.nom);
        System.err.println("POSTE : " + this.poste);
        System.err.println("SALAIRE : " + this.salaire);
    }

    public void setEmployee(int id, String nom, String poste, Double salaire) {
        this.ID = id;
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }
}

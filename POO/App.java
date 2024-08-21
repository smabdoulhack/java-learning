package POO;
public class App {
    public static void main(String[] args) {
            Voiture voiture = new Voiture("Audi", 25, "rouge");

            Voiture.accélérer();
            System.out.println(voiture.getNom());
            voiture.tourner();
            voiture.rouler();
            voiture.freiner();

            nettoyage();
            App essai = new App();
            essai.nettoyage1();
    }

    static void nettoyage(){
        System.out.println("static methode");
    }

    public void nettoyage1(){
        System.out.println("public methode");
    }
}
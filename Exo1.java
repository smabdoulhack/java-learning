public class Exo1 {
    public static void main(String[] args) {
        exo2();
        exo5("123456789");
    }

    /********** IF-ELSE - TERANAIRE *********/
    public static void parite(int arg) {
        System.out.println(arg % 2 == 0 ? "pair" : "impair");
    }

    public static void maxOfThrees(double nbr1, double nbr2, double nbr3) {
        double firstComp = nbr1 > nbr2 ? nbr1 : nbr2;
        double max = firstComp > nbr3 ? firstComp : nbr3;
        System.out.println("Le plus grand des nombres est : " + max);
    }

    public static void ageRange(int age) {
        if (age == 0 && age <= 12) {
            System.out.println("Enfant");
        } else if (age > 12 && age <= 19) {
            System.out.println("Adolescent");
        } else if (age > 20 && age <= 64) {
            System.out.println("Adulte");
        } else if (age > 65) {
            System.out.println("Sénior");
        }
    }

    public static void succOrFail(double arg) {
        System.out.println(arg >= 50 ? "Succès" : "Failled");
    }

    public static void remaind(double arg) {
        double remise;
        if (arg >= 100) {
            remise = arg * 10 / 100;
        }
        System.out.println(arg);
    }

    /********** BOUCLES *********/
    /** Utiliser une boucle for pour afficher les nombres pairs entre 1 et 20. */
    public static void exo1() {
        for (int i = 0; i <= 20; i = i + 2) {
            System.err.println(i);
        }
    }

    /** Utiliser une boucle while pour calculer la somme des entiers de 1 à 10. */
    public static void exo2() {
        int i = 0, sum = 0;
        while (i < 10) {
            i++;
            sum += i;
        }
        System.err.println("la somme des entiers de 1 à 10 est : " + sum);
    }

    /** Utiliser une boucle do-while pour inverser les chiffres d'un nombre. */
    public static void exo3(String number) {
        int i = number.length();
        String reversedStr = "";
        do {
            i--;
            reversedStr += number.charAt(i);
        } while (i > 0);
        System.err.println("Le nombre inversé est : " + reversedStr);
    }

    /**
     * Utiliser une boucle for pour trouver le plus grand nombre dans une série de
     * nombres donnés par l'utilisateur.
     */
    public static void exo4(double a, double b, double c) {
        for (int i = 0; i < 3; i++) {

        }
    }

    /**
     * Utiliser une boucle while pour compter le nombre de chiffres pairs dans un
     * nombre donné.
     */
    public static void exo5(String number) {
        int i = number.length() - 1;
        int counter = 0;
        while (i > 0) {
            int numb = (int) number.charAt(i);
            if ((numb % 2) == 0)
                counter++;
            i--;
        }
        System.err.println("le nombre de nombres pairs est : " + counter);
    }

}
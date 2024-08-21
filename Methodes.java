public class Methodes {
    public static void main(String[] args) {
        System.out.println("le factorielle de 5 est : " + factorielle(5));
        reverseString("hello");

    }

    public int sum(int nbr1, int nbr2) {
        return nbr1 + nbr2;
    }

    public boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static int factorielle(int number) {
        int acc = 1;
        for (int i = 1; i <= number; i++) {
            acc *= i;
        }
        return acc;
    }

    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("La valeur inversée de hello est : " + reversedStr);
        return reversedStr;
    }

    public static int multiply(int a, int b){
        int prod = a * b;
        System.out.println("a x b = " + prod);
        return prod;
    }

    public static double multiply(double a, double b){
        double prod = a * b;
        System.out.println("a x b = " + prod);
        return prod;
    }
}

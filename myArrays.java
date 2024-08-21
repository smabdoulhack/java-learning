import java.util.Arrays;

public class myArrays {
    public static void main(String[] args) {
        String[] codes; // décaration d'une variable contenant un tableau de chaînes de caractères
        char[] alphabet; // déclaration d'une variable devant contenir un tableau de char
        String[] fruits = new String[5];
        int[] numbers1 = { 40, 15, 78, 62 };
        byte[] myBytes = { 126, 15, 78 };

        myBytes[0] = 17;
        System.out.println(myBytes[0]);

        fruits[0] = "Pomme";
        fruits[1] = "Orange";
        fruits[2] = "Mangue";
        fruits[3] = "Banane";
        fruits[4] = "ChapChap";

        // affichage des éléments d'un tableau
        // for (int i = 0; i < fruits.length; i++) {
        // System.err.println("L'élément à l'index " + i + " est : " + fruits[i]);
        // }

        /*********** METHODES DES TABLEAUX ***********/
        // trier un tableau par ordre croissant avec la méthode sort Arrays.sort()
        // Arrays.sort(numbers1);
        // for (int i = 0; i < numbers1.length; i++) {
        // System.err.println("L'élément à l'index " + i + " est : " + numbers1[i]);
        // }

        // displayEvens(numbers1);
        arrayMaxAndMin(numbers1);
        long[] testNumbers = { 40, 15, 78, 62 };
        long searchedNumber = 78;
        searchPosition(testNumbers, searchedNumber);

    }

    /**
     * Trier un tableau d'entiers en ordre croissant.
     * 
     * @param array
     */
    public static void sortArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.err.println("L'élément à l'index " + i + " est : " + array[i]);
        }
    }

    /**
     * : Filtrer et afficher uniquement les éléments pairs d'un tableau d'entiers.
     * 
     * @param numbers
     */
    public static void displayEvens(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.err.println("L'élément à l'index " + i + " est : " + numbers[i]);
            }
        }
    }

    public static void arrayMaxAndMin(int[] numbers) {
        int max = numbers[0], min = max;
        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i] > max ? numbers[i] : max;
            min = numbers[i] < min ? numbers[i] : min;
        }
        System.out.println("Max : " + max + " Min : " + min);
    }

    public static void searchPosition(long[] numbers, long number) {
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, number);
        System.out.println("Index: " + index);
    }

    public static void delDoubles(int[] numbers) {

    }

}
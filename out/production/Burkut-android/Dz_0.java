import java.util.Arrays;

 import java.util.Arrays;

public class Dz_0 {

    public static void main(String[] args) {
        String word1 = "taC";
        String word2 = "atc";

        isAnagram(word1, word2);
    }

    static void isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.isEmpty() || b.isEmpty()) {
            System.out.print(" Missing object to compare ");
        }

        char[] stingA = a.toCharArray();
        char[] stringB = b.toCharArray();

        Arrays.sort(stingA);
        Arrays.sort(stringB);


        if (Arrays.equals(stingA, stringB)) {
            System.out.println(" true ");
        } else {
            System.out.println(" false ");
        }
    }
}





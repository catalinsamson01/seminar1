package lab1.exercise.CentauriPrime;

import java.util.ArrayList;
import java.util.List;

public class CentauriPrime {
    public static void main(String[] args) {

//        VARIANTA 2 APELARE
        String[] kingdoms = {"Mollastarian", "Auritania", "Zizily", "Iasi", "Suceava", "Pascani", "Ilfov"};
        List<String> aliceKingdoms = new ArrayList<>();
        List<String> bobKingdoms = new ArrayList<>();

        Splitter splitter = new Splitter();
        splitter.split(kingdoms, aliceKingdoms, bobKingdoms);
        System.out.println("Alice's Kingdoms: " + aliceKingdoms);
        System.out.println("Bob's Kingdoms: " + bobKingdoms);

        System.out.println("------------------------------------------");


//        VARIANTA 1 APELARE
        String kingdom1 = "Molastashfsd";
        String kingdom2 = "Molastashfsa";
        String kingdom3 = "Molastashfsy";
        String kingdom4 = "Molastashfsd";
        String kingdom5 = "Molastashfse";

        System.out.println("Ruler of kingdom " + kingdom1 + " is " + getRuler(kingdom1));
        System.out.println("Ruler of kingdom " + kingdom2 + " is " + getRuler(kingdom2));
        System.out.println("Ruler of kingdom " + kingdom3 + " is " + getRuler(kingdom3));
        System.out.println("Ruler of kingdom " + kingdom4 + " is " + getRuler(kingdom4));
        System.out.println("Ruler of kingdom " + kingdom5 + " is " + getRuler(kingdom5));




    }

//    VARIANTA 1

    public static String getRuler(String kingdom){
        String ruler = "Bob";
        String[] vowels = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        String[] ys = {"Y", "y"};
        String lastLetter = kingdom.substring(kingdom.length()-1);

        for (String v: vowels){
            if (v.equals(lastLetter)){
                ruler = "Alice";
                break;
            }
        }
        for (String y : ys){
            if (y.equals(lastLetter)){
                ruler = "nobody";
                break;
            }
        }
        return ruler;
    }


}

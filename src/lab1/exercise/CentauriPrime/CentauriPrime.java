package lab1.exercise.CentauriPrime;

import java.util.ArrayList;
import java.util.List;

public class CentauriPrime {
    public static void main(String[] args) {

        String[] kingdoms = {"Mollastarian", "Auritania", "Zizily"};
        List<String> aliceKingdoms = new ArrayList<>();
        List<String> bobKingdoms = new ArrayList<>();

        Splitter splitter = new Splitter();
        splitter.split(kingdoms, aliceKingdoms, bobKingdoms);
        System.out.println("Alice's Kingdoms: " + aliceKingdoms);
        System.out.println("Bob's Kingdoms: " + bobKingdoms);




    }


}

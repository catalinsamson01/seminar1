package lab1.exercise.CentauriPrime;

import java.util.List;

public class Splitter {

//    VARIANTA 2

    public void split (String[] kingdoms, List<String> aliceKingdoms, List<String> bobKingdoms){
        
        for (String str : kingdoms) {
           char lastChar = str.charAt(str.length()-1);
           if (lastChar == 'y' || lastChar == 'Y'){
               continue;
           } else if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u'
                   || lastChar == 'A' || lastChar == 'E' || lastChar == 'I' || lastChar == 'O' || lastChar == 'U') {
               aliceKingdoms.add(str);
           }else {
               bobKingdoms.add(str);
           }

        }



    }
}

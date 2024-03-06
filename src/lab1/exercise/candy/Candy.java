package lab1.exercise.candy;

public class Candy {

   public static void main(String[] args) {

       int m = 3;
       int[] bags = {1, 2, 3, 4, 5, 6, 7};
       int solution = reminder(m, bags);
       System.out.println("Remaining candies: " + solution);



//           double[] arrayInitial = {10.0, 20.0, 30.0, 40.0};
//           double nr = 5.0;
//
//           double[] rezultat = impartireArray(arrayInitial, nr);
//
//           // Afiseaza array-ul rezultat
//           for (double valoare : rezultat) {
//               System.out.println(valoare);
//           }


   }

    public static int reminder(int m, int[] bags) {
        int sum = 0;

        for (int i : bags) {
            sum += 1;
        }
        return sum % m;
    }

//    public static double[] impartireArray(double[] array, double nr) {
//        double[] rezultat = new double[array.length]; // Inițializează un array cu aceeași lungime ca și array-ul dat
//
//        for (int i = 0; i < array.length; i++) {
//            rezultat[i] = array[i] / nr; // Efectuează împărțirea și stochează rezultatele în array-ul rezultat
//        }
//
//        return rezultat; // Returnează array-ul rezultat
//    }

}

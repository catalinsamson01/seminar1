package lab1.exercise.angryProfessor;

public class Main {

    public static void main(String[] args) {

        int minimumNumOfStudents= 3;
        int[] arrivalTimes = {-2, -3, -5, 6, 7, 9};
        System.out.println("Is class canceled? " + isClassCanceled(minimumNumOfStudents, arrivalTimes));

    }

    public static boolean isClassCanceled(int minimumNumOfStudents, int[] arrivalTimes) {
        int arrivedStudent = 0;
        for (int arrivalTime : arrivalTimes) {
            if (arrivalTime > 0) {
                arrivedStudent++;
            }
            }
        if (arrivedStudent >= minimumNumOfStudents){
            return false;
        }else {
            return true;
        }
    }
}

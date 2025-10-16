import java.util.Scanner;

public class assignGrades {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int totalStudent = input.nextInt();

        int[] scores = new int[totalStudent];

        int best = 0;
        
        for (int i = 0; i < totalStudent; i++) {
            scores[i] = input.nextInt();
            if (i == 0) {
                best = scores[i];
            } else {
                if (best < scores[i]) {
                    best = scores[i];
                }
            }
        }

        String[] grade = new String[totalStudent];

        for (int i = 0; i < totalStudent; i++) {
            if (scores[i] >= best - 10) {
                grade[i] = "A";
            } else if (scores[i] >= best - 20) {
                grade[i] = "B";
            } else if (scores[i] >= best - 30) {
                grade[i] = "C";
            } else if (scores[i] >= best - 40) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }
        
        for (int i = 0; i < totalStudent; i++) {
            System.out.println("Student " + (i+1) + " : " + grade[i]);
        }
    }
}

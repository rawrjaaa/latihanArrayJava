import java.util.Scanner;

public class analyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100]; //skor maksimal 100
        int total = 0;
        int counter = 0;

        for (int i = 0; i < 100; i++) {
            scores[i] = input.nextInt();
            
            if (scores[i] < 0) {
                break;
            } else {
                total += scores[i];
                counter++;
            }
        }

        int avg = total / counter;
        int counterAbove = 0;
        int counterBelow = 0;

        for (int i = 0; i < counter;i ++) {
            if (scores[i] >= avg) {
                counterAbove++;
            }
            if (scores[i] < avg) {
                counterBelow++;
            }
        }

        System.out.println("Above or equal the avg: " + counterAbove);
        System.out.println("Below the avg: " + counterBelow);
    }
}

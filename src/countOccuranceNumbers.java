import java.util.Scanner;

public class countOccuranceNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] counts = new int[101]; //indeks 1-100

        while (true) { 
            int num = input.nextInt();
            if (num == 0) {
                break;
            }

            if (num > 0 && num <= 100) {
                counts[num]++;
            }
        }

        for (int i = 0; i < 101; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " " + (counts[i] > 1 ? "times" : "time"));
            }
        }
    }
}

import java.util.Scanner;

public class hutanLabirin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int N = input.nextInt();

        int A = -1;

        for (int i = 1; i <= N; i++) {
            if (X % 2 == 1) {
                X = X * 10;
            } else {
                X = X / 2;
            }

            if (X > 1000) {
                A = i;
                break;
            }
        }

        if (A != -1) {
            System.out.println("Berhasil keluar pada langkah ke-" + A);
        } else {
            System.out.println("Terjebak setelah " + N + " langkah");
        }
    }
}

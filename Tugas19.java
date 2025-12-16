import java.util.Scanner;

public class Tugas19 {

    static int totalRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0; 
        } else {
            return angka[n - 1] + totalRekursif(angka, n - 1);
        }
    }
    static int totalIteratif(int[] angka) {
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] angka = new int[n];
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: "
                + totalRekursif(angka, n));
    }
}
    

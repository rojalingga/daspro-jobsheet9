import java.util.Scanner;

public class Tugas1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int banyakNilai = sc.nextInt();

        int[] nilaiMhs = new int[banyakNilai];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }
        }

        double rataRata = (double) total / banyakNilai;

        System.out.println();
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println();

        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }
}

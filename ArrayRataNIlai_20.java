import java.util.Scanner;

public class ArrayRataNIlai_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0;
        double rata2, nilaiLulus = 0, nilaiTidakLulus = 0, rataLulus, rataTidakLulus;
        int lulus = 0, tidakLulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length ; i++) {
            if (nilaiMhs[i] >= 70) {
                lulus++;
                nilaiLulus += nilaiMhs[i];
            } else if (nilaiMhs[i] < 70) {
                tidakLulus++;
                nilaiTidakLulus += nilaiMhs[i];
            }
        }

        rataLulus = nilaiLulus / lulus;
        rataTidakLulus = nilaiTidakLulus / tidakLulus;

        System.out.println("Rata - rata nilai lulus = " +rataLulus);
        System.out.println("Rata - rata nilai lulus = " +rataTidakLulus);
    }
}
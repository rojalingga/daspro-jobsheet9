import java.util.Scanner;

public class Tugas3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Mie Ayam", "Nasi Goreng", "Mie Goreng", "Kentang Goreng", 
            "Teh", "Kopi", "Es Jeruk", "Es Teh Manis", "Ayam Goreng", 
            "Ayam Bakar", "Ikan Bakar", "Sate Ayam", "Sate Kambing", 
            "Bakso", "Soto Ayam", "Sop Buntut", "Tahu Goreng", 
            "Tempe Goreng", "Jus Alpukat", "Jus Mangga"
        };        
        String key;
        int hasil = 0;
        boolean ditemukan = false;

        System.out.println("------------Daftar Menu------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " +menu[i]);
        }

        System.out.print("Masukkan Makanan/Minuman yang anda cari : ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil = i + 1;
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println(key+ " ditemukan pada menu nomor " +hasil);
        } else {
            System.out.println(key+ " tidak ditemukan pada menu");        
        }
        System.out.println();


    }
}

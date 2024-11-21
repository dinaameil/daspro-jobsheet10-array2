import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan = 0;

        while (pilihan != 3) { 
            System.out.println("\nMenu Bioskop:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                
                System.out.print("\nMasukkan nama: ");
                String nama = sc.nextLine();
                int baris, kolom;

                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia. Silakan coba lagi.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi! Pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("\nDaftar Kursi Bioskop:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi.");

            } else {
                System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }
        }

        sc.close(); 
    }
}

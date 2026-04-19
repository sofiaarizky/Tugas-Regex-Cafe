package pemesanan_makanan;

import java.util.Scanner;

public class PemesananMakanan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, waktu, tipe, menu = "", semuaPesanan = "";
        boolean valid;
        int pilih, harga = 0, jumlah, totalItem, no = 1, totalBayar = 0;
        char lagi;
        System.out.println("======= SISTEM PEMESANAN CAFE DIGITAL =======");
        do {
            System.out.print("Masukkan nama Anda                : ");
            nama = input.nextLine();
            valid = nama.matches("^[a-zA-Z\\s]+$");
            if (!valid) {
                System.err.println("Nama tidak valid! (Hanya huruf & spasi)");
            }
        } while (!valid);
        do {
            System.out.print("Masukkan waktu pengambilan (HH:mm): ");
            waktu = input.nextLine();
            valid = waktu.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
            if (!valid) {
                System.err.println("Format waktu salah! Contoh: 13:45");
            }
        } while (!valid);
        do {
            System.out.print("Tipe Pesanan (DINE-IN/TAKE-AWAY)  : ");
            tipe = input.nextLine().toUpperCase();
            valid = tipe.matches("^(DINE-IN|TAKE-AWAY)$");
            if (!valid) {
                System.err.println("Ketik DINE-IN atau TAKE-AWAY!");
            }
        } while (!valid);
        System.out.println("================ DAFTAR MENU ================");
        System.out.println("1. Pure Matcha Shot                   Rp20000");
        System.out.println("2. Matcha Latte                       Rp25000");
        System.out.println("3. Matcha Espresso Fusion             Rp28000");
        System.out.println("4. Matcha Frappuccino                 Rp32000");
        System.out.println("5. Strawberry Matcha Latte            Rp30000");
        System.out.println("6. Matcha Mille Crepes                Rp28000");
        System.out.println("7. Matcha Croissant                   Rp24000");
        System.out.println("8. Matcha Tiramisu                    Rp35000");
        do {
            do {
                System.out.print("\nPilih menu (1-8)          : ");
                pilih = input.nextInt();
                if (pilih < 1 || pilih > 8) {
                    System.err.println("Pilihan harus 1-8!");
                }
            } while (pilih < 1 || pilih > 8);
            switch (pilih) {
                case 1:
                    menu = "Pure Matcha Shot";
                    harga = 20000;
                    break;
                case 2:
                    menu = "Matcha Latte";
                    harga = 25000;
                    break;
                case 3:
                    menu = "Matcha Espresso Fusion";
                    harga = 28000;
                    break;
                case 4:
                    menu = "Matcha Frappuccino";
                    harga = 32000;
                    break;
                case 5:
                    menu = "Strawberry Matcha Latte";
                    harga = 30000;
                    break;
                case 6:
                    menu = "Matcha Mille Crepes";
                    harga = 28000;
                    break;
                case 7:
                    menu = "Matcha Croissant";
                    harga = 24000;
                    break;
                case 8:
                    menu = "Matcha Tiramisu";
                    harga = 35000;
                    break;
            }
            do {
                System.out.print("Jumlah pesanan            : ");
                jumlah = input.nextInt();
                if (jumlah <= 0) {
                    System.err.println("Jumlah harus lebih dari 0!");
                }
            } while (jumlah <= 0);
            totalItem = harga * jumlah;
            totalBayar += totalItem;
            semuaPesanan += no + ". " + menu + " x" + jumlah + " = Rp" + totalItem + "\n";
            no++;
            System.out.print("Tambah pesanan lagi? (y/n): ");
            lagi = input.next().charAt(0);
            input.nextLine();
        } while (lagi == 'y' || lagi == 'Y');
        System.out.println("=============================================");
        System.out.println("PESANAN BERHASIL DICATAT!");
        System.out.println("\nNama : " + nama);
        System.out.println("Menu : \n" + semuaPesanan);
        System.out.println("Waktu: " + waktu);
        System.out.println("Tipe : " + tipe);
        System.out.println("=============================================");
        System.out.println("TOTAL BAYAR : Rp" + totalBayar);
    }
}

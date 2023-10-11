
import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    //pendeklarasian
    private String nama;
    private int jumlah;

    //function/METHOD
    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + nama + ", Jumlah: " + jumlah;
    }
}

public class coba_update {
    private static ArrayList<Barang> inventaris = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Inventaris");
            System.out.println("3. Update Jumlah Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    lihatInventaris();
                    break;
                case 3:
                    updateJumlahBarang();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBarang() {
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline

        Barang barang = new Barang(nama, jumlah);
        inventaris.add(barang);
        System.out.println("Barang berhasil ditambahkan ke inventaris.");
    }

    private static void lihatInventaris() {
        System.out.println("Inventaris Gudang Supermarket:");
        for (Barang barang : inventaris) {
            System.out.println(barang);
        }
    }

    private static void updateJumlahBarang() {
        System.out.print("Masukkan nama barang yang akan diupdate: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah baru: ");
        int jumlahBaru = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline

        for (Barang barang : inventaris) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                barang.setJumlah(jumlahBaru);
                System.out.println("Jumlah barang berhasil diupdate.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan dalam inventaris.");
    }
}

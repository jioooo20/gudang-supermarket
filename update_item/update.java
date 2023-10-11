
import java.util.Scanner;


public class update {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBrg, tipeBrg, supplier, inGdg, prdDate, expDate;
        Double harga;
        int idBrg, stokBrg, fitur, menu;
        boolean exit = false;

        while (true) {
            System.out.println("======Update Item Information======");
            System.out.println("Silahkan Pilih");
            System.out.println("1. Update");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Nomor: ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1) {
                System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
                namaBrg = input.nextLine();
                
                    System.out.println("============================");
                    System.out.println("Part yang ingin anda ubah:");
                    System.out.println("1. Nama Barang");
                    System.out.println("2. Kategori Barang");
                    System.out.println("3. Tanggal Masuk Barang");
                    System.out.println("4. Tanggal Produksi Barang");
                    System.out.println("5. Tanggal Kadaluarsa Barang");
                    System.out.println("6. Harga Barang");
                    System.out.println("7. Jumlah Stok Barang");
                    System.out.println("8. Selesai");
                    System.out.print("Pilih menu: ");
                    int pilihan = input.nextInt();
                    input.nextLine(); // Membuang karakter newline

                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan Nama Barang Baru: ");
                            namaBrg = input.nextLine();
                            break;
                        case 2:
                            System.out.print("Masukkan Kategori Barang Baru: ");
                            tipeBrg = input.nextLine();
                            break;
                        case 3:
                            System.out.print("Masukkan Tanggal Masuk Baru: ");
                            supplier = input.nextLine();
                            break;
                        case 4:
                            System.out.print("Masukkan Tanggal Produksi Baru: ");
                            prdDate = input.nextLine();
                        case 5:
                            System.out.print("Masukkan Tanggal Kadaluarsa Baru: ");
                            expDate = input.nextLine();
                            break;
                        case 6:
                            System.out.print("Masukkan Harga Barang Baru: ");
                            harga = input.nextDouble();
                            break;
                        case 7:
                            System.out.print("Masukkan Jumlah Stok Barang Baru: ");
                            stokBrg = input.nextInt();
                            break;
                        case 8:
                            System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                            exit = true;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    System.out.println("Barang " + namaBrg + " berhasil diperbarui ");
                

            } else if (menu == 2) {
                System.out.println("Masukkan Nama Barang yang ingin dihapus: ");
                namaBrg = input.nextLine();
                System.out.println("Data barang " + namaBrg + " telah berhasil dihapus");

            } else {
                System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1 atau 2");
            }
        }
    }
}

package update_item;
import java.util.Scanner;


public class update {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBrg, tipeBrg, supplier, inGdg, prdDate, expDate;
        Double harga;
        int idBrg, stokBrg, fitur, menu;

        System.out.println("======Update Item Information======");
                System.out.println("Pilih Menu Anda");
                System.out.println("1. Update");
                System.out.println("2. Hapus");
                System.out.println("Masukkan Nomor Menu: ");
                menu = input.nextInt();
                input.nextLine();
                if (menu == 1) {
                    System.out.println("Masukkan Nama Barang yang ingin anda edit: ");
                    namaBrg = input.nextLine();
                    System.out.println("Masukkan Nama Barang Baru: ");
                    namaBrg = input.nextLine();
                    System.out.println("Masukkan Kategori Barang Baru: ");
                    tipeBrg = input.nextLine();
                    System.out.println("Masukkan Nama Supplier Baru: ");
                    supplier = input.nextLine();
                    System.out.println("Masukkan Jumlah Stok Barang Baru: ");
                    stokBrg = input.nextInt();
                    System.out.println("Masukkan id Barang Baru: ");
                    idBrg = input.nextInt();
                    System.out.println("Barang " + namaBrg + " dengan id " + idBrg + " dari supplier " + supplier
                            + " telah berhasil diupdate");
                } else if (menu == 2) {
                    System.out.println("Masukkan id Barang yang ingin dihapus: ");
                    idBrg = input.nextInt();
                    System.out.println("Data barang id " + idBrg + " telah berhasil dihapus");

                } else {
                    System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1 atau 2");
                }
    }
}

import java.util.Scanner;

/**
 * stok
 */
public class stok {

    public static void main(String[] args) {
        Scanner stk = new Scanner(System.in);
        String namaBrg;
        int stokAwal, stokOut, stokRusak, stokTambah, stokToday;

        System.out.print("Nama Barang: ");
        namaBrg = stk.nextLine();
        System.out.print("Masukkan Jumlah Stok Awal: ");
        stokAwal = stk.nextInt();
        System.out.print("Jumlah Stok Rusak: ");
        stokRusak = stk.nextInt();
        System.out.print("Jumlah Stok Yang Keluar: ");
        stokOut = stk.nextInt();
        System.out.print("Penambahan Stok: ");
        stokTambah = stk.nextInt();

        stokToday = stokAwal - stokRusak - stokOut + stokTambah;
        System.out.println("Banyak stok " + namaBrg + " saat ini sejumlah " + stokToday);

    }
}
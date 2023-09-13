import java.util.Scanner;

public class gudang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, beratBrg, stokBrg;
        String namaBrg, tipeBrg, inGdg, outGdg, prdDate, expDate;

        System.out.println("Masukkan ID barang: ");
        id = input.nextInt();
        System.out.println("Nama barang: ");
        namaBrg = input.nextLine();
        System.out.println("Berat barang: ");
        beratBrg = input.nextInt();
        System.out.println("Tipe barang: ");
        tipeBrg = input.nextLine();
        System.out.println("Tanggal masuk gudang: ");
        inGdg = input.nextLine();
        System.out.println("Tanggal keluar gudang: ");
        outGdg = input.nextLine();
        System.out.println("Tanggal Produksi: ");
        prdDate = input.nextLine();
        System.out.println("tanggal kadaluwarsa: ");
        expDate = input.nextLine();
        System.out.println("Jumlah Stok barang: ");
        stokBrg = input.nextInt();

        // output
        System.out.println("Masukkan ID barang: " + id);

    }
}

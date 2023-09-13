import java.util.Scanner;

//note gudang lengkap
public class gudang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // variable dan tipe data
        String id, beratBrg, stokBrg, namaBrg, tipeBrg, inGdg, outGdg, prdDate, expDate;
        // input
        System.out.println("Masukkan ID barang: ");
        id = input.nextLine();
        System.out.println("Nama barang: ");
        namaBrg = input.nextLine();
        System.out.println("Berat barang: ");
        beratBrg = input.nextLine();
        System.out.println("Tipe barang: ");
        tipeBrg = input.nextLine();
        System.out.println("Tanggal masuk gudang: ");
        inGdg = input.nextLine();
        System.out.println("Tanggal keluar gudang: ");
        outGdg = input.nextLine();
        System.out.println("Tanggal Produksi: ");
        prdDate = input.nextLine();
        System.out.println("Tanggal kadaluwarsa: ");
        expDate = input.nextLine();
        System.out.println("Jumlah Stok barang: ");
        stokBrg = input.nextLine();

        // output
        System.out.println("=======Data berhasil dimasukkan======");
        System.out.println("Id barang: " + id);
        System.out.println("Nama barang: " + namaBrg);
        System.out.println("Berat barang: " + beratBrg);
        System.out.println("Tipe barang: " + tipeBrg);
        System.out.println("Tanggal masuk gudang: " + inGdg);
        System.out.println("Tanggal keluar gudang: " + outGdg);
        System.out.println("Tanggal Produksi: " + prdDate);
        System.out.println("Tanggal kadaluwarsa: " + expDate);
        System.out.println("Jumlah Stok barang: " + stokBrg);

    }
}

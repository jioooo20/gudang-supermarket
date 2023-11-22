package tugasKelompok;

import java.util.Scanner;

public class fungsi1 {
    // array diletakkan di class agar semua function dapat mengakses
    static String[] namaBrg = new String[20];
    static String[] tipeBrg = new String[20];
    static String[] prdDate = new String[20];
    static String[] expDate = new String[20];
    static String[] supplier = new String[20];
    static String[] konSupp = new String[20];
    static String[] alamatSupp = new String[20];
    static double[] harga = new double[20];
    static int[] stokBrg = new int[20];
    static String[] cabang = new String[3];

    static int firstEmptyNull() {// mencari null yang muncul pertama muncul
        int index = -1;
        for (int i = 0; i < namaBrg.length; i++) {
            if (namaBrg[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void inputNewData(Scanner input) {// function input data
        System.out.println("========================================");
        System.out.println("=========Item Entry and Storage=========");
        System.out.println("========================================");
        System.out.print("Masukkan Nama Barang (Gunakan '-' untuk spasi) : ");
        String newNamabrg = input.next();
        System.out.print("Masukkan Nama Supplier (Gunakan '-' untuk spasi) : ");
        String newSupp = input.next();
        System.out.print("Masukkan Tipe Barang: ");
        String newtipebrg = input.next();
        System.out.print("Masukkan Tanggal Produksi(DD-MM-YYYY): ");
        String newprdDate = input.next();
        System.out.print("Masukkan Tanggal Kadaluwarsa(DD-MM-YYYY): ");
        String newexpDate = input.next();
        System.out.print("Masukkan Harga: ");
        int newHargaa = input.nextInt();
        System.out.print("Masukkan Stok: ");
        int newStokBrgg = input.nextInt();
        int i = firstEmptyNull();
        namaBrg[i] = newNamabrg;
        tipeBrg[i] = newtipebrg;
        supplier[i] = newSupp;
        prdDate[i] = newprdDate;
        expDate[i] = newexpDate;
        harga[i] = newHargaa;
        stokBrg[i] = newStokBrgg;
        System.out.println(i);
        System.out.println("Data Baru Telah Ditambahkan!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("berapa data: ");
        int dataX = input.nextInt();
        input.nextLine();
        for (int i = 0; i < dataX; i++) {
            inputNewData(input);
        }
        for (int i = 0; i < namaBrg.length; i++) { // menampilkan
            if (namaBrg[i] != null) {// tidka menampilkan null
                System.out.printf(
                        "%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                        (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i],
                        expDate[i], harga[i], stokBrg[i]);
            }
        }
        input.close();
    }
}

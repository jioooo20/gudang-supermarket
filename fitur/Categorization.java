package fitur;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Categorization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] namaBrg = {"Mie Sedap Goreng", "Aqua 600ml", "Paracetamol", "Djarum Super", "Teh Pucuk Harum 600ml", "Coca-Cola 600ml", "OBH Combi 100ml", "Gudang Garam", "Roti Aoka", "Teh Kotak 300ml", "Aspirin", "Sampoerna", "Chitato", "Sprite Kaleng", "Minyak Kayu Putih 60ml"};
        String[] tipeBrg = {"Makanan", "Minuman", "Obat", "Rokok", "Makanan", "Minuman", "Obat", "Rokok", "Makanan", "Minuman", "Obat", "Rokok", "Makanan", "Minuman", "Obat"};
        String[] prdDate = {"22-09-2023", "23-09-2023", "21-10-2023", "24-09-2023", "20-09-2023", "22-09-2023", "23-09-2023", "21-10-2023", "24-09-2023", "20-11-2023", "22-09-2023", "23-09-2023", "21-10-2023", "24-09-2023", "20-11-2023"};
        String[] expDate = {"23-12-2024", "24-12-2025", "20-11-2024", "25-12-2023", "19-12-2024", "23-12-2024", "24-12-2025", "20-11-2024", "25-12-2023", "19-12-2024", "23-12-2024", "24-12-2025", "20-11-2024", "25-12-2023", "19-12-2024"};
        String[] supplier = {"Wings-Food", "Danone", "PT. Kimia Farma", "Sampoerna", "ABC", "Coca-Cola", "Combiphar", "Gudang-Garam", "Aoka", "Ultrajaya", "Bayer", "Sampoerna", "Indofood", "Coca-Cola", "Cap Lang"};
        String[] konSupp = {"08214141414", "08515151521", "08123456789", "08765432100", "08214141414", "08515151521", "08123456789", "08765432100", "08214141414", "08515151521", "08123456789", "08765432100", "08214141414", "08515151521", "08123456789"};
        String[] alamatSupp = {"Jakarta", "Bandung", "Surabaya", "Semarang", "Jakarta", "Bandung", "Surabaya", "Semarang", "Jakarta", "Bandung", "Surabaya", "Semarang", "Jakarta", "Bandung", "Surabaya"};
        double[] harga = {20000, 48000, 19500, 93500, 62500, 108700, 550000, 530000, 113000, 94200, 125500, 232000, 243900, 121500, 238350};
        int[] stokBrg = {100, 150, 50, 80, 120, 200, 30, 60, 90, 75, 40, 100, 60, 180, 25};
        String [] cabang = {"Malang", "Blitar", "Tuban"};
        int[][] stokCabang = {
            {5, 10, 15, 8, 12, 7, 14, 6, 9, 11, 15, 5, 13, 8, 10},  // malang
            {6, 15, 20, 9, 14, 8, 12, 7, 10, 13, 5, 11, 6, 15, 7},   // blitar
            {7, 20, 25, 10, 13, 6, 15, 8, 12, 9, 14, 7, 11, 10, 13}  // tuban
        };
            
        System.out.println("=====Item Categorization=====");
        System.out.println("=========================================");
        System.out.println("| NO\t| KATEGORI BARANG\t\t|");
        System.out.println("=========================================");

        // menampilkan kategori tanpa duplikat
        for (int i = 0; i < tipeBrg.length; i++) {
            boolean isDuplicate = false;

            // cek duplikasi
            for (int j = 0; j < i; j++) {
                if (tipeBrg[i].equals(tipeBrg[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            // tampilkan kategori jika tidak ada duplikasi
            if (!isDuplicate) {
                System.out.printf("%s %d\t| %-25s\t|%n", "|", (i + 1), tipeBrg[i]);
            }
        }

        // input barang
        System.out.println("=========================================");
        System.out.print("Masukkan Nomor Kategori: ");
        int noTipeBrg = input.nextInt();

        // validasi nomor barang valid
        if (noTipeBrg >= 1 && noTipeBrg <= tipeBrg.length) {
            System.out.println("Nomor barang valid.");

        } else {
            System.out.println("Nomor barang tidak valid.");
        }
    }
}

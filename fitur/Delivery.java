package fitur;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBrg = new String[20];
        String[] tipeBrg = new String[20];
        String[] prdDate = new String[20];
        String[] expDate = new String[20];
        String[] supplier = new String[20];
        String[] konSupp = new String[20];
        String[] alamatSupp = new String[20];
        double[] harga = new double[20];
        int[] stokBrg = new int[20];
        String[] cabang = new String[3];

        namaBrg[0] = "Mie Sedap Goreng";
        namaBrg[1] = "Aqua 600ml";
        namaBrg[2] = "Paracetamol";
        namaBrg[3] = "Djarum Super";
        namaBrg[4] = "Teh Pucuk Harum 600ml";
        namaBrg[5] = "Coca-Cola 600ml";
        namaBrg[6] = "OBH Combi 100ml";
        namaBrg[7] = "Gudang Garam";
        namaBrg[8] = "Roti Aoka";
        namaBrg[9] = "Teh Kotak 300ml";
        namaBrg[10] = "Aspirin";
        namaBrg[11] = "Sampoerna";
        namaBrg[12] = "Chitato";
        namaBrg[13] = "Sprite Kaleng";
        namaBrg[14] = "Minyak Kayu Putih 60ml";

        tipeBrg[0] = "Makanan";
        tipeBrg[1] = "Minuman";
        tipeBrg[2] = "Obat";
        tipeBrg[3] = "Rokok";
        tipeBrg[4] = "Minuman";
        tipeBrg[5] = "Minuman";
        tipeBrg[6] = "Obat";
        tipeBrg[7] = "Rokok";
        tipeBrg[8] = "Makanan";
        tipeBrg[9] = "Minuman";
        tipeBrg[10] = "Obat";
        tipeBrg[11] = "Rokok";
        tipeBrg[12] = "Makanan";
        tipeBrg[13] = "Minuman";
        tipeBrg[14] = "Obat";

        prdDate[0] = "22-09-2023";
        prdDate[1] = "23-09-2023";
        prdDate[2] = "21-10-2023";
        prdDate[3] = "24-09-2023";
        prdDate[4] = "20-09-2023";
        prdDate[5] = "22-09-2023";
        prdDate[6] = "23-09-2023";
        prdDate[7] = "21-10-2023";
        prdDate[8] = "24-09-2023";
        prdDate[9] = "20-11-2023";
        prdDate[10] = "22-09-2023";
        prdDate[11] = "23-09-2023";
        prdDate[12] = "21-10-2023";
        prdDate[13] = "24-09-2023";
        prdDate[14] = "20-11-2023";

        expDate[0] = "23-12-2024";
        expDate[1] = "24-12-2025";
        expDate[2] = "20-11-2024";
        expDate[3] = "25-12-2023";
        expDate[4] = "19-12-2024";
        expDate[5] = "23-12-2024";
        expDate[6] = "24-12-2025";
        expDate[7] = "20-11-2024";
        expDate[8] = "25-12-2023";
        expDate[9] = "19-12-2024";
        expDate[10] = "23-12-2024";
        expDate[11] = "24-12-2025";
        expDate[12] = "20-11-2024";
        expDate[13] = "25-12-2023";
        expDate[14] = "19-12-2024";

        supplier[0] = "Wings-Food";
        supplier[1] = "Danone";
        supplier[2] = "PT. Kimia Farma";
        supplier[3] = "Sampoerna";
        supplier[4] = "ABC";
        supplier[5] = "Coca-Cola";
        supplier[6] = "Combiphar";
        supplier[7] = "Gudang-Garam";
        supplier[8] = "Aoka";
        supplier[9] = "Ultrajaya";
        supplier[10] = "Bayer";
        supplier[11] = "Sampoerna";
        supplier[12] = "Indofood";
        supplier[13] = "Coca-Cola";
        supplier[14] = "Cap Lang";

        konSupp[0] = "081010101001";
        konSupp[1] = "082314312302";
        konSupp[2] = "081348753403";
        konSupp[3] = "087658328704";
        konSupp[4] = "082384752405";
        konSupp[5] = "085847539206";
        konSupp[6] = "081234239307";
        konSupp[7] = "087654321008";
        konSupp[8] = "082141412009";
        konSupp[9] = "085151515010";
        konSupp[10] = "081234356011";
        konSupp[11] = "087654432012";
        konSupp[12] = "082145141413";
        konSupp[13] = "085156151014";
        konSupp[14] = "081237456015";

        alamatSupp[0] = "Jakarta";
        alamatSupp[1] = "Bandung";
        alamatSupp[2] = "Surabaya";
        alamatSupp[3] = "Semarang";
        alamatSupp[4] = "Jakarta";
        alamatSupp[5] = "Bandung";
        alamatSupp[6] = "Surabaya";
        alamatSupp[7] = "Semarang";
        alamatSupp[8] = "Jakarta";
        alamatSupp[9] = "Bandung";
        alamatSupp[10] = "Surabaya";
        alamatSupp[11] = "Semarang";
        alamatSupp[12] = "Jakarta";
        alamatSupp[13] = "Bandung";
        alamatSupp[14] = "Surabaya";

        harga[0] = 20000;
        harga[1] = 48000;
        harga[2] = 19500;
        harga[3] = 93500;
        harga[4] = 62500;
        harga[5] = 108700;
        harga[6] = 550000;
        harga[7] = 530000;
        harga[8] = 113000;
        harga[9] = 94200;
        harga[10] = 125500;
        harga[11] = 232000;
        harga[12] = 243900;
        harga[13] = 121500;
        harga[14] = 238350;

        stokBrg[0] = 100;
        stokBrg[1] = 150;
        stokBrg[2] = 50;
        stokBrg[3] = 80;
        stokBrg[4] = 120;
        stokBrg[5] = 200;
        stokBrg[6] = 30;
        stokBrg[7] = 60;
        stokBrg[8] = 90;
        stokBrg[9] = 75;
        stokBrg[10] = 40;
        stokBrg[11] = 100;
        stokBrg[12] = 60;
        stokBrg[13] = 180;
        stokBrg[14] = 25;

        cabang[0] = "Malang";
        cabang[1] = "Blitar";
        cabang[2] = "Tuban";

        int[][] stokCabang = new int[3][20];
        // malang/warteg
        stokCabang[0][0] = 5;
        stokCabang[0][1] = 10;
        stokCabang[0][2] = 0;
        stokCabang[0][3] = 0;
        stokCabang[0][4] = 12;
        stokCabang[0][5] = 7;
        stokCabang[0][6] = 0;
        stokCabang[0][7] = 0;
        stokCabang[0][8] = 9;
        stokCabang[0][9] = 11;
        stokCabang[0][10] = 0;
        stokCabang[0][11] = 0;
        stokCabang[0][12] = 10;
        stokCabang[0][13] = 20;
        stokCabang[0][14] = 0;

        // blitar/apotek
        stokCabang[1][0] = 0;
        stokCabang[1][1] = 15;
        stokCabang[1][2] = 20;
        stokCabang[1][3] = 0;
        stokCabang[1][4] = 14;
        stokCabang[1][5] = 8;
        stokCabang[1][6] = 12;
        stokCabang[1][7] = 0;
        stokCabang[1][8] = 0;
        stokCabang[1][9] = 13;
        stokCabang[1][10] = 10;
        stokCabang[1][11] = 0;
        stokCabang[1][12] = 0;
        stokCabang[1][13] = 12;
        stokCabang[1][14] = 9;

        // tuban/warmadura
        stokCabang[2][0] = 7;
        stokCabang[2][1] = 20;
        stokCabang[2][2] = 0;
        stokCabang[2][3] = 10;
        stokCabang[2][4] = 13;
        stokCabang[2][5] = 6;
        stokCabang[2][6] = 0;
        stokCabang[2][7] = 8;
        stokCabang[2][8] = 12;
        stokCabang[2][9] = 9;
        stokCabang[2][10] = 18;
        stokCabang[2][11] = 4;
        stokCabang[2][12] = 12;
        stokCabang[2][13] = 3;
        stokCabang[2][14] = 0;
        int menu, fitur;
        boolean stop = true;

        int fitur8;
        do {
            System.out.println("================Delivery================");
            System.out.println("1. Pengiriman");
            System.out.println("2. Lihat Stok Cabang");
            System.out.println("0. Kembali");
            System.out.print("Masukkan Nomor Menu: ");
            fitur8 = input.nextInt();
            input.nextLine();

            switch (fitur8) {
                case 1:
                    int stop81 = -1;
                    int indeks = 0;
                    int jumKirBarang;
                    do {
                        System.out.println("=====Pilih Cabang Yang Akan Dikirim=====");
                        System.out.println("1.Malang");
                        System.out.println("2.Blitar");
                        System.out.println("3.Tuban");
                        System.out.println("0.Kembali");
                        System.out.print("Masukkan Nomor Cabang: ");
                        int kirim_cabang = input.nextInt();
                        stop81 = kirim_cabang;// angka pada stop81 mengikuti input dari menu pilih cabang
                        switch (kirim_cabang) {
                            case 1:
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.println(
                                        "=============================================Kirim Cabang Malang==============================================");
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.println(
                                        "=================================================Stok Gudang==================================================");
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.printf("%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No",
                                        "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa", "Harga", "Stok");
                                for (int i = 0; i < namaBrg.length; i++) {
                                    System.out.printf("%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                                            (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i], expDate[i],
                                            harga[i], stokBrg[i]);
                                } // menampilkan informasi barang dalam gudang

                                System.out.print("Masukkan Nomor Urut Barang: ");
                                int cariNomorBarangMalang = input.nextInt();

                                if (cariNomorBarangMalang >= 1 && cariNomorBarangMalang <= namaBrg.length) {
                                    indeks = cariNomorBarangMalang - 1;
                                    System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                                } else {
                                    System.out.println("Indeks tidak valid.");
                                } // mencari posisi index barang

                                System.out.print("Masukkan Jumlah Barang: ");
                                jumKirBarang = input.nextInt();
                                stokBrg[indeks] -= jumKirBarang; // mengurangi stok gudang
                                stokCabang[0][indeks] += jumKirBarang; // menambah stok di cabang

                                break;
                            case 2:
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.println(
                                        "===============================================Kirim Cabang Blitar============================================");
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.println(
                                        "===================================================Stok Gudang================================================");
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.printf("%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No",
                                        "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa", "Harga", "Stok");
                                for (int i = 0; i < namaBrg.length; i++) {
                                    System.out.printf("%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                                            (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i], expDate[i],
                                            harga[i], stokBrg[i]);
                                } // menampilkan informasi barang dalam gudang

                                System.out.print("Masukkan Nomor Urut Barang: ");
                                int cariNomorBarangBlitar = input.nextInt();

                                if (cariNomorBarangBlitar >= 1 && cariNomorBarangBlitar <= namaBrg.length) {
                                    indeks = cariNomorBarangBlitar - 1;
                                    System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                                } else {
                                    System.out.println("Indeks tidak valid.");
                                } // mencari posisi index barang

                                System.out.print("Masukkan Jumlah Barang: ");
                                jumKirBarang = input.nextInt();
                                stokBrg[indeks] -= jumKirBarang; // mengurangi stok gudang
                                stokCabang[1][indeks] += jumKirBarang; // menambah stok di cabang

                                break;
                            case 3:
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.println(
                                        "==============================================Kirim Cabang Tuban==============================================");
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.println(
                                        "==================================================Stok Gudang=================================================");
                                System.out.println(
                                        "==============================================================================================================");
                                System.out.printf("%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No",
                                        "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa", "Harga", "Stok");
                                for (int i = 0; i < namaBrg.length; i++) {
                                    System.out.printf("%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                                            (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i], expDate[i],
                                            harga[i], stokBrg[i]);
                                } // menampilkan informasi barang dalam gudang

                                System.out.print("Masukkan Nomor Urut Barang: ");
                                int cariNomorBarangTuban = input.nextInt();

                                if (cariNomorBarangTuban >= 1 && cariNomorBarangTuban <= namaBrg.length) {
                                    indeks = cariNomorBarangTuban - 1;
                                    System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                                } else {
                                    System.out.println("Indeks tidak valid.");
                                } // mencari posisi index barang

                                System.out.print("Masukkan Jumlah Barang: ");
                                jumKirBarang = input.nextInt();
                                stokBrg[indeks] -= jumKirBarang; // mengurangi stok gudang
                                stokCabang[2][indeks] += jumKirBarang; // menambah stok di cabang

                                break;
                            default:
                                System.out.println("Pilih Nomor Cabang!!!");
                                break;
                        }

                    } while (stop81 != 0);
                    break;

                case 2:// tampilkan stok cabang
                    System.out.println("==============================================");
                    System.out.println("==================Stok Cabang=================");
                    System.out.println("==============================================");
                    System.out.printf("%-23s |", "Nama Barang");
                    for (int i = 0; i < cabang.length; i++) {
                        System.out.printf("%-6s|", cabang[i]);
                    }
                    System.out.println();
                    System.out.println("==============================================");

                    for (int i = 0; i < namaBrg.length; i++) {
                        System.out.printf("%-24s", namaBrg[i]);
                        for (int j = 0; j < stokCabang.length; j++) {
                            System.out.printf("|  %-4d", stokCabang[j][i]);
                        }
                        System.out.println("|");
                    }
                    break; // break case 2
            }

        } while (fitur8 != 0);
    }
}
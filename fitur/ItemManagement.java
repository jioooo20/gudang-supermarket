package fitur;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ItemManagement {
    public static void main(String[] args){
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

        konSupp[0] = "08214141414";
        konSupp[1] = "08515151521";
        konSupp[2] = "08123456789";
        konSupp[3] = "08765432100";
        konSupp[4] = "08214141414";
        konSupp[5] = "08515151521";
        konSupp[6] = "08123456789";
        konSupp[7] = "08765432100";
        konSupp[8] = "08214141414";
        konSupp[9] = "08515151521";
        konSupp[10] = "08123456789";
        konSupp[11] = "08765432100";
        konSupp[12] = "08214141414";
        konSupp[13] = "08515151521";
        konSupp[14] = "08123456789";

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
        // malang
        stokCabang[0][0] = 5;
        stokCabang[0][1] = 10;
        stokCabang[0][2] = 15;
        stokCabang[0][3] = 8;
        stokCabang[0][4] = 12;
        stokCabang[0][5] = 7;
        stokCabang[0][6] = 14;
        stokCabang[0][7] = 6;
        stokCabang[0][8] = 9;
        stokCabang[0][9] = 11;
        stokCabang[0][10] = 0;
        stokCabang[0][11] = 0;
        stokCabang[0][12] = 0;
        stokCabang[0][13] = 0;
        stokCabang[0][14] = 0;

        // blitar
        stokCabang[1][0] = 6;
        stokCabang[1][1] = 15;
        stokCabang[1][2] = 20;
        stokCabang[1][3] = 9;
        stokCabang[1][4] = 14;
        stokCabang[1][5] = 8;
        stokCabang[1][6] = 12;
        stokCabang[1][7] = 7;
        stokCabang[1][8] = 10;
        stokCabang[1][9] = 13;
        stokCabang[1][10] = 0;
        stokCabang[1][11] = 0;
        stokCabang[1][12] = 0;
        stokCabang[1][13] = 0;
        stokCabang[1][14] = 0;

        // tuban
        stokCabang[2][0] = 7;
        stokCabang[2][1] = 20;
        stokCabang[2][2] = 25;
        stokCabang[2][3] = 10;
        stokCabang[2][4] = 13;
        stokCabang[2][5] = 6;
        stokCabang[2][6] = 15;
        stokCabang[2][7] = 8;
        stokCabang[2][8] = 12;
        stokCabang[2][9] = 9;
        stokCabang[2][10] = 0;
        stokCabang[2][11] = 0;
        stokCabang[2][12] = 0;
        stokCabang[2][13] = 0;
        stokCabang[2][14] = 0;
                
        int menu;
        int stop = 0;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("|\t Update Item Information \t|");
            System.out.println("-----------------------------------------");
            System.out.println("Silahkan Pilih");
            System.out.println("1. Update");
            System.out.println("2. Hapus");
            System.out.println("3. Tampilkan Item");
            System.out.println("0. Kembali");
            System.out.print("Masukkan Nomor: ");
            menu = input.nextInt();
            input.nextLine(); 
            int index = -1;

            switch (menu) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("|\tUPDATE DATA \t|");
                    System.out.println("-------------------------");
                    System.out.println("=========================================");
                    System.out.println("| NO\t| NAMA BARANG\t\t\t|");
                    System.out.println("=========================================");

                    //daftar barang
                    for (int i = 0; i < namaBrg.length; i++) {
                        if (namaBrg[i] == null || tipeBrg[i] == null || prdDate[i] == null || expDate[i] == null || supplier[i] == null || konSupp[i] == null || alamatSupp[i] == null || harga[i] == 0 || stokBrg[i] == 0) {
                            
                            continue;
                        } else {
                        System.out.printf("%s %d\t| %-25s\t|%n","|", (i + 1), namaBrg[i]);
                        }
                    }

                    System.out.println("=========================================");
                    System.out.print("Masukkan Nomor Barang: ");
                    int noBrgUpdate = input.nextInt();

                    // cari index barang
                    if (noBrgUpdate >= 1 && noBrgUpdate <= namaBrg.length) {
                        index = noBrgUpdate - 1;
                    }
                    else {
                        System.out.println("Nomor Barang tidak valid.");
                        continue;
                    }

                    // daftar part update
                    System.out.println("============================");
                    System.out.println("Part yang ingin anda ubah:");
                    System.out.println("1. Nama Barang");
                    System.out.println("2. Kategori Barang");
                    System.out.println("3. Tanggal Produksi Barang");
                    System.out.println("4. Tanggal Kadaluwarsa Barang");
                    System.out.println("5. Harga Barang");
                    System.out.println("6. Jumlah Stok Barang");
                    System.out.println("7. Supplier");
                    System.out.println("0. Selesai");
                    System.out.print("Pilih menu: ");
                    int pilihan = input.nextInt();
                    input.nextLine(); // Konsumsi newline

                    // update element data
                    switch (pilihan) {
                        case 1:
                            System.out.println("Nama Barang Lama\t\t: " + namaBrg[index]);
                            System.out.print("Masukkan Nama Barang Baru\t: ");
                            namaBrg[index] = input.nextLine();
                            break;
                        case 2:
                            System.out.println("Kategori Barang Lama: " + tipeBrg[index]);
                            System.out.print("Masukkan Kategori Barang Baru: ");
                            tipeBrg[index] = input.nextLine();
                            break;
                        case 3:
                            System.out.println("Tanggal Produksi Lama: " + prdDate[index]);
                            System.out.print("Masukkan Tanggal Produksi Baru: ");
                            prdDate[index] = input.nextLine();
                            break;
                        case 4:
                            System.out.println("Tanggal Kadaluwarsa Lama: " + expDate[index]);
                            System.out.print("Masukkan Tanggal Kadaluwarsa Baru: ");
                            expDate[index] = input.nextLine();
                            break;
                        case 5:
                            System.out.println("Harga Barang Lama: " + harga[index]);
                            System.out.print("Masukkan Harga Barang Baru: ");
                            harga[index] = input.nextDouble();
                            break;
                        case 6:
                            System.out.println("Jumlah Stok Barang Lama: " + stokBrg[index]);
                            System.out.print("Masukkan Jumlah Stok Barang Baru: ");
                            stokBrg[index] = input.nextInt();
                            break;
                        case 7:
                            System.out.println("Supplier Barang Lama: " + stokBrg[index]);
                            System.out.print("Masukkan Supplier Barang Baru: ");
                            supplier[index] = input.nextLine();
                            break;
                        case 0:
                            System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }

                    System.out.println("Barang " + namaBrg[index] + " berhasil diperbarui ");
                    break;
                    
                    case 2:
                        System.out.println("-------------------------");
                        System.out.println("|\tHAPUS DATA \t|");
                        System.out.println("-------------------------");
                        System.out.println("=========================================");
                        System.out.println("| NO\t| NAMA BARANG\t\t\t|");
                        System.out.println("=========================================");
                        
                        //daftar barang
                        for (int i = 0; i < namaBrg.length; i++) {
                            if (namaBrg[i] == null || tipeBrg[i] == null || prdDate[i] == null || expDate[i] == null || supplier[i] == null || konSupp[i] == null || alamatSupp[i] == null || harga[i] == 0 || stokBrg[i] == 0) {
                                
                                continue;
                            } else {
                            System.out.printf("%s %d\t| %-25s\t|%n","|", (i + 1), namaBrg[i]);
                            }
                        }
    
                        System.out.println("=========================================");
                        System.out.print("Masukkan Nomor barang: ");
                        int noBrgHapus = input.nextInt();
                        int hapus = -1;
                        // cari index barang
                        if (noBrgHapus >= 1 && noBrgHapus <= namaBrg.length) {
                            hapus = noBrgHapus - 1;
                        }
                         else {
                            System.out.println("....Nomor Barang tidak valid....");
                            continue;
                        }
                        
                        String namaBrgHapus = namaBrg[hapus];
                        //hapus data barang
                        if (hapus != -1) {
                            for (int i = hapus; i < namaBrg.length - 1; i++) {
                                namaBrg[i] = namaBrg[i + 1];
                                tipeBrg[i] = tipeBrg[i + 1];
                                prdDate[i] = prdDate[i + 1];
                                expDate[i] = expDate[i + 1];
                                supplier[i] = supplier[i + 1];
                                konSupp[i] = konSupp[i + 1];
                                alamatSupp[i] = alamatSupp[i + 1];
                                harga[i] = harga[i + 1];
                                stokBrg[i] = stokBrg[i + 1];
                            }
                        
                            // // Set elemen terakhir ke null untuk menghapus data yang duplikat
                            // int newHapus = namaBrg.length - 1;
                            // namaBrg[newHapus] = null;
                            // tipeBrg[newHapus] = null;
                            // prdDate[newHapus] = null;
                            // expDate[newHapus] = null;
                            // supplier[newHapus] = null;
                            // konSupp[newHapus] = null;
                            // alamatSupp[newHapus] = null;
                            // harga[newHapus] = 0;
                            // stokBrg[newHapus] = 0;
                            
                            System.out.println("Data barang " + namaBrgHapus + " telah berhasil dihapus");
                        } 
                    break;
                    case 3:
                        System.out.println("================================================================================================================================================");
                        System.out.println("|\t\t\t\t\t\t\t\t| DAFTAR STOK BARANG |\t\t\t\t\t\t\t\t|");
                        System.out.println("================================================================================================================================================");
                        System.out.println("| NO\t| NAMA BARANG\t\t\t| KATEGORI\t| TGL PRODUKSI\t| TGL KADALUWARSA\t| SUPPLIER\t\t| HARGA\t\t| STOK |");
                        System.out.println("================================================================================================================================================");
                        
                        // Salin array yang akan diurutkan secara manual
                        String[] sortNamaBrg = new String[namaBrg.length];
                        String[] sortTipeBrg = new String[tipeBrg.length];
                        String[] sortPrdDate = new String[prdDate.length];
                        String[] sortExpDate = new String[expDate.length];
                        String[] sortSupplier = new String[supplier.length];
                        String[] sortKonSupp = new String[konSupp.length];
                        String[] sortAlamatSupp = new String[alamatSupp.length];
                        double[] sortHarga = new double[harga.length];
                        int[] sortStokBrg = new int[stokBrg.length];

                        for (int i = 0; i < namaBrg.length; i++) {
                            sortNamaBrg[i] = namaBrg[i];
                            sortTipeBrg[i] = tipeBrg[i];
                            sortPrdDate[i] = prdDate[i];
                            sortExpDate[i] = expDate[i];
                            sortSupplier[i] = supplier[i];
                            sortKonSupp[i] = konSupp[i];
                            sortAlamatSupp[i] = alamatSupp[i];
                            sortHarga[i] = harga[i];
                            sortStokBrg[i] = stokBrg[i];
                        }

                        // Sorting dari jumlah stok barang paling sedikit ke yang paling banyak
                        for (int i = 0; i < sortStokBrg.length - 1; i++) {
                            for (int j = 0; j < sortStokBrg.length - i - 1; j++) {
                                if (sortStokBrg[j] > sortStokBrg[j+1]) {
                                    // untuk ubah urutan nama
                                    String tempNama = sortNamaBrg[j];
                                    sortNamaBrg[j] = sortNamaBrg[j + 1];
                                    sortNamaBrg[j + 1] = tempNama;

                                    // untuk ubah urutan kategori
                                    String tempTipe = sortTipeBrg[j];
                                    sortTipeBrg[j] = sortTipeBrg[j + 1];
                                    sortTipeBrg[j + 1] = tempTipe;

                                    // untuk ubah urutan Tgl Produksi
                                    String tempPrdDate = sortPrdDate[j];
                                    sortPrdDate[j] = sortPrdDate[j + 1];
                                    sortPrdDate[j + 1] = tempPrdDate;

                                    // untuk ubah urutan Tgl kadaluwarsa
                                    String tempExpDate = sortExpDate[j];
                                    sortExpDate[j] = sortExpDate[j + 1];
                                    sortExpDate[j + 1] = tempExpDate;

                                    // untuk ubah urutan Supplier
                                    String tempSupplier = sortSupplier[j];
                                    sortSupplier[j] = sortSupplier[j + 1];
                                    sortSupplier[j + 1] = tempSupplier;

                                    // untuk ubah urutan Kontak Supplier
                                    String tempKonSupp = sortKonSupp[j];
                                    sortKonSupp[j] = sortKonSupp[j + 1];
                                    sortKonSupp[j + 1] = tempKonSupp;

                                    // untuk ubah urutan Alamat Supplier
                                    String tempAlamatSupp = sortAlamatSupp[j];
                                    sortAlamatSupp[j] = sortAlamatSupp[j + 1];
                                    sortAlamatSupp[j + 1] = tempAlamatSupp;

                                    //untuk ubah urutan stok
                                    double tempHarga = sortHarga [j];
                                    sortHarga[j] = sortHarga[j + 1];
                                    sortHarga[j + 1] = tempHarga;

                                    //untuk ubah urutan stok
                                    int tempStok = sortStokBrg[j];
                                    sortStokBrg[j] = sortStokBrg[j + 1];
                                    sortStokBrg[j + 1] = tempStok;

                                }
                            } 
                        }
                        
                        //menampilkan data barang
                        int indexTampil = 1;
                        for (int i = 0; i < sortNamaBrg.length; i++) {
                            if (sortNamaBrg[i] == null || sortTipeBrg[i] == null || sortPrdDate[i] == null || sortExpDate[i] == null || sortSupplier[i] == null || sortKonSupp[i] == null || sortAlamatSupp[i] == null || sortHarga[i] == 0 || sortStokBrg[i] == 0) {
                                
                                continue;
                            } else{
                                System.out.printf("%s %d\t| %-25s\t| %-10s\t| %-10s\t| %-15s\t| %-15s\t| %-10s\t| %-5s|%n", "|", indexTampil++, sortNamaBrg[i], sortTipeBrg[i], sortPrdDate[i], sortExpDate[i], sortSupplier[i], sortHarga[i], sortStokBrg[i]);
                            }
                        }   
                        System.out.println("================================================================================================================================================");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1, 2, atau 3");
                    break;
            }
        } while (menu != stop);
    }
}
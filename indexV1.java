import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class indexV1 {

    public static void main(String[] args) throws Exception {
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

        namaBrg[0] = "Mie Sedap Goreng"; // makanan
        namaBrg[1] = "Aqua 600ml";// minuman
        namaBrg[2] = "Paracetamol";
        namaBrg[3] = "Djarum Super";// rokok
        namaBrg[4] = "Teh Pucuk Harum 600ml";// minuman
        namaBrg[5] = "Coca-Cola 600ml";// minuman
        namaBrg[6] = "OBH Combi 100ml";
        namaBrg[7] = "Gudang Garam";// rokok
        namaBrg[8] = "Roti Aoka"; // makanan
        namaBrg[9] = "Teh Kotak 300ml";
        namaBrg[10] = "Aspirin";
        namaBrg[11] = "Sampoerna";// rokok
        namaBrg[12] = "Chitato"; // makanan
        namaBrg[13] = "Sprite Kaleng";// minuman
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

        // System.out.println("========================================"); GUNAKAN INI
        // UNTUK MEMBERI GARIS!!!

        do {
            System.out.println("=============Selamat Datang=============");
            System.out.println("1.Item Entry and Storage");
            System.out.println("2.Item Management Information");
            System.out.println("3.Item Categorization");
            System.out.println("4.Supplier Management");
            System.out.println("5.Item Scanning");
            System.out.println("6.Expiry Date Tracking");
            System.out.println("7.Delivery ");
            System.out.println("0.Keluar");
            System.out.print("Masukkan Nomor Menu: ");
            fitur = input.nextInt();
            if (fitur == 0) {
                break;
            }

            switch (fitur) {
                case 1:
                    int indexnamaBrg = -1;
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

                    for (int i = 0; i < namaBrg.length; i++) {
                        if (namaBrg[i] == null) {
                            indexnamaBrg = i;
                            break;
                        } // mencari index pertama yang kosong

                    }
                    // menambahkan data baru ke array utama
                    namaBrg[indexnamaBrg] = newNamabrg;
                    tipeBrg[indexnamaBrg] = newtipebrg;
                    supplier[indexnamaBrg] = newSupp;
                    prdDate[indexnamaBrg] = newprdDate;
                    expDate[indexnamaBrg] = newexpDate;
                    harga[indexnamaBrg] = newHargaa;
                    stokBrg[indexnamaBrg] = newStokBrgg;
                    System.out.println("Data Baru Telah Ditambahkan!");

                    break;
                case 2:
                    int menu2, stop2 = 0;
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
                        menu2 = input.nextInt();
                        input.nextLine();
                        int index = -1;

                        switch (menu2) {
                            case 1:
                                System.out.println("-------------------------");
                                System.out.println("|\tUPDATE DATA \t|");
                                System.out.println("-------------------------");
                                System.out.println("=========================================");
                                System.out.println("| NO\t| NAMA BARANG\t\t\t|");
                                System.out.println("=========================================");

                                // daftar barang
                                for (int i = 0; i < namaBrg.length; i++) {
                                    if (namaBrg[i] == null) {
                                        continue;
                                    } else {
                                        System.out.printf("%s %d\t| %-25s\t|%n", "|", (i + 1), namaBrg[i]);
                                    }
                                }

                                System.out.println("=========================================");
                                System.out.print("Masukkan Nomor Barang: ");
                                int noBrgUpdate = input.nextInt();

                                // cari index barang
                                if (noBrgUpdate >= 1 && noBrgUpdate <= namaBrg.length) {
                                    index = noBrgUpdate - 1;
                                } else {
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
                                        System.out.print("Masukkan Tanggal Produksi Baru(DD-MM-YYYY): ");
                                        prdDate[index] = input.nextLine();
                                        break;
                                    case 4:
                                        System.out.println("Tanggal Kadaluwarsa Lama: " + expDate[index]);
                                        System.out.print("Masukkan Tanggal Kadaluwarsa Baru(DD-MM-YYYY): ");
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

                                // daftar barang
                                for (int i = 0; i < namaBrg.length; i++) {
                                    if (namaBrg[i] == null) {
                                        continue;
                                    } else {
                                        System.out.printf("%s %d\t| %-25s\t|%n", "|", (i + 1), namaBrg[i]);
                                    }
                                }

                                System.out.println("=========================================");
                                System.out.print("Masukkan Nomor barang: ");
                                int noBrgHapus = input.nextInt();
                                int hapus = -1;
                                // cari index barang
                                if (noBrgHapus >= 1 && noBrgHapus <= namaBrg.length) {
                                    hapus = noBrgHapus - 1;
                                } else {
                                    System.out.println("....Nomor Barang tidak valid....");
                                    continue;
                                }

                                String namaBrgHapus = namaBrg[hapus];
                                // hapus data barang
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
                                    System.out.println("Data barang " + namaBrgHapus + " telah berhasil dihapus");
                                }
                                break;
                            case 3:
                                System.out.println(
                                        "================================================================================================================================================");
                                System.out.println("|\t\t\t\t\t\t\t\t| DAFTAR STOK BARANG |\t\t\t\t\t\t\t\t|");
                                System.out.println(
                                        "================================================================================================================================================");
                                System.out.println(
                                        "| NO\t| NAMA BARANG\t\t\t| KATEGORI\t| TGL PRODUKSI\t| TGL KADALUWARSA\t| SUPPLIER\t\t| HARGA\t\t| STOK |");
                                System.out.println(
                                        "================================================================================================================================================");

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
                                        if (sortStokBrg[j] > sortStokBrg[j + 1]) {
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

                                            // untuk ubah urutan stok
                                            double tempHarga = sortHarga[j];
                                            sortHarga[j] = sortHarga[j + 1];
                                            sortHarga[j + 1] = tempHarga;

                                            // untuk ubah urutan stok
                                            int tempStok = sortStokBrg[j];
                                            sortStokBrg[j] = sortStokBrg[j + 1];
                                            sortStokBrg[j + 1] = tempStok;

                                        }
                                    }
                                }

                                // menampilkan data barang
                                int indexTampil = 1;

                                for (int i = 0; i < sortStokBrg.length; i++) {
                                    if (sortNamaBrg[i] == null) {
                                        continue;
                                    } else {
                                        System.out.printf(
                                                "%s %d\t| %-25s\t| %-10s\t| %-10s\t| %-15s\t| %-15s\t| %-10s\t| %-5s|%n",
                                                "|", indexTampil++, sortNamaBrg[i], sortTipeBrg[i], sortPrdDate[i],
                                                sortExpDate[i], sortSupplier[i], sortHarga[i], sortStokBrg[i]);
                                    }
                                }
                                System.out.println(
                                        "================================================================================================================================================");
                                break;
                            case 0:
                                break;
                        }
                    } while (menu2 != stop2);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;

                case 3:
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
                    break;

                case 4:
                    // loop nya ada yang ilang, lagi nyoba array. udah ketemu cara nambahin sesuai
                    // urutan, cuma lek ada lebih dr 1 produk carra ngatur supplier ini gimanaaa
                    // saya bingung
                    int menu4;
                    do {
                        System.out.println("===========Supplier Management==========");
                        System.out.println("1.Edit Data Supplier");
                        System.out.println("2.Lihat Informasi Supplier");
                        System.out.println("0.Kembali");
                        System.out.print("Masukkan Nomor: ");
                        menu4 = input.nextInt();
                        input.nextLine();
                        if (menu4 == 0) {
                            break;
                        }
                        switch (menu4) {
                            case 1:
                                int stop4 = 0;
                                do {
                                    int hasil = 0;
                                    System.out.println("=========Edit Data Supplier=========");
                                    System.out.print("Masukkan Supplier: ");
                                    String cariSupplier = input.nextLine();
                                    for (int i = 0; i < supplier.length; i++) {// mencari apakah nama supplier ada
                                        if (supplier[i] != null && supplier[i].equalsIgnoreCase(cariSupplier)) {
                                            hasil = i;
                                            break;
                                        } else {
                                            hasil = -1;// kembalian -1 jika tidak ada nama supplier
                                        }
                                    }
                                    int count = 0;
                                    for (int i = 0; i < supplier.length; i++) {
                                        if (supplier[i] != null && supplier[i].equalsIgnoreCase(cariSupplier)) {
                                            count++;
                                        } // menghitung berapa kali nama supplier muncul
                                    }
                                    if (hasil == -1) {// tampilan jika supplier tidak ada
                                        System.out.println("Barang Tidak Ada");
                                    }
                                    // buat array baru dengan ukuran brp x supplier duplikat
                                    int[] lebihSatu = new int[count];
                                    int currentIndex = 0;
                                    if (count > 1) { // menyimpan posisi index jika supplier lebih dari 1
                                        for (int i = 0; i < supplier.length; i++) {
                                            if (supplier[i] != null && supplier[i].equalsIgnoreCase(cariSupplier)) {
                                                lebihSatu[currentIndex] = i;
                                                currentIndex++;
                                            }
                                        }
                                    }

                                    if (hasil >= 0 && hasil <= supplier.length) {// input informasi jika supplier ada
                                        System.out.print("Masukkan Kontak Supplier: ");
                                        String newKontak = input.nextLine();
                                        System.out.print("Masukkan Alamat Supplier: ");
                                        String newAlamat = input.nextLine();

                                        if (count > 1) {// jika nama supplier yang sama>1
                                            for (int i = 0; i < lebihSatu.length; i++) {
                                                konSupp[lebihSatu[i]] = newKontak;
                                                alamatSupp[lebihSatu[i]] = newAlamat;
                                            }
                                        }
                                        konSupp[hasil] = newKontak;// masukkan input ke array
                                        alamatSupp[hasil] = newAlamat;// masukkan input ke array
                                    }

                                } while (stop4 != 0);

                                break;
                            case 2:
                                System.out.println("========================================");
                                System.out.println("==============List Supplier=============");
                                System.out.println("========================================");
                                System.out.printf("%-3s| %-15s| %-15s| %-10s|\n", "No", "Supplier", "Kontak",
                                        " Alamat");
                                for (int i = 0; i < supplier.length; i++) {
                                    if (supplier[i] != null) {
                                        if (konSupp[i] == null && alamatSupp[i] == null) {
                                            System.out.printf("%-3s| %-15s| %-15s| %-10s| \n", (i + 1), supplier[i],
                                                    " ", " ");
                                        } else if (konSupp[i] == null) {
                                            System.out.printf("%-3s| %-15s| %-15s| %-10s| \n", (i + 1), supplier[i],
                                                    " ", alamatSupp[i]);
                                        } else if (alamatSupp[i] == null) {
                                            System.out.printf("%-3s| %-15s| %-15s| %-10s| \n", (i + 1), supplier[i],
                                                    konSupp[i], " ");
                                        } else {
                                            System.out.printf("%-3s| %-15s| %-15s| %-10s| \n", (i + 1), supplier[i],
                                                    konSupp[i], alamatSupp[i]);
                                        }

                                    }
                                }
                                System.out.println("========================================");
                                break;
                        } // "%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s

                    } while (menu4 != 0);
                    break;

                case 5:
                System.out.println("========= Item Scanning =========");
                System.out.print("Masukkan Nama Barang yang akan discan: ");
                String scannedItem = input.next();

                boolean found = false;
                // Cari barang berdasarkan nama
                for (int i = 0; i < namaBrg.length; i++) {
                    if (namaBrg[i] != null && namaBrg[i].equalsIgnoreCase(scannedItem)) {
                        System.out.println("Informasi Barang:");
                        System.out.println("Nama Barang: " + namaBrg[i]);
                        System.out.println("Tipe Barang: " + tipeBrg[i]);
                        System.out.println("Tanggal Produksi: " + prdDate[i]);
                        System.out.println("Tanggal Kadaluwarsa: " + expDate[i]);
                        System.out.println("Supplier: " + supplier[i]);
                        System.out.println("Harga: " + harga[i]);
                        System.out.println("Stok: " + stokBrg[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Barang tidak ditemukan.");
                }
                break;

                case 6:
                    int menu6, stop6 = 0;
                    int index6 = 0;
                    Date today = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

                    do {
                        System.out.println("-----------------------------------------");
                        System.out.println("|\t Expiry Date Tracking     \t|");
                        System.out.println("-----------------------------------------");
                        System.out.println("Silahkan Pilih");
                        System.out.println("1. Cek Tanggal Kadaluwarsa");
                        System.out.println("2. Tampilkan Daftar Kadaluwarsa");
                        System.out.println("0. Kembali");
                        System.out.print("Masukkan Nomor: ");
                        menu6 = input.nextInt();
                        input.nextLine();

                        switch (menu6) {
                            case 1:
                                System.out.println("---------------------------------");
                                System.out.println("|\tCEK TGL KADALUWARSA \t|");
                                System.out.println("---------------------------------");
                                System.out.println("=========================================");
                                System.out.println("| NO\t| NAMA BARANG\t\t\t|");
                                System.out.println("=========================================");

                                // daftar barang
                                for (int i = 0; i < namaBrg.length; i++) {
                                    if (stokBrg[i] == 0) {
                                        continue;
                                    } else {
                                        System.out.printf("%s %d\t| %-25s\t|%n", "|", (i + 1), namaBrg[i]);
                                    }
                                }

                                System.out.println("=========================================");

                                System.out.print("Masukkan Nomor barang: ");
                                int noBarangCek = input.nextInt();

                                // Mengonversi tanggal kadaluwarsa dari string ke Date
                                Date expDateCek = dateFormat.parse(expDate[index6]);

                                if (noBarangCek >= 1 && noBarangCek <= namaBrg.length) {
                                    index6 = noBarangCek - 1;

                                    System.out.println("-----------------------------------------");

                                    // cek tanggal
                                    if (today.after(expDateCek)) {
                                        System.out.println("|\tBARANG KADALUWARSA\t|");
                                    } else {
                                        System.out.println("|\tBARANG BELUM KADALUWARSA\t|");
                                    }
                                } else {
                                    System.out.println("Indeks tidak valid.");
                                }
                                System.out.println("-----------------------------------------");
                                break;

                            case 2:
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
                                // Sorting tanggal kadaluwarsa terdekat
                                for (int i = 0; i < sortExpDate.length - 1; i++) {
                                    for (int j = 0; j < sortExpDate.length - i - 1; j++) {
                                        // menyeleksi jika ada array expdate barang yang null
                                        if (sortExpDate[j] == null || sortExpDate[j + 1] == null) {
                                            continue;
                                        }
                                        Date date1 = dateFormat.parse(sortExpDate[j]);
                                        Date date2 = dateFormat.parse(sortExpDate[j + 1]);

                                        if (date1.after(date2)) {
                                            // untuk ubah urutan nama
                                            String tempNama = sortNamaBrg[j];
                                            sortNamaBrg[j] = sortNamaBrg[j + 1];
                                            sortNamaBrg[j + 1] = tempNama;

                                            // untuk ubah urutan tanggal kadaluwarsa
                                            String tempDate = sortExpDate[j];
                                            sortExpDate[j] = sortExpDate[j + 1];
                                            sortExpDate[j + 1] = tempDate;
                                        }
                                    }
                                }
                                // menampilkan
                                System.out.println(
                                        "=================================================================================");

                                System.out.println("|\t\t\t       DAFTAR BARANG KADALUWARSA       \t\t\t|");
                                System.out.println(
                                        "=================================================================================");
                                System.out.printf("| %-5s| %-25s\t| %-15s| %-20s |%n", "NO", "NAMA BARANG",
                                        "TGL KADALUWARSA",
                                        "STATUS BARANG");
                                System.out.println(
                                        "=================================================================================");
                                int indexTampil = 1;
                                for (int i = 0; i < sortExpDate.length; i++) {
                                    // mengecek kembali jika terdapat nilai null
                                    if (expDate[i] == null) {
                                        // skip nilai null
                                        continue;
                                    } else {
                                        Date expDateDaftar = dateFormat.parse(sortExpDate[i]);

                                        if (today.after(expDateDaftar)) {
                                            System.out.printf("| %-5d| %-25s\t| %-15s| %-20s |%n", (i + 1),
                                                    sortNamaBrg[i],
                                                    sortExpDate[i],
                                                    "Kadaluwarsa");
                                        } else {
                                            System.out.printf("| %-5d| %-25s\t| %-15s| %-20s |%n", (i + 1),
                                                    sortNamaBrg[i],
                                                    sortExpDate[i],
                                                    "Belum Kadaluwarsa");
                                        }
                                    }
                                }
                                System.out.println(
                                        "=================================================================================");

                                break;

                            case 0:
                                break;
                        }
                    } while (menu6 != stop6);
                    break;
                case 7:
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
                                            System.out.printf(
                                                    "%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No",
                                                    "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa",
                                                    "Harga", "Stok");
                                            for (int i = 0; i < namaBrg.length; i++) {
                                                if (namaBrg[i] != null) {
                                                    System.out.printf(
                                                            "%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                                                            (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i],
                                                            expDate[i], harga[i], stokBrg[i]);
                                                }
                                            } // menampilkan informasi barang dalam gudang

                                            System.out.print("Masukkan Nomor Urut Barang: ");
                                            int cariNomorBarangMalang = input.nextInt();
                                            // mencari posisi index barang
                                            if (cariNomorBarangMalang >= 1 && cariNomorBarangMalang <= namaBrg.length) {
                                                indeks = cariNomorBarangMalang - 1;
                                                System.out
                                                        .println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                                            } else {
                                                System.out.println("Nomor barang tidak valid.");
                                            }
                                            // jika barang tidak ada/ salah input nomor barang maka tidak dijalankan
                                            if (cariNomorBarangMalang >= 1 && cariNomorBarangMalang <= namaBrg.length) {
                                                System.out.print("Masukkan Jumlah Barang: ");
                                                jumKirBarang = input.nextInt();
                                                stokBrg[indeks] -= jumKirBarang; // mengurangi stok gudang
                                                stokCabang[0][indeks] += jumKirBarang; // menambah stok di cabang
                                            }

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
                                            System.out.printf(
                                                    "%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No",
                                                    "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa",
                                                    "Harga", "Stok");
                                            for (int i = 0; i < namaBrg.length; i++) {
                                                if (namaBrg[i] != null) {
                                                    System.out.printf(
                                                            "%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                                                            (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i],
                                                            expDate[i], harga[i], stokBrg[i]);
                                                }
                                            } // menampilkan informasi barang dalam gudang

                                            System.out.print("Masukkan Nomor Urut Barang: ");
                                            int cariNomorBarangBlitar = input.nextInt();
                                            // mencari posisi index barang
                                            if (cariNomorBarangBlitar >= 1 && cariNomorBarangBlitar <= namaBrg.length) {
                                                indeks = cariNomorBarangBlitar - 1;
                                                System.out
                                                        .println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                                            } else {
                                                System.out.println("Nomor barang tidak valid.");
                                            }
                                            // jika barang tidak ada/ salah input nomor barang maka tidak dijalankan
                                            if (cariNomorBarangBlitar >= 1 && cariNomorBarangBlitar <= namaBrg.length) {
                                                System.out.print("Masukkan Jumlah Barang: ");
                                                jumKirBarang = input.nextInt();
                                                stokBrg[indeks] -= jumKirBarang; // mengurangi stok gudang
                                                stokCabang[1][indeks] += jumKirBarang; // menambah stok di cabang
                                            }

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
                                            System.out.printf(
                                                    "%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No",
                                                    "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa",
                                                    "Harga", "Stok");
                                            for (int i = 0; i < namaBrg.length; i++) {
                                                if (namaBrg[i] != null) {
                                                    System.out.printf(
                                                            "%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n",
                                                            (i + 1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i],
                                                            expDate[i], harga[i], stokBrg[i]);
                                                }
                                            } // menampilkan informasi barang dalam gudang

                                            System.out.print("Masukkan Nomor Urut Barang: ");
                                            int cariNomorBarangTuban = input.nextInt();
                                            // mencari posisi index barang
                                            if (cariNomorBarangTuban >= 1 && cariNomorBarangTuban <= namaBrg.length) {
                                                indeks = cariNomorBarangTuban - 1;
                                                System.out
                                                        .println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                                            } else {
                                                System.out.println("Nomor barang tidak valid.");
                                            }
                                            // jika barang tidak ada/ salah input nomor barang maka tidak dijalankan
                                            if (cariNomorBarangTuban >= 1 && cariNomorBarangTuban <= namaBrg.length) {
                                                System.out.print("Masukkan Jumlah Barang: ");
                                                jumKirBarang = input.nextInt();
                                                stokBrg[indeks] -= jumKirBarang; // mengurangi stok gudang
                                                stokCabang[2][indeks] += jumKirBarang; // menambah stok di cabang
                                            }

                                            break;
                                        default:
                                            if (fitur8 != 0) {
                                                System.out.println("Pilih Nomor Cabang!!!");
                                            }

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
                                    if (namaBrg[i] != null) {
                                        System.out.printf("%-24s", namaBrg[i]);
                                    }
                                    for (int j = 0; j < stokCabang.length; j++) {
                                        if (namaBrg[i] != null) { // stokCabang[j][i] != 0
                                            System.out.printf("|  %-4d ", stokCabang[j][i]);
                                        }

                                    }
                                    if (namaBrg[i] != null) {
                                        System.out.println("|");
                                    }

                                }
                                break; // break case 2 fitur delivery
                        }

                    } while (fitur8 != 0);
                    break;// break menu8
            }
        } while (fitur != 0);

    }

}

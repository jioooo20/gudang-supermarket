import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainFunction {

    // put function here
    // array diberi static agar semua function dapat mengakses
    static String[] namaBrg = new String[20];
    static String[] tipeBrg = new String[20];
    static String[] prdDate = new String[20];
    static String[] expDate = new String[20];
    static String[] supplier = new String[20];
    static String[] konSupp = new String[20];
    static String[] alamatSupp = new String[20];
    static double[] harga = new double[20];
    static int[] stokBrg = new int[20];
    static int[] itemCode = new int[20];
    static String[] cabang = new String[3];
    static int[][] stokCabang = new int[3][20];
    static Date today = new Date();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    static {

        namaBrg[0] = "Mie Sedap Goreng 1";
        namaBrg[1] = "Aqua 600ml";
        namaBrg[2] = "Paracetamol";
        namaBrg[3] = "Djarum Super";
        namaBrg[4] = "Teh Pucuk Harum 600ml";
        namaBrg[5] = "Coca-Cola 600ml";
        namaBrg[6] = "OBH Combi 100ml";
        namaBrg[7] = "Gudang Garam";
        namaBrg[8] = "Roti Aoka 2";
        namaBrg[9] = "Teh Kotak 300ml";
        namaBrg[10] = "Aspirin";
        namaBrg[11] = "Sampoerna";
        namaBrg[12] = "Chitato 3";
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

        prdDate[0] = "22-09-2020";
        prdDate[1] = "23-09-2021";
        prdDate[2] = "21-10-2023";
        prdDate[3] = "24-09-2023";
        prdDate[4] = "20-09-2023";
        prdDate[5] = "22-09-2023";
        prdDate[6] = "23-09-2023";
        prdDate[7] = "21-10-2023";
        prdDate[8] = "24-09-2023";
        prdDate[9] = "20-11-2023";
        prdDate[10] = "22-09-2019";
        prdDate[11] = "23-09-2023";
        prdDate[12] = "21-10-2023";
        prdDate[13] = "24-09-2023";
        prdDate[14] = "20-11-2023";

        expDate[0] = "23-12-2022";
        expDate[1] = "24-10-2023";
        expDate[2] = "20-11-2024";
        expDate[3] = "25-12-2023";
        expDate[4] = "19-12-2024";
        expDate[5] = "23-12-2024";
        expDate[6] = "24-12-2025";
        expDate[7] = "20-11-2024";
        expDate[8] = "25-12-2023";
        expDate[9] = "19-12-2024";
        expDate[10] = "23-01-2021";
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

        // makanan = 825
        // minuman = 926
        // rokok = 714
        // obat = 169
        itemCode[0] = 825001; // makanan
        itemCode[1] = 936001;// minuman
        itemCode[2] = 169001;// obat
        itemCode[3] = 714001;// rokok
        itemCode[4] = 936002;// minuman
        itemCode[5] = 936003;// minuman
        itemCode[6] = 169002;// obat
        itemCode[7] = 714002;// rokok
        itemCode[8] = 825002; // makanan
        itemCode[9] = 936004;// minuman
        itemCode[10] = 169003;// obat
        itemCode[11] = 714003;// rokok
        itemCode[12] = 825003; // makanan
        itemCode[13] = 936005;// minuman
        itemCode[14] = 169004;// obat

        cabang[0] = "Malang";
        cabang[1] = "Blitar";
        cabang[2] = "Tuban";

        // malang
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

        // blitar
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

        // tuban
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
    }

    static void PengirimanCabang(int cabang, int n) {
        Scanner input = new Scanner(System.in);
        int indeks = SearchUseIndexNumber(n);
        int jumKirBarang;
        // jika barang tidak ada, input tidak dijalankan
        if (n >= 1 && n <= namaBrg.length) {
            // System.out.println(indeks);//FOR TRACING
            System.out.print("Masukkan Jumlah barang yang dikirim: ");
            jumKirBarang = input.nextInt();
            stokBrg[indeks] -= jumKirBarang;
            stokCabang[cabang][indeks] += jumKirBarang;
        }
    }

    static int SearchUseIndexNumber(int n) {
        int indeks = -1;
        if (n >= 1 && n <= namaBrg.length) {
            indeks = n - 1;
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("|     Nomor yang anda masukkan salah    |");
            System.out.println("-----------------------------------------");

        }
        return indeks;
    }

    static void printBrgLengkap() {// menampilkan informasi barang dalam gudang
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
        }
    }

    static int firstEmptyNull() {// mencari spot null pertama untuk diisi
        int index = -1;
        for (int i = 0; i < namaBrg.length; i++) {
            if (namaBrg[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Searching "String"
    static int FindInArray(String[] found, String foundWhat) {
        int hasil = 0;
        for (int i = 0; i < found.length; i++) {
            if (found[i] != null && found[i].equalsIgnoreCase(foundWhat)) {
                hasil = i;
                break;
            } else {
                hasil = -1;// kembalian -1 jika tidak ada "String"
            }
        }
        // System.out.println("hasil" + hasil); //FOR TRACING
        return hasil;
    }

    // Searching "integer"
    static int FindIntegerInArray(int[] found, int foundWhat) {
        int hasil = 0;
        for (int i = 0; i < found.length; i++) {
            if (found[i] != 0 && found[i] == foundWhat) {
                hasil = i;
                break;
            } else {
                hasil = -1;// kembalian -1 jika tidak ada "String"
            }
        }
        // System.out.println("hasil" + hasil); //FOR TRACING
        return hasil;
    }

    // hitung "String" muncul(++)
    static int CountNamaLebihDariSatu(String[] found, String foundWhat) {
        int count = 0;
        for (int i = 0; i < found.length; i++) {
            if (found[i] != null && found[i].equalsIgnoreCase(foundWhat)) {
                count++;
            }
        }
        // System.out.println(count + "count");//FOR TRACING
        return count;
    }

    // simpan posisi indeks "String"
    static int[] MakeArrayLebihDari1(String[] found, String foundWhat) {
        int count = CountNamaLebihDariSatu(found, foundWhat);
        int[] lebihsatu = new int[count];
        int currentIndex = 0;
        if (count > 1) {
            for (int i = 0; i < found.length; i++) {
                if (found[i] != null && found[i].equalsIgnoreCase(foundWhat)) {
                    // System.out.println(i);//FOR TRACING
                    // System.out.println(foundWhat);//FOR TRACING
                    lebihsatu[currentIndex] = i;
                    currentIndex++;

                }
            }
        } else if (count == 1) {
            for (int i = 0; i < found.length; i++) {
                if (found[i] != null && found[i].equalsIgnoreCase(foundWhat)) {
                    lebihsatu[0] = i;
                }
            }
        }
        // for (int i = 0; i < lebihsatu.length; i++) {
        // System.out.println(lebihsatu[i] + "indek");
        // }//FOR TRACING
        return lebihsatu;
    }

    static void displayListItems() { // menampilkan daftar barang(hanya nama barang)
        for (int i = 0; i < namaBrg.length; i++) {
            if (namaBrg[i] == null) {
                continue;
            } else {
                System.out.printf("%s %d\t| %-25s\t|%n", "|", (i + 1), namaBrg[i]);
            }
        }
    }

    static void swapData(int i, int j, String[] sortNamaBrg, String[] sortTipeBrg,
            String[] sortPrdDate, String[] sortExpDate, String[] sortSupplier,
            String[] sortKonSupp, String[] sortAlamatSupp, double[] sortHarga,
            int[] sortStokBrg, int[] sortKode) {

        // untuk ubah urutan nama
        String tempNama = sortNamaBrg[i];
        sortNamaBrg[i] = sortNamaBrg[j];
        sortNamaBrg[j] = tempNama;

        // untuk ubah urutan kategori
        String tempTipe = sortTipeBrg[i];
        sortTipeBrg[i] = sortTipeBrg[j];
        sortTipeBrg[j] = tempTipe;

        // untuk ubah urutan Tgl Produksi
        String tempPrdDate = sortPrdDate[i];
        sortPrdDate[i] = sortPrdDate[j];
        sortPrdDate[j] = tempPrdDate;

        // untuk ubah urutan Tgl kadaluwarsa
        String tempExpDate = sortExpDate[i];
        sortExpDate[i] = sortExpDate[j];
        sortExpDate[j] = tempExpDate;

        // untuk ubah urutan Supplier
        String tempSupplier = sortSupplier[i];
        sortSupplier[i] = sortSupplier[j];
        sortSupplier[j] = tempSupplier;

        // untuk ubah urutan Kontak Supplier
        String tempKonSupp = sortKonSupp[i];
        sortKonSupp[i] = sortKonSupp[j];
        sortKonSupp[j] = tempKonSupp;

        // untuk ubah urutan Alamat Supplier
        String tempAlamatSupp = sortAlamatSupp[i];
        sortAlamatSupp[i] = sortAlamatSupp[j];
        sortAlamatSupp[j] = tempAlamatSupp;

        // untuk ubah urutan harga
        double tempHarga = sortHarga[i];
        sortHarga[i] = sortHarga[j];
        sortHarga[j] = tempHarga;

        // untuk ubah urutan stok
        int tempStok = sortStokBrg[i];
        sortStokBrg[i] = sortStokBrg[j];
        sortStokBrg[j] = tempStok;

        // untuk ubah urutan kode barang
        int tempKode = sortKode[i];
        sortKode[i] = sortKode[j];
        sortKode[j] = tempKode;

    }

    static String[] copyNama() {
        String[] sortNamaBrg = new String[namaBrg.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortNamaBrg[i] = namaBrg[i];
        }
        return sortNamaBrg;
    }

    static String[] copyTipe() {
        String[] sortTipeBrg = new String[tipeBrg.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortTipeBrg[i] = tipeBrg[i];
        }
        return sortTipeBrg;
    }

    static String[] copyProd() {
        String[] sortPrdDate = new String[prdDate.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortPrdDate[i] = prdDate[i];
        }

        return sortPrdDate;
    }

    static String[] copyExpDate() {
        String[] sortExpDate = new String[expDate.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortExpDate[i] = expDate[i];
        }
        return sortExpDate;
    }

    static String[] copySupplier() {
        String[] sortSupplier = new String[supplier.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortSupplier[i] = supplier[i];
        }
        return sortSupplier;
    }

    static String[] copyKonSupp() {
        String[] sortKonSupp = new String[konSupp.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortKonSupp[i] = konSupp[i];
        }

        return sortKonSupp;
    }

    static String[] copyAlamatSupp() {
        String[] sortAlamatSupp = new String[alamatSupp.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortAlamatSupp[i] = alamatSupp[i];
        }

        return sortAlamatSupp;
    }

    static double[] copyHarga() {
        double[] sortHarga = new double[harga.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortHarga[i] = harga[i];
        }

        return sortHarga;
    }

    static int[] copyStokBrg() {
        int[] sortStokBrg = new int[stokBrg.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortStokBrg[i] = stokBrg[i];
        }

        return sortStokBrg;
    }

    static int[] copyKode() {
        int[] sortKode = new int[itemCode.length];

        for (int i = 0; i < namaBrg.length; i++) {
            sortKode[i] = itemCode[i];
        }
        return sortKode;
    }

    // merge codeitem
    static int MergeCode(int tipe, int urut) {
        String code = Integer.toString(tipe);
        String item = Integer.toString(urut);
        // merge
        String codeitem = "000000";

        if (urut < 10) {
            codeitem = code + "00" + item;
        } else if (urut >= 10) {
            codeitem = code + "0" + item;
        }

        int itemCode = Integer.parseInt(codeitem);
        return itemCode;
    }

    static int TwoLastDigit(String FoundWhat) {
        int[] AllArray = MakeArrayLebihDari1(tipeBrg, FoundWhat);
        int LastArray = AllArray[AllArray.length - 1];
        int Alldigit = itemCode[LastArray];
        for (int i = 0; i < AllArray.length; i++) {
            System.out.println(AllArray[i]);
        }
        System.out.println(LastArray);
        int DuaDigitTerakhir = Alldigit;
        int digit = (int) DuaDigitTerakhir % 100;
        String padding = String.format("%02d", digit);
        int Last2Digit = Integer.parseInt(padding);
        // System.out.println(padding);
        return Last2Digit;
    }

    // function input data
    static void inputNewData(String nama, String supplierr, String tipe, String prod, String exp, int hargaa,
            int stok) {
        int i = firstEmptyNull();
        // int makanan = CountNamaLebihDariSatu(tipeBrg, "Makanan");
        // int minuman = CountNamaLebihDariSatu(tipeBrg, "Minuman");
        // int obat = CountNamaLebihDariSatu(tipeBrg, "Obat");
        // int rokok = CountNamaLebihDariSatu(tipeBrg, "Rokok");//hapus

        int makanan = TwoLastDigit("Makanan");
        int minuman = TwoLastDigit("Minuman");
        int obat = TwoLastDigit("Obat");
        int rokok = TwoLastDigit("Rokok");

        int codeMakanan = MergeCode(825, makanan + 1);
        int codeMinuman = MergeCode(936, minuman + 1);
        int codeObat = MergeCode(169, obat + 1);
        int codeRokok = MergeCode(714, rokok + 1);

        if (i == -1) {
            System.out.println("======================================");
            System.out.println("|               ALERT                |");
            System.out.println("--------------------------------------");
            System.out.println("|         Gudang Sudah Penuh!        |");
            System.out.println("======================================");
        } else if (i != -1) {
            namaBrg[i] = nama;
            tipeBrg[i] = tipe;
            supplier[i] = supplierr;
            prdDate[i] = prod;
            expDate[i] = exp;
            harga[i] = hargaa;
            stokBrg[i] = stok;
            if (tipe.equalsIgnoreCase("Makanan")) {
                itemCode[i] = codeMakanan;
            }
            if (tipe.equalsIgnoreCase("Minuman")) {
                itemCode[i] = codeMinuman;
            }
            if (tipe.equalsIgnoreCase("Obat")) {
                itemCode[i] = codeObat;
            }
            if (tipe.equalsIgnoreCase("Rokok")) {
                itemCode[i] = codeRokok;
            }
            System.out.println("Data Baru Telah Ditambahkan!");
        }
    }

    static void updateItem(Scanner input) {
        System.out.println("-------------------------");
        System.out.println("|\tUPDATE DATA \t|");
        System.out.println("-------------------------");
        System.out.println("=========================================");
        System.out.println("| NO\t| NAMA BARANG\t\t\t|");
        System.out.println("=========================================");

        displayListItems();

        System.out.println("=========================================");
        System.out.print("Masukkan Nomor Barang: ");
        int noBrgUpdate = input.nextInt();
        input.nextLine();

        // Cari index barang
        int index = SearchUseIndexNumber(noBrgUpdate);
        if (index != -1) {
            // pilihan part yang di update
            System.out.println("============================");
            System.out.println("Part yang ingin anda ubah:");
            System.out.println("1. Nama Barang");
            System.out.println("2. Kategori Barang");
            System.out.println("3. Tanggal Produksi Barang");
            System.out.println("4. Tanggal Kadaluwarsa Barang");
            System.out.println("5. Harga Barang");
            System.out.println("6. Jumlah Stok Barang");
            System.out.println("7. Supplier");
            System.out.println("8. Kode Barang");
            System.out.println("0. Selesai");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            // Update part yang dipilih
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
                    System.out.println("Supplier Barang Lama: " + supplier[index]);
                    System.out.print("Masukkan Supplier Barang Baru: ");
                    supplier[index] = input.nextLine();
                    break;
                case 8:
                    System.out.println("Kode Barang Lama: " + itemCode[index]);
                    System.out.print("Masukkan Kode Barang Baru: ");
                    int kode = input.nextInt();
                    int nomor = FindIntegerInArray(itemCode, kode);

                    if (nomor == -1) {
                        itemCode[index] = kode;
                        System.out.println("Barang " + namaBrg[index] + " berhasil diperbarui ");
                    } else if (nomor != -1) {
                        System.out.println("Kode Barang Sudah Digunakan");
                    }
                    break;
                case 0:
                    System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            if (pilihan != 8) {
                System.out.println("Barang " + namaBrg[index] + " berhasil diperbarui ");
            }
        }
    }

    static void deleteItem(Scanner input) {
        System.out.println("-------------------------");
        System.out.println("|\tHAPUS DATA \t|");
        System.out.println("-------------------------");
        System.out.println("=========================================");
        System.out.println("| NO\t| NAMA BARANG\t\t\t|");
        System.out.println("=========================================");

        // daftar barang
        displayListItems();

        System.out.println("=========================================");
        System.out.print("Masukkan Nomor barang: ");
        int noBrgHapus = input.nextInt();

        // cari index barang
        int index = SearchUseIndexNumber(noBrgHapus);

        // hapus data barang
        if (index != -1) {
            int deletedItemCode = itemCode[index];
            String namaBrgHapus = namaBrg[index];
            for (int i = index; i < namaBrg.length - 1; i++) {
                namaBrg[i] = namaBrg[i + 1];
                tipeBrg[i] = tipeBrg[i + 1];
                prdDate[i] = prdDate[i + 1];
                expDate[i] = expDate[i + 1];
                supplier[i] = supplier[i + 1];
                konSupp[i] = konSupp[i + 1];
                alamatSupp[i] = alamatSupp[i + 1];
                harga[i] = harga[i + 1];
                stokBrg[i] = stokBrg[i + 1];
                itemCode[i] = itemCode[i + 1];

            }

            System.out.println(
                    "Data barang " + namaBrgHapus + " dengan Kode Barang " + deletedItemCode
                            + " telah berhasil dihapus");
        }
    }

    static void displayItems() {
        System.out.println(
                "=========================================================================================================================================================");
        System.out.println("|\t\t\t\t\t\t\t\t|    DAFTAR STOK BARANG    |\t\t\t\t\t\t\t\t|");
        System.out.println(
                "=========================================================================================================================================================");
        System.out.printf(
                "|%-5s| %-8s| %-30s| %-15s| %-15s| %-18s| %-20s| %-15s| %-9s|%n",
                "NO", "KODE", "NAMA BARANG", "KATEGORI", "TGL PRODUKSI",
                "TGL KADALUWARSA", "SUPPLIER", "HARGA", "STOK");
        System.out.println(
                "=========================================================================================================================================================");

        // Salin array yang akan diurutkan secara manual
        String[] NamaBarang = copyNama();
        String[] TipeBarang = copyTipe();
        String[] ProduksiDate = copyProd();
        String[] ExpiredDate = copyExpDate();
        String[] Supplier = copySupplier();
        String[] KontakSupplier = copyKonSupp();
        String[] AlamatSupplier = copyAlamatSupp();
        double[] Harga = copyHarga();
        int[] StokBarang = copyStokBrg();
        int[] KodeBarang = copyKode();

        // Sorting dari jumlah stok barang paling sedikit ke yang paling banyak
        for (int i = 0; i < StokBarang.length - 1; i++) { // agar stok paling banyak berada di paling ujung
            for (int j = 0; j < StokBarang.length - i - 1; j++) {
                if (StokBarang[j] > StokBarang[j + 1]) {
                    swapData(j, j + 1, NamaBarang, TipeBarang, ProduksiDate, ExpiredDate, Supplier,
                            KontakSupplier, AlamatSupplier, Harga, StokBarang, KodeBarang);
                }
            }
        }

        // menampilkan data barang
        int indexTampil = 1;

        for (int i = 0; i < StokBarang.length; i++) {
            if (KodeBarang[i] == 0) {
                continue;
            } else {
                System.out.printf(
                        "|%-5s| %-8d| %-30s| %-15s| %-15s| %-18s| %-20s| %-15s| %-9s|%n",
                        indexTampil++, KodeBarang[i], NamaBarang[i], TipeBarang[i], ProduksiDate[i],
                        ExpiredDate[i], Supplier[i], Harga[i], StokBarang[i]);
            }
        }
        System.out.println(
                "=========================================================================================================================================================");

    }

    static void checkExpired(Scanner input) throws Exception {
        System.out.println("---------------------------------");
        System.out.println("|\tCEK TGL KADALUWARSA \t|");
        System.out.println("---------------------------------");
        System.out.println("=========================================");
        System.out.println("| NO\t| NAMA BARANG\t\t\t|");
        System.out.println("=========================================");

        // daftar barang
        displayListItems();

        System.out.println("=========================================");

        System.out.print("Masukkan Nomor barang: ");
        int noBarangCek = input.nextInt();
        int index = SearchUseIndexNumber(noBarangCek);

        if (index != -1) {
            // Mengonversi tanggal kadaluwarsa dari string ke Date
            Date expDateCek = dateFormat.parse(expDate[index]);

            if (noBarangCek >= 1 && noBarangCek <= namaBrg.length) {
                index = noBarangCek - 1;
                System.out.println("-----------------------------------------");
                System.out.println("|\t" + "Tgl Kadaluwarsa: " + expDate[index] + "\t|");

                // cek tanggal
                if (today.after(expDateCek)) {
                    System.out.println("|\t BARANG SUDAH KADALUWARSA\t|");
                } else {
                    System.out.println("|\t BARANG BELUM KADALUWARSA\t|");
                }
                System.out.println("-----------------------------------------");
            } else {
                System.out.println("|\t Indeks tidak valid \t|");
            }
        }

    }

    static void displayExpired() throws Exception {

        // Salin array yang akan diurutkan secara manual

        String[] NamaBarang = copyNama();
        String[] TipeBarang = copyTipe();
        String[] ProduksiDate = copyProd();
        String[] ExpiredDate = copyExpDate();
        String[] Supplier = copySupplier();
        String[] KontakSupplier = copyKonSupp();
        String[] AlamatSupplier = copyAlamatSupp();
        double[] Harga = copyHarga();
        int[] StokBarang = copyStokBrg();
        int[] KodeBarang = copyKode();

        // Sorting dari jumlah tanggal barang paling sedikit ke yang paling banyak
        for (int i = 0; i < ExpiredDate.length - 1; i++) {
            for (int j = 0; j < ExpiredDate.length - i - 1; j++) {
                // menyeleksi jika ada array expdate barang yang null
                if (ExpiredDate[j] == null || ExpiredDate[j + 1] == null) {
                    continue;
                }
                // Konversi ExpiredDate dari String ke Date dengan dateFormat
                Date date1 = dateFormat.parse(ExpiredDate[j]);
                Date date2 = dateFormat.parse(ExpiredDate[j + 1]);

                // melakukan swap/penukaran posisi data
                if (date1.after(date2)) {
                    swapData(j, j + 1, NamaBarang, TipeBarang, ProduksiDate, ExpiredDate, Supplier,
                            KontakSupplier, AlamatSupplier, Harga, StokBarang, KodeBarang);
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

        for (int i = 0; i < ExpiredDate.length; i++) {
            // mengecek kembali jika terdapat nilai null
            if (ExpiredDate[i] == null) {
                // skip nilai null
                continue;
            } else {
                Date expDateDaftar = dateFormat.parse(ExpiredDate[i]);

                if (today.after(expDateDaftar)) {
                    System.out.printf("| %-5d| %-25s\t| %-15s| %-20s |%n", (i + 1),
                            NamaBarang[i],
                            ExpiredDate[i],
                            "Kadaluwarsa");
                } else {
                    System.out.printf("| %-5d| %-25s\t| %-15s| %-20s |%n", (i + 1),
                            NamaBarang[i],
                            ExpiredDate[i],
                            "Belum Kadaluwarsa");
                }
            }
        }
        System.out.println(
                "=================================================================================");

    }

    static void codeScanning(Scanner input) {
        System.out.println("-----------------------------------------------");
        System.out.println("|      \t\t CODE SCANNING \t\t      |");
        System.out.println("-----------------------------------------------");
        System.out.println("===============================================");
        System.out.printf("| %-30s| %-12s| %n", "NAMA BARANG", "KODE BARANG");
        System.out.println("===============================================");

        // daftar barang
        for (int i = 0; i < namaBrg.length; i++) {
            if (namaBrg[i] == null) {
                continue;
            } else {
                System.out.printf("| %-30s| %-12s| %n", namaBrg[i], itemCode[i]);
            }
        }

        System.out.println("===============================================");
        System.out.print("Masukkan Kode Barang: ");
        int kode = input.nextInt();

        // Cari index barang
        int index = FindIntegerInArray(itemCode, kode);
        // Salin array yang akan diurutkan secara manual

        // menampilkan
        if (index == -1) {
            System.out.println("==========================================");
            System.out.println("|           Barang Tidak Ditemukan       |");
            System.out.println("==========================================");
        } else {

            System.out.println(
                    "===================================================================================================================================================");

            System.out
                    .println("|\t\t\t\t\t\t" + "      INFORMASI BARANG (" + namaBrg[index] + ")       \t\t\t\t\t\t  |");
            System.out.println(
                    "===================================================================================================================================================");
            System.out.printf(
                    "| %-8s| %-30s| %-15s| %-15s| %-18s| %-20s| %-15s| %-9s|%n",
                    "KODE", "NAMA BARANG", "KATEGORI", "TGL PRODUKSI",
                    "TGL KADALUWARSA", "SUPPLIER", "HARGA", "STOK");
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf(
                    "| %-8d| %-30s| %-15s| %-15s| %-18s| %-20s| %-15s| %-9s|%n",
                    itemCode[index], namaBrg[index], tipeBrg[index], prdDate[index],
                    expDate[index], supplier[index], harga[index], stokBrg[index]);

            System.out.println(
                    "===================================================================================================================================================");

        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int fitur;

        do {
            System.out.println("========================================");
            System.out.println("|             SELAMAT DATANG           |");
            System.out.println("========================================");
            System.out.println("1.Item Entry and Storage");
            System.out.println("2.Update Item Information");
            System.out.println("3.Item Categorization");
            System.out.println("4.Supplier Management");
            System.out.println("5.Code Scanning");
            System.out.println("6.Expiry Date Tracking ");
            System.out.println("7.Delivery");
            System.out.println("0.Keluar");
            System.out.print("Masukkan Nomor Menu: ");
            fitur = input.nextInt();
            if (fitur == 0) {
                break;
            }

            switch (fitur) {
                case 1:
                    System.out.println("----------------------------------------------------");
                    System.out.println("|                Item Entry and Storage            |");
                    System.out.println("----------------------------------------------------");
                    System.out.print("Masukkan Nama Barang(Gunakan '-' untuk spasi): ");
                    String newNamabrg = input.next();
                    System.out.print("Masukkan Nama Supplier(Gunakan '-' untuk spasi): ");
                    String newSupp = input.next();
                    System.out.print("Masukkan Tipe Barang: ");
                    String newtipebrg = input.next();
                    System.out.print("Masukkan Tanggal Produksi(DD-MM-YYYY): ");
                    String newprdDate = input.next();
                    System.out.print("Masukkan Tanggal Kadaluwarsa(DD-MM-YYYY): ");
                    String newexpDate = input.next();
                    System.out.print("Masukkan Harga: ");
                    int newHarga = input.nextInt();
                    System.out.print("Masukkan Stok: ");
                    int newStokBrgg = input.nextInt();
                    inputNewData(newNamabrg, newSupp, newtipebrg, newprdDate, newexpDate, newHarga, newStokBrgg);

                    break;
                case 2:// manjemen item
                    int menu2;
                    boolean stop2 = true;

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

                        switch (menu2) {
                            case 1:
                                updateItem(input);
                                break;
                            case 2:
                                deleteItem(input);
                                break;
                            case 3:
                                displayItems();
                                break;
                            case 0:
                                stop2 = false;
                                System.out.println("Anda kembali ke menu utama");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }

                    } while (stop2);
                    break;

                case 3:// Item Categorization

                    break;

                case 4:// Supplier Management

                    break;

                case 5:// Code Scanning
                    codeScanning(input);
                    break;

                case 6:// Expiry Date Tracking
                    int menu6;
                    boolean stop6 = true;

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
                                checkExpired(input);
                                break;
                            case 2:
                                displayExpired();
                                break;
                            case 0:
                                stop6 = false;
                                System.out.println("Anda kembali ke menu utama");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }
                    } while (stop6);
                    break;

                case 7:// Delivery

                    break;
            }
        } while (fitur != 0);

        input.close();
    }

}
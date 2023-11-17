import java.util.Scanner;

public class itemEntri {
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

        tipeBrg[0] = "Makanan";
        tipeBrg[1] = "Minuman";
        tipeBrg[2] = "Obat";
        tipeBrg[3] = "Rokok";
        tipeBrg[4] = "Makanan";
        tipeBrg[5] = "Minuman";
        tipeBrg[6] = "Obat";
        tipeBrg[7] = "Rokok";
        tipeBrg[8] = "Makanan";
        tipeBrg[9] = "Minuman";

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

        cabang[0] = "Malang";
        cabang[1] = "Blitar";
        cabang[2] = "Tuban";

        // int[][] stokCabang = {
        // {5, 10, 15, 8, 12, 7, 14, 6, 9, 11, 15, 5, 13, 8, 10}, // malang
        // {6, 15, 20, 9, 14, 8, 12, 7, 10, 13, 5, 11, 6, 15, 7}, // blitar
        // {7, 20, 25, 10, 13, 6, 15, 8, 12, 9, 14, 7, 11, 10, 13} // tuban
        // };
        int[][] stokCabang = new int[3][15];
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

        // blitar
        stokCabang[1][0] = 6;
        stokCabang[1][1] = 15;
        stokCabang[1][2] = 20;
        stokCabang[1][3] = 9;
        stokCabang[1][4] = 14;
        stokCabang[1][5] = 8;
        stokCabang[1][6] = 12;
        stokCabang[1][7] = 7;

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

        boolean stop = true;
        int fitur;// untuk switch case menu utama
        do {
            System.out.println("=============Selamat Datang=============");
            System.out.println("1.Item Entry and Storage");
            System.out.println("2.Update Item Information");
            System.out.println("3.Item Categorization");
            System.out.println("4.Supplier Management");
            System.out.println("5.Stock Checking");
            System.out.println("6.Code Scanning");
            System.out.println("7.Expiry Date Tracking ");
            System.out.println("8.Delivery");
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
                    System.out.print("Masukkan Nama Barang: ");
                    String newNamabrg = input.next();
                    System.out.print("Masukkan Nama Supplier: ");
                    String newSupp = input.next();
                    System.out.print("Masukkan Tipe Barang: ");
                    String newtipebrg = input.next();
                    System.out.print("Masukkan Tanggal Produksi: ");
                    String newprdDate = input.next();
                    System.out.print("Masukkan Tanggal Kadaluwarsa: ");
                    String newexpDate = input.next();
                    System.out.print("Masukkan Harga: ");
                    int newHarga = input.nextInt();
                    System.out.print("Masukkan Stok: ");
                    int newStokBrg = input.nextInt();

                    for (int i = 0; i < namaBrg.length; i++) {
                        if (namaBrg[i] == null) {
                            indexnamaBrg = i;
                            break;
                        } // mencari index yang kosong

                    }

                    // menambahkan barang baru ke array
                    namaBrg[indexnamaBrg] = newNamabrg;
                    tipeBrg[indexnamaBrg] = newtipebrg;
                    supplier[indexnamaBrg] = newSupp;
                    prdDate[indexnamaBrg] = newprdDate;
                    expDate[indexnamaBrg] = newexpDate;
                    harga[indexnamaBrg] = newHarga;
                    stokBrg[indexnamaBrg] = newStokBrg;

                    for (int j = 0; j < namaBrg.length; j++) {
                        if (namaBrg[j] != null) {
                            System.out.println((j + 1) + " | " + namaBrg[j] + " | " + namaBrg[j] + " | " + tipeBrg[j]
                                    + " | " + prdDate[j] + " | " + harga[j] + " | " + stokBrg[j]);
                        }
                    }

                    break;
                case 2:

                    // do {
                    // int i = 0;
                    // System.out.println("========================================");
                    // System.out.println("=========Item Entry and Storage=========");
                    // System.out.println("========================================");
                    // System.out.print("Masukkan Nama Supplier: ");
                    // String newSupplier = input.nextLine();
                    // // buat array baru
                    // int newSizeSupplier = supplier.length + 1;
                    // String[] tempSuplier = new String[newSizeSupplier];
                    // // copy
                    // for (int j = 0; j < supplier.length; j++) {
                    // tempSuplier[j] = supplier[j];
                    // }
                    // // tambah nama supplier
                    // tempSuplier[newSizeSupplier - 1] = newSupplier;
                    // // tuker array lama ke baru
                    // supplier[i] = tempSuplier[i];
                    // input.next();

                    // System.out.print("Masukkan Nama Barang: ");
                    // String newNama = input.nextLine();
                    // int newSizeBarang = namaBrg.length + 1;
                    // String[] tempnama = new String[newSizeBarang];
                    // for (int j = 0; j < namaBrg.length; j++) {
                    // tempnama[j] = namaBrg[j];
                    // }
                    // tempnama[newSizeBarang - 1] = newNama;
                    // namaBrg = tempnama;
                    // input.next();

                    // System.out.print("Masukkan Kategori Barang: ");
                    // String newTipe = input.nextLine();
                    // int newSizeTipe = tipeBrg.length + 1;
                    // String[] tempTipe = new String[newSizeTipe];
                    // for (int j = 0; j < tipeBrg.length; j++) {
                    // tempTipe[j] = tipeBrg[j];
                    // }
                    // tempTipe[newSizeTipe - 1] = newTipe;
                    // tipeBrg = tempTipe;
                    // input.next();

                    // System.out.print("Masukkan Tanggal Produksi Barang: ");
                    // prdDate[i] = input.next();
                    // input.nextLine();

                    // System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
                    // expDate[i] = input.next();
                    // input.nextLine();

                    // System.out.print("Masukkan Harga Barang: ");
                    // double newHarga = input.nextDouble();
                    // int newSizeHarga = harga.length + 1;
                    // double[] tempHarga = new double[newSizeHarga];
                    // for (int j = 0; j < harga.length; j++) {
                    // tempHarga[j] = harga[j];
                    // }
                    // tempHarga[newSizeHarga - 1] = newHarga;
                    // harga = tempHarga;

                    // System.out.print("Masukkan Jumlah Stok Barang: ");
                    // int newStok = input.nextInt();
                    // int newSizeStok = stokBrg.length + 1;
                    // int[] tempStok = new int[newSizeStok];
                    // for (int j = 0; j < stokBrg.length; j++) {
                    // tempStok[j] = stokBrg[j];
                    // }
                    // tempStok[newSizeStok - 1] = newStok;
                    // stokBrg = tempStok;

                    // // coba ditampilkan(nnt dihapus)
                    // for (int j = 0; j < namaBrg.length; j++) {
                    // System.out.println((j + 1) + " | " + namaBrg[j]); // +" | "+ namaBrg[j] +" |
                    // "+tipeBrg[j]+"
                    // // | "+prdDate[j]+" | "+harga[j]+" |
                    // // "+stokBrg[j] );
                    // }

                    // System.out.println("========================================");
                    // System.out.println("Barang telah berhasil ditambahkan");
                    // System.out.println("Masukkan data lagi?");
                    // System.out.println("1. Iya");
                    // System.out.println("0. Tidak");

                    // int pilihStop1 = input.nextInt();
                    // if (pilihStop1 == 0) {
                    // stop = false; // kembali ke main menu
                    // } else {
                    // stop = true; // lanjut
                    // }
                    // i++;
                    // } while (stop);

                    break;
                case 3:

                    break;

                default:
                    System.out.println("Masukkan Menu Nomor 3!");
                    break;
            }
        } while (fitur != 0);

    }
}

// String[] namaBrg = {"Mie Sedap Goreng", "Aqua 600ml", "Paracetamol", "Djarum
// Super", "Teh Pucuk Harum 600ml", "Coca-Cola 600ml", "OBH Combi 100ml",
// "Gudang Garam", "Roti Aoka", "Teh Kotak 300ml", "Aspirin", "Sampoerna",
// "Chitato", "Sprite Kaleng", "Minyak Kayu Putih 60ml"};
// String[] tipeBrg = {"Makanan", "Minuman", "Obat", "Rokok", "Makanan",
// "Minuman", "Obat", "Rokok", "Makanan", "Minuman", "Obat", "Rokok", "Makanan",
// "Minuman", "Obat"};
// String[] prdDate = {"22 September 2023", "23 September 2023", "21 Oktober
// 2023", "24 September 2023", "20 November 2023", "22 September 2023", "23
// September 2023", "21 Oktober 2023", "24 September 2023", "20 November 2023",
// "22 September 2023", "23 September 2023", "21 Oktober 2023", "24 September
// 2023", "20 November 2023"};
// String[] expDate = {"23 Desember 2024", "24 Desember 2025", "20 November
// 2024", "25 Desember 2023", "19 Desember 2024", "23 Desember 2024", "24
// Desember 2025", "20 November 2024", "25 Desember 2023", "19 Desember 2024",
// "23 Desember 2024", "24 Desember 2025", "20 November 2024", "25 Desember
// 2023", "19 Desember 2024"};
// String[] dateNow = new String[15];
// String[] supplier = {"Wings-Food", "Danone", "PT. Kimia Farma", "Sampoerna",
// "PT. Tirta Tresindo Jaya", "Coca-Cola", "Combiphar", "Gudang-Garam", "Aoka",
// "Ultrajaya", "Bayer", "Sampoerna", "Indofood", "Coca-Cola", "Cap Lang"};
// String[] konSupp = {"08214141414", "08515151521", "08123456789",
// "08765432100", "08214141414", "08515151521", "08123456789", "08765432100",
// "08214141414", "08515151521", "08123456789", "08765432100", "08214141414",
// "08515151521", "08123456789"};
// String[] alamatSupp = {"Jakarta", "Bandung", "Surabaya", "Semarang",
// "Jakarta", "Bandung", "Surabaya", "Semarang", "Jakarta", "Bandung",
// "Surabaya", "Semarang", "Jakarta", "Bandung", "Surabaya"};
// double[] harga = {20000, 48000, 19500, 93500, 62500, 108700, 550000, 530000,
// 113000, 94200, 125500, 232000, 243900, 121500, 238350};
// int[] stokBrg = {100, 150, 50, 80, 120, 200, 30, 60, 90, 75, 40, 100, 60,
// 180, 25};
// String [] cabang = {"Malang", "Blitar", "Tuban"};
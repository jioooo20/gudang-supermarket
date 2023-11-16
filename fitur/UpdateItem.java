package fitur;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UpdateItem {
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
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        int menu, fitur;
        boolean stop = true; 

        int menu2;
        int stop2 = 0;
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
                //daftar barang
                for (int i = 0; i < namaBrg.length; i++) {
                    System.out.printf("%s %d\t| %-25s\t|%n","|", (i + 1), namaBrg[i]);
                }
                System.out.println("=========================================");
                System.out.print("Masukkan Nomor Barang: ");
                int noBrgUpdate = input.nextInt();
                //cari index barang
                for (int i = 0; i < namaBrg.length; i++) {
                    if (noBrgUpdate >= 1 && noBrgUpdate <= namaBrg.length) {
                        index = noBrgUpdate-1;
                        break;
                    }
                }
                
                //daftar part update
                if (index != -1) {
                    System.out.println("============================");
                    System.out.println("Part yang ingin anda ubah:");
                    System.out.println("1. Nama Barang");
                    System.out.println("2. Kategori Barang");
                    System.out.println("3. Tanggal Produksi Barang");
                    System.out.println("4. Tanggal Kadaluarsa Barang");
                    System.out.println("5. Harga Barang");
                    System.out.println("6. Jumlah Stok Barang");
                    System.out.println("7. Supplier");
                    System.out.println("8. Kontak Supplier");
                    System.out.println("8. Alamat Supplier");
                    System.out.println("0. Selesai");
                    System.out.print("Pilih menu: ");
                    int pilihan = input.nextInt();
                    input.nextLine(); 

                    //update element data
                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan Nama Barang Baru: ");
                            namaBrg[index] = input.nextLine();
                            break;
                        case 2:
                            System.out.print("Masukkan Kategori Barang Baru: ");
                            tipeBrg[index] = input.nextLine();
                            break;
                        case 3:
                            System.out.print("Masukkan Tanggal Produksi Baru: ");
                            prdDate[index] = input.nextLine();
                            break;
                        case 4:
                            System.out.print("Masukkan Tanggal Kadaluarsa Baru: ");
                            expDate[index] = input.nextLine();
                            break;
                        case 5:
                            System.out.print("Masukkan Harga Barang Baru: ");
                            harga[index] = input.nextDouble();
                            break;
                        case 6:
                            System.out.print("Masukkan Jumlah Stok Barang Baru: ");
                            stokBrg[index] = input.nextInt();
                            break;
                        case 7:
                            System.out.print("Masukkan Supplier Barang Baru: ");
                            supplier[index] = input.nextLine();
                            break;
                        case 8:
                            System.out.print("Masukkan Kontak Supplier Barang Baru: ");
                            konSupp[index] = input.nextLine();
                            break;
                        case 9:
                            System.out.print("Masukkan Alamat Supplier Barang Baru: ");
                            alamatSupp[index] = input.nextLine();
                            break;
                        case 0:
                            System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    System.out.println("Barang " + namaBrg[index] + " berhasil diperbarui ");
                } else {
                    System.out.println("Barang tidak ditemukan");
                }
                break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("|\tHAPUS DATA \t|");
                    System.out.println("-------------------------");
                    //daftar barang
                    System.out.println("=========================================");
                    System.out.println("| NO\t| NAMA BARANG\t\t\t|");
                    System.out.println("=========================================");
                    
                    for (int i = 0; i < namaBrg.length; i++) {
                        System.out.printf("%s %d\t| %-25s\t|%n","|", (i + 1), namaBrg[i]);
                    }

                    System.out.println("=========================================");
                    System.out.print("Masukkan Nomor barang: ");
                    int noBrgHapus = input.nextInt();
                    int hapus = -1;
                    
                    //cari index barang
                    for (int i = 0; i < namaBrg.length; i++) {
                        if (noBrgHapus >= 1 && noBrgHapus <= namaBrg.length) {
                            hapus = noBrgHapus-1;
                            break;
                        }
                    }
                    
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

                        //mengubah ke nilai default
                        int setHapus = namaBrg.length - 1;
                        namaBrg[setHapus] = null;
                        tipeBrg[setHapus] = null;
                        prdDate[setHapus] = null;
                        expDate[setHapus] = null;
                        supplier[setHapus] = null;
                        konSupp[setHapus] = null;
                        alamatSupp[setHapus] = null;
                        harga[setHapus] = 0;
                        stokBrg[setHapus] = 0;

                        // Kurangi panjang array
                        int newHapus = namaBrg.length - 1;

                        String[] newNamaBrg = new String[newHapus];
                        String[] newTipeBrg = new String[newHapus];
                        String[] newPrdDate = new String[newHapus];
                        String[] newExpDate = new String[newHapus];
                        String[] newSupplier = new String[newHapus];
                        String[] newKonSupp = new String[newHapus];
                        String[] newAlamatSupp = new String[newHapus];
                        double[] newHarga = new double[newHapus];
                        int[] newStokBrg = new int[newHapus];

                        for (int i = 0; i < newHapus; i++) {
                            newNamaBrg[i] = namaBrg[i];
                            newTipeBrg[i] = tipeBrg[i];
                            newPrdDate[i] = prdDate[i];
                            newExpDate[i] = expDate[i];
                            newSupplier[i] = supplier[i];
                            newKonSupp[i] = konSupp[i];
                            newAlamatSupp[i] = alamatSupp[i];
                            newHarga[i] = harga[i];
                            newStokBrg[i] = stokBrg[i];
                        }

                        namaBrg = newNamaBrg;
                        tipeBrg = newTipeBrg;
                        prdDate = newPrdDate;
                        expDate = newExpDate;
                        supplier = newSupplier;
                        konSupp = newKonSupp;
                        alamatSupp = newAlamatSupp;
                        harga = newHarga;
                        stokBrg = newStokBrg;

                        
                        System.out.println("Data barang " + namaBrg[hapus] + " telah berhasil dihapus");
                    } else {
                        System.out.println("Barang tidak ditemukan");
                    }
                break;
                case 3:
                    System.out.println("================================================================================================================================================");
                    System.out.println("|\t\t\t\t\t\t\t\t| DAFTAR STOK BARANG |\t\t\t\t\t\t\t\t|");
                    System.out.println("================================================================================================================================================");
                    System.out.println("| NO\t| NAMA BARANG\t\t\t| KATEGORI\t| TGL PRODUKSI\t| TGL KADALUWARSA\t| SUPPLIER\t\t| HARGA\t\t| STOK |");
                    System.out.println("================================================================================================================================================");
                    
                    // Sorting dari jumlah stok barang paling sedikit ke yang paling banyak
                    for (int i = 0; i < stokBrg.length - 1; i++) {
                        for (int j = 0; j < stokBrg.length - i - 1; j++) {
                            if (stokBrg[j] > stokBrg[j+1]) {
                                // untuk ubah urutan nama
                                String tempNama = namaBrg[j];
                                namaBrg[j] = namaBrg[j + 1];
                                namaBrg[j + 1] = tempNama;

                                // untuk ubah urutan kategori
                                String tempTipe = tipeBrg[j];
                                tipeBrg[j] = tipeBrg[j + 1];
                                tipeBrg[j + 1] = tempTipe;

                                // untuk ubah urutan Tgl Produksi
                                String tempPrdDate = prdDate[j];
                                prdDate[j] = prdDate[j + 1];
                                prdDate[j + 1] = tempPrdDate;

                                // untuk ubah urutan Tgl kadaluwarsa
                                String tempExpDate = expDate[j];
                                expDate[j] = expDate[j + 1];
                                expDate[j + 1] = tempExpDate;

                                // untuk ubah urutan Supplier
                                String tempSupplier = supplier[j];
                                supplier[j] = supplier[j + 1];
                                supplier[j + 1] = tempSupplier;

                                // untuk ubah urutan Kontak Supplier
                                String tempKonSupp = konSupp[j];
                                konSupp[j] = konSupp[j + 1];
                                konSupp[j + 1] = tempKonSupp;

                                // untuk ubah urutan Alamat Supplier
                                String tempAlamatSupp = alamatSupp[j];
                                alamatSupp[j] = alamatSupp[j + 1];
                                alamatSupp[j + 1] = tempAlamatSupp;

                                //untuk ubah urutan stok
                                double tempHarga = harga [j];
                                harga[j] = harga[j + 1];
                                harga[j + 1] = tempHarga;

                                //untuk ubah urutan stok
                                int tempStok = stokBrg[j];
                                stokBrg[j] = stokBrg[j + 1];
                                stokBrg[j + 1] = tempStok;

                            }
                        } 
                    }
                    
                    //menampilkan data barang
                    int indexTampil = 1;
                    for (int i = 0; i < namaBrg.length; i++) {
                        if (namaBrg[i] == null || tipeBrg[i] == null || prdDate[i] == null || expDate[i] == null || supplier[i] == null || konSupp[i] == null || alamatSupp[i] == null || harga[i] == 0 || stokBrg[i] == 0) {
                            
                            continue;
                        } else{
                            System.out.printf("%s %d\t| %-25s\t| %-10s\t| %-10s\t| %-15s\t| %-15s\t| %-10s\t| %-5s|%n", "|", indexTampil++, namaBrg[i], tipeBrg[i], prdDate[i], expDate[i], supplier[i], harga[i], stokBrg[i]);
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
        } while (menu2 != stop2);
    }
}
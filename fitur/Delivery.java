package fitur;

import java.util.Scanner;
public class Delivery {
    public static void main(String[] args) {
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
        int menu, fitur;
        boolean stop = true;

        int fitur8;
        do{       
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
                    int indeks=0;            
                    int jumKirBarang; 
                do{                     
                    System.out.println("=====Pilih Cabang Yang Akan Dikirim=====");                                                       
                    System.out.println("1.Malang");
                    System.out.println("2.Blitar");
                    System.out.println("3.Tuban");
                    System.out.println("0.Kembali");
                    System.out.print("Masukkan Nomor Cabang: ");
                    int kirim_cabang = input.nextInt();
                    stop81 = kirim_cabang;// angka pada stop81 mengikuti input dari menu pilih cabang
                    switch(kirim_cabang){
                        case 1: 
                        System.out.println("==============================================================================================================");
                        System.out.println("=============================================Kirim Cabang Malang==============================================");
                        System.out.println("==============================================================================================================");
                        System.out.println("=================================================Stok Gudang==================================================");
                        System.out.println("==============================================================================================================");
                        System.out.printf("%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No", "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa", "Harga", "Stok");
                        for (int i=0;i<namaBrg.length; i++){
                            System.out.printf("%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n", (i+1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i], expDate[i], harga[i], stokBrg[i]);
                        }   //menampilkan informasi barang dalam gudang
                        
                        System.out.print("Masukkan Nomor Urut Barang: ");
                        int cariNomorBarangMalang = input.nextInt();

                        if (cariNomorBarangMalang >= 1 && cariNomorBarangMalang <= namaBrg.length) {
                            indeks = cariNomorBarangMalang - 1;
                            System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                        } else {
                            System.out.println("Indeks tidak valid.");
                        }//mencari posisi index barang

                        System.out.print("Masukkan Jumlah Barang: ");
                        jumKirBarang = input.nextInt();
                        stokBrg[indeks] -= jumKirBarang;  //mengurangi stok gudang
                        stokCabang[0][indeks] += jumKirBarang; //menambah stok di cabang


                        break;
                        case 2: 
                        System.out.println("==============================================================================================================");
                        System.out.println("===============================================Kirim Cabang Blitar============================================");
                        System.out.println("==============================================================================================================");
                        System.out.println("===================================================Stok Gudang================================================");
                        System.out.println("==============================================================================================================");
                        System.out.printf("%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No", "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa", "Harga", "Stok");
                        for (int i=0;i<namaBrg.length; i++){
                            System.out.printf("%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n", (i+1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i], expDate[i], harga[i], stokBrg[i]);
                        }   //menampilkan informasi barang dalam gudang
                        
                        System.out.print("Masukkan Nomor Urut Barang: ");
                        int cariNomorBarangBlitar = input.nextInt();

                        if (cariNomorBarangBlitar >= 1 && cariNomorBarangBlitar <= namaBrg.length) {
                            indeks = cariNomorBarangBlitar - 1;
                            System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                        } else {
                            System.out.println("Indeks tidak valid.");
                        }//mencari posisi index barang

                        System.out.print("Masukkan Jumlah Barang: ");
                        jumKirBarang = input.nextInt();
                        stokBrg[indeks] -= jumKirBarang;  //mengurangi stok gudang
                        stokCabang[1][indeks] += jumKirBarang; //menambah stok di cabang                            

                        break;
                        case 3: 
                        System.out.println("==============================================================================================================");
                        System.out.println("==============================================Kirim Cabang Tuban==============================================");
                        System.out.println("==============================================================================================================");
                        System.out.println("==================================================Stok Gudang=================================================");
                        System.out.println("==============================================================================================================");
                        System.out.printf("%-3s| %-25s| %-18s| %-10s| %-12s| %-12s| %-10s| %-4s | \n", "No", "Barang", "Supplier", "Kategori", "Produksi", "Kedaluwarsa", "Harga", "Stok");
                        for (int i=0;i<namaBrg.length; i++){
                            System.out.printf("%-3d| %-25s| %-18s| %-10s| %-12s| %-12s| %-10.1f| %-4d | \n", (i+1), namaBrg[i], supplier[i], tipeBrg[i], prdDate[i], expDate[i], harga[i], stokBrg[i]);
                        }   //menampilkan informasi barang dalam gudang
                        
                        System.out.print("Masukkan Nomor Urut Barang: ");
                        int cariNomorBarangTuban = input.nextInt();

                        if (cariNomorBarangTuban >= 1 && cariNomorBarangTuban <= namaBrg.length) {
                            indeks = cariNomorBarangTuban - 1;
                            System.out.println("Barang yang akan dikirim adalah " + namaBrg[indeks]);
                        } else {
                            System.out.println("Indeks tidak valid.");
                        }//mencari posisi index barang

                        System.out.print("Masukkan Jumlah Barang: ");
                        jumKirBarang = input.nextInt();
                        stokBrg[indeks] -= jumKirBarang;  //mengurangi stok gudang
                        stokCabang[2][indeks] += jumKirBarang; //menambah stok di cabang                              

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
                System.out.printf("%-23s |","Nama Barang");
                for (int i=0; i<cabang.length;i++){
                    System.out.printf( "%-6s|", cabang[i]);
                }
                System.out.println();
                System.out.println("==============================================");

                for(int i=0;i<namaBrg.length;i++){
                    System.out.printf("%-24s", namaBrg[i]);
                    for(int j=0; j<stokCabang.length;j++){
                        System.out.printf("|  %-4d", stokCabang[j][i]);
                    }
                    System.out.println("|");
                }
                break; //break case 2
        }

        }while (fitur8 != 0);
    }
}
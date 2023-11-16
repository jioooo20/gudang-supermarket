package fitur;

import java.util.Scanner;
public class ItemEntry {
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

        do{
            int i=0;
            System.out.println("========================================");
            System.out.println("=========Item Entry and Storage=========");
            System.out.println("========================================");
            System.out.print("Masukkan Nama Supplier: ");
            String newSupplier = input.nextLine();            
            //buat array baru
            int newSizeSupplier = supplier.length + 1;
            String[] tempSuplier = new String[newSizeSupplier];
            //copy 
            for(int j=0; j<supplier.length; j++){
                tempSuplier[j] = supplier[j];
            }
            //tambah nama supplier
            tempSuplier[newSizeSupplier - 1] = newSupplier;
            //tuker array lama ke baru
            supplier[i] = tempSuplier[i];
            input.next();

            System.out.print("Masukkan Nama Barang: ");
            String newNama = input.nextLine();
            int newSizeBarang = namaBrg.length + 1;
            String[] tempnama = new String[newSizeBarang];
            for(int j=0; j<namaBrg.length; j++){
                tempnama[j]=namaBrg[j];
            }
            tempnama[newSizeBarang - 1] = newNama;
            namaBrg = tempnama;
            input.next();

            System.out.print("Masukkan Kategori Barang: ");
            String newTipe = input.nextLine();
            int newSizeTipe = tipeBrg.length + 1;
            String[] tempTipe = new String[newSizeTipe];
            for(int j=0; j<tipeBrg.length; j++){
                tempTipe[j]=tipeBrg[j];
            }
            tempTipe[newSizeTipe - 1] = newTipe;
            tipeBrg = tempTipe;
            input.next();

            System.out.print("Masukkan Tanggal Produksi Barang (dd-MM-yyyy): ");
            prdDate[i] = input.next();
            input.nextLine();

            System.out.print("Masukkan Tanggal Kadaluarsa Barang (dd-MM-yyyy): ");
            expDate[i] = input.next();
            input.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double newHarga = input.nextDouble();
            int newSizeHarga = harga.length + 1;
            double[] tempHarga = new double[newSizeHarga];
            for(int j=0; j<harga.length;j++){
                tempHarga[j] = harga[j];
            }
            tempHarga[newSizeHarga - 1] = newHarga;
            harga = tempHarga;
            
            System.out.print("Masukkan Jumlah Stok Barang: ");
            int newStok = input.nextInt();
            int newSizeStok = stokBrg.length + 1;
            int[] tempStok = new int[newSizeStok];
            for(int j=0;j<stokBrg.length;j++){
                tempStok[j] = stokBrg[j];
            }
            tempStok[newSizeStok - 1] = newStok;
            stokBrg = tempStok;
            
            //coba ditampilkan(nnt dihapus)
            for(int j=0;j<namaBrg.length; j++){
                System.out.println((j+1) +" | "+ supplier[j]); //+" | "+ namaBrg[j] +" | "+tipeBrg[j]+" | "+prdDate[j]+" | "+harga[j]+" | "+stokBrg[j] );
            }

            System.out.println("========================================");
            System.out.println("Barang telah berhasil ditambahkan");
            System.out.println("Masukkan data lagi?");
            System.out.println("1. Iya");
            System.out.println("0. Tidak");

            int pilihStop1 = input.nextInt();
            if( pilihStop1 == 0){
                stop = false; //kembali ke main menu
            }else{
                stop = true; // lanjut 
            }
            i++;
            }while (stop);         
                
    }
}
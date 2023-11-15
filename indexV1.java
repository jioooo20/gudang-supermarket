import java.util.Scanner;
public class indexV1 {
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
        
        //System.out.println("========================================"); GUNAKAN INI UNTUK MEMBERI GARIS!!!
        
        do{
        System.out.println("=============Selamat Datang=============");
        System.out.println("1.Item Entry and Storage"); 
        System.out.println("2.Update Item Information"); 
        System.out.println("3.Item Categorization");
        System.out.println("4.Supplier Management");
        System.out.println("5.Stock Checking");
        System.out.println("6.Item Scanning");
        System.out.println("7.Expiry Date Tracking ");
        System.out.println("8.Delivery");
        System.out.println("0.Keluar");
        System.out.print("Masukkan Nomor Menu: ");        
        fitur = input.nextInt();
            if (fitur == 0 ) {
                break;
            }
 
        switch (fitur) {
            case 1:
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
                
            break;
            case 2:
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
                    break;
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
            // loop nya ada yang ilang, lagi nyoba array. udah ketemu cara nambahin sesuai urutan, cuma lek ada lebih dr 1 produk carra ngatur supplier ini gimanaaa saya bingung
            int menu4;
            do{
                System.out.println("===========Supplier Management==========");
                System.out.println("1.Masukkan Supplier Baru");
                System.out.println("2.Lihat Informasi Supplier");
                System.out.println("0.Kembali");
                System.out.print("Masukkan Nomor: ");
                menu4 = input.nextInt();
                if (menu4 == 0 ) {
                    break;
                }
                switch(menu4){
                    case 1 :
                    int stop4 = 0;
                    do{
                    // String cariSupplier;
                    int hasil=0;                        
                        // if(stop4 != 0 && stop4 != 1){
                        //     System.out.println("=========================");
                        //     System.out.println("Masukkan Data Supplier Lagi?");
                        //     System.out.println("1. Iya");
                        //     System.out.println("0. Tidak");
                        //     System.out.print("Pilih angka 1 atau 0: ");                                                      
                        //     stop4 = input.nextInt();         
                        //     continue;         
                        // }
                    System.out.println("=========Masukkan Supplier Baru=========");
                    System.out.print("Masukkan Supplier: ");
                    String cariSupplier = input.next();
                    for(int i=0; i<supplier.length; i++){
                        if(supplier[i].equalsIgnoreCase(cariSupplier)){
                            hasil=i;
                            break;
                        }
                    }
                    System.out.print("Masukkan Kontak Supplier: ");
                    konSupp[hasil] = input.next();
                    System.out.print("Masukkan Alamat Supplier: ");
                    alamatSupp[hasil] = input.next();
                    // System.out.println("=============================");
                    // System.out.println("Masukkan Data Supplier Lagi?");
                    // System.out.println("1. Iya");
                    // System.out.println("0. Tidak");
                    // System.out.print("Masukkan Nomer: ");
                    // stop4 = input.nextInt();
                    // if(stop4 != 0 && stop4 != 1 && stop4 >= 2){
                    //     System.out.println("============================");
                    //     System.out.println("Masukkan angka 0 atau 1");
                    //     continue;
                    // }
                    } while (stop4 != 0);

                    break;
                    case 2:
                    System.out.println("========================================");
                    System.out.println("==============List Supplier=============");
                    System.out.println("========================================");
                    System.out.println("No |"+" Supplier \t| Kontak \t| Alamat  ");
                    for(int i=0; i<supplier.length;i++){
                        System.out.println((i+1)+"  | "+ supplier[i]+" \t| "+konSupp[i]+" \t| "+alamatSupp[i]);
                    }
                    System.out.println("========================================");                    
                        break;
                }

            }while (menu4 != 0);
                break;
                
            case 5:
                int menu5;
                int stop5 = 0;
                do {
                System.out.println("=======================Stock Checking========================");
                System.out.println("1. Cek Semua Stok Barang");
                System.out.println("2. Cek Stok Berdasarkan Nama Barang");
                System.out.println("0. Kembali");
                System.out.print("Pilih Nomor : ");
                menu5 = input.nextInt();

            switch (menu5) {
                case 1:
                System.out.println("=============================================================");
                System.out.println("======================Stok Semua Barang======================");
                System.out.println("=============================================================");
                System.out.printf("%-3s| %-25s| %-18s| %-8s| \n", "No", "Nama Barang", "Kategori", "Stok");
                            for (int i=0;i<namaBrg.length; i++){
                                System.out.printf("%-3d| %-25s| %-18s| %-8s| \n", (i+1), namaBrg[i], tipeBrg[i], stokBrg[i]);
                            }
                            
                    break;

                // case 2:
                //     System.out.print("Masukkan Nama Barang : ");
                //     String newNama = input.nextLine();
                //     input.nextLine();
                //     break;

                case 0:
                    break;

                default:
                    System.out.println("Nomor menu yang anda masukkan salah");
                    break;
            }
            } while (menu5 != stop5);
                break;

            // case 6:
            
            //     System.out.println("=====Item Scanning=====");
            //     System.out.print("Masukkan Nama Barang Yang Ingin Anda Scan: ");
            //     namaBrg = input.next();
            //     input.nextLine();

            //     System.out.println("=====Data Barang yang Dicari=====");
            //     System.out.println("Nama Barang               : \n" );
            //     System.out.println("Kategori Barang           : \n" );
            //     System.out.println("Nama Supplier             : \n" );
            //     System.out.println("Tanggal Produksi Barang   : \n" );
            //     System.out.println("Tanggal Kadaluarsa Barang : \n" );
            //     System.out.println("Harga Barang              : \n" );
            //     System.out.println("Jumlah Stok Barang        : \n" );

            //     break;

            // case 7:
            //     int menu7;
            //     int stop7 = 0;
            //     do {
            //     System.out.println("=====Expiry Date Tracking=====");
            //     System.out.println("Silahkan pilih menu anda (1/0):");
            //     System.out.println("1. Cek tanggal kadaluarsa");
            //     System.out.println("2. Tampilkan daftar kadaluarsa");
            //     System.out.println("0. Kembali");
            //     System.out.print("Pilih menu: ");
            //     menu7 = input.nextInt();
            //     switch (menu7) {
            //         case 1:
            //         System.out.print("Masukkan nama barang: ");
            //         namaBrg = input.next();
            //         input.nextLine();
            //         System.out.print("Masukkan tanggal yang ingin Anda cek (format: dd-MM-yyyy): ");
            //         prdDate = input.nextLine();
            //         System.out.print("Masukkan tanggal sekarang (format: dd-MM-yyyy): ");
            //         dateNow = input.nextLine();

            //         if (prdDate == dateNow) {
            //             System.out.println("Tanggal sudah lewat!");
            //         } else {
            //             System.out.println("Tanggal belum lewat.");
            //         }
            //         break;
            //         case 2:
            //         System.out.println("Nama Barang:");
            //         case 0:
            //         break;
            //     }
            // } while (menu7 != stop7);
            // break;
           
            case 8:
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
            break;//break menu8   
            
            case 0:
            System.out.println("!!Anda keluar dari menu!!");
            System.exit(0);
            break;              
        }
        } while (fitur != 0);

    }
    }

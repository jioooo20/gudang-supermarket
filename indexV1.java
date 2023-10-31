import java.util.Scanner;

public class indexV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBrg = {"Mie Sedap Goreng", "Teh Rio"};
        String[] tipeBrg = {"Makanan", "Minuman"};
        String[] prdDate = {"22 September 2023", "23 September 2023"};
        String[] expDate = {"23 desember 2024", "24 desember 2025"};
        String[] dateNow = new String[5];
        String[] supplier = {"Wings", "Wings"};
        String[] konSupp = {"08214141414", "08515151521"};
        String[] alamatSupp = {"Jawa", "Malang"};
        double[] harga = {110000, 22500};
        int[] stokBrg = {10, 20};
        int menu, fitur;
        boolean stop = true;        
        
        do{
        System.out.println("===============Selamat Datang===============");
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
            if (fitur == 0 ) {
                break;
            }
 
        switch (fitur) {
            case 1:
            do{
            int i=0;
            System.out.println("=====Item Entry and Storage=====");
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
            supplier = tempSuplier;
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

            System.out.print("Masukkan Tanggal Produksi Barang: ");
            prdDate[i] = input.next();
            input.nextLine();

            System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
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
                System.out.println((j+1) +" | "+ supplier[j] +" | "+ namaBrg[j] +" | "+tipeBrg[j]+" | "+prdDate[j]+" | "+harga[j]+" | "+stokBrg[j] );
            }

            System.out.println("===========================================================================");
            System.out.println("Barang telah berhasil ditambahkan");
            System.out.println("Masukkan data lagi?");
            System.out.println("1. Iya");
            System.out.println("0. Kembali");

            int pilihStop1 = input.nextInt();
            if( pilihStop1 == 0){
                stop = false; //kembali ke main menu
            }else{
                stop = true; // lanjut 
            }
            i++;
            }while (stop);         
            
                break;
            // case 2:
            // int menu2;
            // int stop2 = 0;
            // do {
            //     System.out.println("======Update Item Information======");
            //     System.out.println("Silahkan Pilih");
            //     System.out.println("1. Update");
            //     System.out.println("2. Hapus");
            //     System.out.println("0. Kembali");
            //     System.out.print("Masukkan Nomor: ");
            //     menu2 = input.nextInt();

            //     switch (menu2) {
            //         case 1:
            //             System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
            //             namaBrg = input.nextLine();
            //             input.nextLine();
            //             //lakukan cek validasi

            //             System.out.println("============================");
            //             System.out.println("Part yang ingin anda ubah:");
            //             System.out.println("1. Nama Barang");
            //             System.out.println("2. Kategori Barang");
            //             System.out.println("3. Tanggal Produksi Barang");
            //             System.out.println("4. Tanggal Kadaluarsa Barang");
            //             System.out.println("5. Harga Barang");
            //             System.out.println("6. Jumlah Stok Barang");
            //             System.out.println("0. Selesai");
            //             System.out.print("Pilih menu: ");
            //             int pilihan = input.nextInt();
            //             input.nextLine(); // Membuang karakter newline

            //             switch (pilihan) {
            //                 case 1:
            //                     System.out.print("Masukkan Nama Barang Baru: ");
            //                     namaBrg = input.nextLine();
            //                     break;
            //                 case 2:
            //                     System.out.print("Masukkan Kategori Barang Baru: ");
            //                     tipeBrg = input.nextLine();
            //                     break;
            //                 case 3:
            //                     System.out.print("Masukkan Tanggal Produksi Baru: ");
            //                     prdDate = input.nextLine();
            //                     break;
            //                 case 4:
            //                     System.out.print("Masukkan Tanggal Kadaluarsa Baru: ");
            //                     expDate = input.nextLine();
            //                     break;
            //                 case 5:
            //                     System.out.print("Masukkan Harga Barang Baru: ");
            //                     harga = input.nextDouble();
            //                     break;
            //                 case 6:
            //                     System.out.print("Masukkan Jumlah Stok Barang Baru: ");
            //                     stokBrg = input.nextInt();
            //                     break;
            //                 case 0:
            //                     System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
            //                     break;
            //                 default:
            //                     System.out.println("Pilihan tidak valid.");
            //             }
            //             System.out.println("Barang " + namaBrg + " berhasil diperbarui ");
            //             break;
            //         case 2:
            //             System.out.print("Masukkan Nama Barang yang ingin dihapus: ");
            //             namaBrg  = input.nextLine();
            //             input.nextLine();
            //             System.out.println("Data barang telah berhasil dihapus");
            //             // if (namaBrgHapus == namaBrg) {
            //             //     System.out.println("Data barang " + namaBrg + " telah berhasil dihapus");
            //             // } else {
            //             //     System.out.println("Nama barang tidak ditemukan");
            //             // }
            //             break;
            //         case 0:
            //             break;
            //         default:
            //             System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1, 2, atau 3");
            //             break;
            // }
            // } while (menu2 != stop2);
            // break;

            // case 3:
            //     System.out.println("=====Item Categorization=====");

            //     break;
            case 4:
            // loop nya ada yang ilang, lagi nyoba array. udah ketemu cara nambahin sesuai urutan, cuma lek ada lebih dr 1 produk carra ngatur supplier ini gimanaaa saya bingung
            int menu4;
            do{
                System.out.println("=====Supplier Management=====");
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
                    System.out.println("===Masukkan Supplier Baru===");
                    System.out.print("Masukkan Supplier: ");
                    String cariSupplier = input.next();
                    for(int i=0; i<supplier.length; i++){
                        if(supplier[i] == cariSupplier){
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
                    System.out.println("===================List Supplier==================");
                    System.out.println("==================================================");
                    System.out.println("No |"+" Supplier \t| Kontak \t| Alamat  ");
                    for(int i=0; i<supplier.length;i++){
                        System.out.println((i+1)+"  | "+ supplier[i]+" \t| "+konSupp[i]+" \t| "+alamatSupp[i]);
                    }
                    System.out.println("==================================================");                    
                        break;
                }

            }while (menu4 != 0);
                break;
            // case 5:
            //     int menu5;
            //     int stop5 = 0;
            //     do {
            //     System.out.println("=====Stock Checking=====");
            //     System.out.println("1. Cek Semua Stok Barang");
            //     System.out.println("2. Cek Stok Berdasarkan Nama Barang");
            //     System.out.println("0. Kembali");
            //     System.out.print("Pilih Nomor : ");
            //     menu5 = input.nextInt();

            // switch (menu5) {
            //     case 1:
            //         System.out.println("Stok Barang :");
            //         System.out.println("Nama Barang           : " + namaBrg );
            //         System.out.println("Kategori Barang       : " + tipeBrg );
            //         System.out.println("Harga Barang          : " + harga );
            //         break;
            //     case 2:
            //         System.out.println("Masukkan Nama Barang Yang Ingin Anda Cek :");
            //         namaBrg = input.next();
            //         input.nextLine();
            //         System.out.println("Nama Barang           : " );
            //         System.out.println("Kategori Barang       : " );
            //         System.out.println("Jumlah Stok Barang    : " );
            //         break;
            //     case 0:
            //         break;
            //     default:
            //         System.out.println("Nomor menu yang anda masukkan salah");
            //         break;
            // }
            // } while (menu5 != stop5);
            //     break;
            // case 6:
            
            //     System.out.println("=====Item Scanning=====");
            //     System.out.print("Masukkan nama Barang Yang Ingin Anda Scan: ");
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
            // case 0:
            //     System.out.println("!!Anda keluar dari menu!!");
            //     System.exit(0);
            //     break;

            case 8:
            int fitur8;
            do{
            System.out.println("=====Delivery=====");
            System.out.println("1.Malang");
            System.out.println("2.Blitar");
            System.out.println("3.Tuban");
            System.out.println("0.Keluar");
            System.out.print("Masukkan Nomor Cabang: ");
            fitur8 = input.nextInt();

            if(fitur8 == 0){
                break;
            }
            switch (fitur8) {
                case 1:
                    System.out.println("===Cabang Malang===");
                    System.out.println("Masukkan ");
                    break;
            
                default:
                    break;
            }

            }while (fitur != 0);
                break;//break menu8       
        }
        } while (fitur != 0);
    
    }
}

// INI NOTE!!!

//  case 1:
//             do{
//             int i=0;
//             System.out.println("=====Item Entry and Storage=====");
//             System.out.print("Masukkan Nama Supplier: ");
//             supplier[i] = input.nextLine();
//             input.nextLine();
//             System.out.print("Masukkan Nama Barang: ");
//             namaBrg[i] = input.nextLine();
//             System.out.print("Masukkan Kategori Barang: ");
//             tipeBrg[i] = input.nextLine();
//             System.out.print("Masukkan Tanggal Produksi Barang: ");
//             prdDate[i] = input.next();
//             input.nextLine();
//             System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
//             expDate[i] = input.next();
//             input.nextLine();
//             System.out.print("Masukkan Harga Barang: ");
//             harga[i] = input.nextDouble();
//             input.nextLine();
//             System.out.print("Masukkan Jumlah Stok Barang: ");
//             stokBrg[i] = input.nextInt();
//             input.nextLine();
//             System.out.println("===========================================================================");
//             System.out.println("Barang telah berhasil ditambahkan");
//             System.out.println("Masukkan data lagi?");
//             System.out.println("1. Iya");
//             System.out.println("0. Kembali");
//             int pilihStop1 = input.nextInt();
//             if( pilihStop1 == 0){
//                 stop = false; //kembali ke main menu
//             }else{
//                 stop = true; // lanjut 
//             }
//             i++;
//             }while (stop);                     
//                 break;
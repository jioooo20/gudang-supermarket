import java.util.Scanner;

public class indexV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBrg = "Mie", tipeBrg = "Makanan", prdDate = "", expDate = "", dateNow = "", supplier = "", konSupp= "", alamatSupp = "" ;
        double harga = 3000;
        int stokBrg = 0, menu, fitur;
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
        System.out.println("0.Keluar dari Menu");
        System.out.print("Masukkan Nomor Menu: ");
        fitur = input.nextInt();
            if (fitur == 0 ) {
                break;
            }

        switch (fitur) {
            case 1:
            do{
            System.out.println("=====Item Entry and Storage=====");
            System.out.print("Masukkan Nama Supplier: ");
            supplier = input.next();
            input.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            namaBrg = input.next();
            input.nextLine();
            System.out.print("Masukkan Kategori Barang: ");
            tipeBrg = input.next();
            input.nextLine();
            System.out.print("Masukkan Tanggal Produksi Barang: ");
            prdDate = input.next();
            input.nextLine();
            System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
            expDate = input.next();
            input.nextLine();
            System.out.print("Masukkan Harga Barang: ");
            harga = input.nextDouble();
            input.nextLine();
            System.out.print("Masukkan Jumlah Stok Barang: ");
            stokBrg = input.nextInt();
            input.nextLine();
            System.out.println("===========================================================================");
            System.out.println("Barang " + namaBrg + " dari supplier " + supplier
                    + " telah berhasil ditambahkan");
            System.out.println("Masukkan data lagi?");
            System.out.println("1.Iya");
            System.out.println("0.Kembali ke menu");

            int pilihStop1 = input.nextInt();
            if( pilihStop1 == 0){
                stop = false; //kembali ke main menu
            }else{
                stop = true; // lanjut
            }
            }while (stop);
            
                break;
            case 2:
            int menu2;
            int stop2 = 0;
            do {
                System.out.println("======Update Item Information======");
                System.out.println("Silahkan Pilih");
                System.out.println("1. Update");
                System.out.println("2. Hapus");
                System.out.println("0. Keluar");
                System.out.print("Masukkan Nomor: ");
                menu2 = input.nextInt();

                switch (menu2) {
                    case 1:
                        System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
                        namaBrg = input.nextLine();
                        input.nextLine();
                        //lakukan cek validasi

                        System.out.println("============================");
                        System.out.println("Part yang ingin anda ubah:");
                        System.out.println("1. Nama Barang");
                        System.out.println("2. Kategori Barang");
                        System.out.println("3. Tanggal Produksi Barang");
                        System.out.println("4. Tanggal Kadaluarsa Barang");
                        System.out.println("5. Harga Barang");
                        System.out.println("6. Jumlah Stok Barang");
                        System.out.println("0. Selesai");
                        System.out.print("Pilih menu: ");
                        int pilihan = input.nextInt();
                        input.nextLine(); // Membuang karakter newline

                        switch (pilihan) {
                            case 1:
                                System.out.print("Masukkan Nama Barang Baru: ");
                                namaBrg = input.nextLine();
                                break;
                            case 2:
                                System.out.print("Masukkan Kategori Barang Baru: ");
                                tipeBrg = input.nextLine();
                                break;
                            case 3:
                                System.out.print("Masukkan Tanggal Produksi Baru: ");
                                prdDate = input.nextLine();
                                break;
                            case 4:
                                System.out.print("Masukkan Tanggal Kadaluarsa Baru: ");
                                expDate = input.nextLine();
                                break;
                            case 5:
                                System.out.print("Masukkan Harga Barang Baru: ");
                                harga = input.nextDouble();
                                break;
                            case 6:
                                System.out.print("Masukkan Jumlah Stok Barang Baru: ");
                                stokBrg = input.nextInt();
                                break;
                            case 0:
                                System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        System.out.println("Barang " + namaBrg + " berhasil diperbarui ");
                        break;
                    case 2:
                        System.out.println("Masukkan Nama Barang yang ingin dihapus: ");
                        namaBrg = input.nextLine();
                        //lakukan cek validasi

                        System.out.println("Data barang " + namaBrg + " telah berhasil dihapus");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1, 2, atau 3");
                        break;
            }
            } while (menu2 != stop2);
            break;

            case 3:
                System.out.println("=====Item Categorization=====");

                break;
            case 4:
            
            do{
                System.out.println("=====Supplier Management=====");
                System.out.println("1.Masukkan Supplier Baru");
                System.out.println("2.Lihat Informasi Supplier");
                System.out.println("0.Kembali");
                System.out.print("Masukkan Nomor: ");
                int pilihan4 = input.nextInt();
                if (pilihan4 == 0 ) {
                    break;
                }
                switch(pilihan4){
                    case 1 :
                    do{
                    System.out.println("===Masukkan Supplier Baru===");
                    System.out.print("Masukkan Supplier: ");
                    supplier = input.next();
                    System.out.print("Masukkan Kontak Supplier: ");
                    konSupp = input.next();
                    System.out.print("Masukkan Alamat Supplier: ");
                    alamatSupp = input.next();
                    System.out.println("=============================");
                    System.out.println("Masukkan Data Supplier Lagi?");
                    System.out.println("1. Iya");
                    System.out.println("0. Tidak");
                    System.out.print("Masukkan Nomer: ");
                    int pilihStop4 = input.nextInt();
                    if( pilihStop4 == 0){
                        stop = false; //kembali ke main menu
                    }else{
                        stop = true; // lanjut
                    }
                    }while (stop);
                        break;
                    case 2:
                    System.out.println("===List Supplier===");
                    System.out.println("1|"+" suplier | kontak | alamat | ");
                        break;
                    case 0:
                        
                        break;
                }

            }while (stop);
                // System.out.println("=====Supplier Management=====");
                // System.out.println("Masukkan supplier: ");
                // supplier = input.next();
                // input.nextLine();
                // System.out.println("Masukkan Kontak: ");
                // String konSUp = input.next();
                // System.out.println("Masukkan Alamat: ");
                // String alamSup = input.next();

                // System.out.println("==============================");
                // System.out.println("Supplier: " + supplier);
                // System.out.println("Kontak: " + konSUp);
                // System.out.println("Alamat: " + alamSup);

                break;
            case 5:
                int menu5;
                int stop5 = 0;
                do {
                System.out.println("=====Stock Checking=====");
                System.out.println("1. Cek Semua Stok Barang");
                System.out.println("2. Cek Stok Berdasarkan Nama Barang");
                System.out.println("0. Keluar");
                System.out.print("Pilih Nomor : ");
                menu5 = input.nextInt();

            switch (menu5) {
                case 1:
                    System.out.println("Stok Barang :");
                    System.out.println("Nama Barang           : " + namaBrg );
                    System.out.println("Kategori Barang       : " + tipeBrg );
                    System.out.println("Harga Barang          : " + harga );
                    break;
                case 2:
                    System.out.println("Masukkan Nama Barang Yang Ingin Anda Cek :");
                    namaBrg = input.next();
                    input.nextLine();
                    System.out.println("Nama Barang           : " );
                    System.out.println("Kategori Barang       : " );
                    System.out.println("Jumlah Stok Barang    : " );
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nomor menu yang anda masukkan salah");
                    break;
            }
            } while (menu5 != stop5);
                break;
            case 6:
            
                System.out.println("=====Code Scanning=====");
                System.out.print("Masukkan nama Barang Yang Ingin Anda Scan: ");
                namaBrg = input.next();
                input.nextLine();

                System.out.println("=====Data Barang yang Dicari=====");
                System.out.println("Nama Barang               : \n" );
                System.out.println("Kategori Barang           : \n" );
                System.out.println("Nama Supplier             : \n" );
                System.out.println("Tanggal Produksi Barang   : \n" );
                System.out.println("Tanggal Kadaluarsa Barang : \n" );
                System.out.println("Harga Barang              : \n" );
                System.out.println("Jumlah Stok Barang        : \n" );

                break;
            case 7:
                int menu7;
                int stop7 = 0;
                do {
                System.out.println("=====Expiry Date Tracking=====");
                System.out.println("Silahkan pilih menu anda (1/0):");
                System.out.println("1. Cek tanggal kadaluarsa");
                System.out.println("0. Kembali");
                System.out.print("Pilih menu: ");
                menu7 = input.nextInt();
                switch (menu7) {
                    case 1:
                    System.out.print("Masukkan nama barang: ");
                    namaBrg = input.next();
                    input.nextLine();
                    System.out.print("Masukkan tanggal yang ingin Anda cek (format: dd-MM-yyyy): ");
                    prdDate = input.nextLine();
                    System.out.print("Masukkan tanggal sekarang (format: dd-MM-yyyy): ");
                    dateNow = input.nextLine();

                    if (prdDate == dateNow) {
                        System.out.println("Tanggal sudah lewat!");
                    } else {
                        System.out.println("Tanggal belum lewat.");
                    }
                    break;
                    case 0:
                    break;
                }
            } while (menu7 != stop7);
            break;
            case 0:
                System.out.println("!!Anda keluar dari menu!!");
                System.exit(0);
                break;
                
        }
        } while (fitur != 0);
    
    }
}

import java.util.Scanner;

public class indexV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBrg = "", tipeBrg = "", supplier = "", prdDate = "", expDate = "";
        double harga = 0.0;
        int stokBrg = 0, menu;
 
        System.out.println("===============Selamat Datang===============");
        System.out.println("1.Item Entry and Storage"); 
        System.out.println("2.Stock Quantity Management");
        System.out.println("3.Item Categorization");
        System.out.println("4.Supplier Management");
        System.out.println("5.Stock Checking");
        System.out.println("6.Code Scanning");
        System.out.println("7.Expiry Date Tracking ");
        System.out.println("0.Keluar dari Menu");
        System.out.println("Masukkan Nomor Menu: ");
        
        
        int fitur = input.nextInt();
        do{
            if (fitur == 0 ) {
                break;
            }
 
        switch (fitur) {
            case 1:
            System.out.println("=====Item Entry and Storage=====");
            System.out.println("Masukkan Nama Supplier: ");
            supplier = input.next();
            input.nextLine();
            System.out.println("Masukkan Nama Barang: ");
            namaBrg = input.next();
            input.nextLine();
            System.out.println("Masukkan Kategori Barang: ");
            tipeBrg = input.next();
            input.nextLine();
            // System.out.println("Masukkan Tanggal Masuk Barang: ");
            // inGdg = input.next();
            input.nextLine();
            System.out.println("Masukkan Tanggal Produksi Barang: ");
            prdDate = input.next();
            input.nextLine();
            System.out.println("Masukkan Tanggal Kadaluarsa Barang: ");
            expDate = input.next();
            input.nextLine();
            System.out.println("Masukkan Harga Barang: ");
            harga = input.nextDouble();
            input.nextLine();
            // System.out.println("Masukkan id Barang: ");
            // idBrg = input.nextInt();
            input.nextLine();
            System.out.println("Masukkan Jumlah Stok Barang: ");
            stokBrg = input.nextInt();
            input.nextLine();
            System.out.println("===========================================================================");
            System.out.println("Barang " + namaBrg + " dari supplier " + supplier
                    + " telah berhasil ditambahkan");
                break;
            case 2:
            while (true) {
                System.out.println("======Update Item Information======");
                System.out.println("Silahkan Pilih");
                System.out.println("1. Update");
                System.out.println("2. Hapus");
                System.out.println("3. Keluar");
                System.out.print("Masukkan Nomor: ");
                menu = input.nextInt();
                input.nextLine();
    
                if (menu == 1) {
                    System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
                    namaBrg = input.nextLine();
    
                    System.out.println("============================");
                    System.out.println("Part yang ingin anda ubah:");
                    System.out.println("1. Nama Barang");
                    System.out.println("2. Kategori Barang");
                    System.out.println("3. Tanggal Produksi Barang");
                    System.out.println("4. Tanggal Kadaluarsa Barang");
                    System.out.println("5. Harga Barang");
                    System.out.println("6. Jumlah Stok Barang");
                    System.out.println("7. Selesai");
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
                        case 7:
                            System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    System.out.println("Barang " + namaBrg + " berhasil diperbarui ");
                } else if (menu == 2) {
                    System.out.print("Masukkan Nama Barang yang ingin dihapus: ");
                    namaBrg = input.nextLine();
                    System.out.println("Data barang " + namaBrg + " telah berhasil dihapus");
                } else if (menu == 3) {
                    System.out.println("Keluar dari program.");
                    break; // tambahkan pernyataan break untuk keluar dari loop
                } else {
                    System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1, 2, atau 3");
                }
            }
                break;
            case 3:
                System.out.println("=====Item Categorization=====");

                break;
            case 4:
                System.out.println("=====Supplier Management=====");
                System.out.println("Masukkan supplier: ");
                supplier = input.next();
                input.nextLine();
                System.out.println("Masukkan Kontak: ");
                String konSUp = input.next();
                System.out.println("Masukkan Alamat: ");
                String alamSup = input.next();

                System.out.println("==============================");
                System.out.println("Supplier: " + supplier);
                System.out.println("Kontak: " + konSUp);
                System.out.println("Alamat: " + alamSup);

                break;
            case 5:
                System.out.println("=====Stock Checking=====");
                System.out.print("Nama Barang           : \n" );
                namaBrg = input.next();
                input.nextLine();
                System.out.print("Kategori Barang       : \n" );
                tipeBrg = input.next();
                input.nextLine();
                System.out.print("Jumlah Stok Barang    : \n" );
                stokBrg = input.nextInt();
                input.nextLine();

                break;
            case 6:
            
                System.out.println("=====Code Scanning=====");
                System.out.println("Masukkan nama Barang Yang Ingin Anda Scan: ");
                namaBrg = input.nextLine();
                System.out.println("=====Data Barang yang Dicari=====");
                System.out.print("Nama Barang               : \n" );
                System.out.print("Kategori Barang           : \n" );
                System.out.print("Nama Supplier             : \n" );
                System.out.print("Tanggal Produksi Barang   : \n" );
                System.out.print("Tanggal Kadaluarsa Barang : \n" );
                System.out.print("Harga Barang              : \n" );
                System.out.print("Jumlah Stok Barang        : \n" );

                break;
            case 7:
                System.out.println("=====Expiry Date Tracking=====");

                break;
            case 0:
                System.out.println("!!Anda keluar dari menu!!");
                System.exit(0);
                break;
                
        } 
        } while (fitur != 0);
               
    }
}

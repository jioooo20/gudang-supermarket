import java.util.Scanner;

public class swit {

    // String namaBrg, tipeBrg, supplier, inGdg, prdDate, expDate;
    // Double harga;
    // int idBrg, stokBrg, fitur, menu;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBrg, tipeBrg, supplier, inGdg, prdDate, expDate;
        Double harga;
        int idBrg, stokBrg, fitur, menu;

        System.out.println("===============Selamat Datang===============");
        System.out.println("1.Item Entry and Storage");
        System.out.println("2.Stock Quantity Management");
        System.out.println("3.Item Categorization");
        System.out.println("4.Supplier Management");
        System.out.println("5.Stock Checking");
        System.out.println("6.Code Scanning");
        System.out.println("7.Expiry Date Tracking ");
        System.out.println("Masukkan Nomor Menu: ");
        fitur = input.nextInt();

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
                System.out.println("Masukkan Tanggal Masuk Barang: ");
                inGdg = input.next();
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
                System.out.println("Masukkan id Barang: ");
                idBrg = input.nextInt();
                input.nextLine();
                System.out.println("Masukkan Jumlah Stok Barang: ");
                stokBrg = input.nextInt();
                input.nextLine();
                System.out.println("===========================================================================");
                System.out.println("Barang " + namaBrg + " dengan id " + idBrg + " dari supplier " + supplier
                        + " telah berhasil ditambahkan");
                break;
            case 2:
                System.out.println("=====Update Item Information=====");
                System.out.println("Pilih Menu Anda");
                System.out.println("1. Update");
                System.out.println("2. Hapus");
                System.out.println("Masukkan Nomor Menu: ");
                menu = input.nextInt();
                input.nextLine();
                if (menu == 1) {
                    System.out.println("Masukkan Nama Barang yang ingin anda edit: ");
                    namaBrg = input.nextLine();
                    System.out.println("Masukkan Nama Barang Baru: ");
                    namaBrg = input.nextLine();
                    System.out.println("Masukkan Kategori Barang Baru: ");
                    tipeBrg = input.nextLine();
                    System.out.println("Masukkan Nama Supplier Baru: ");
                    supplier = input.nextLine();
                    System.out.println("Masukkan Jumlah Stok Barang Baru: ");
                    stokBrg = input.nextInt();
                    System.out.println("Masukkan id Barang Baru: ");
                    idBrg = input.nextInt();
                    System.out.println("Barang " + namaBrg + " dengan id " + idBrg + " dari supplier " + supplier
                            + " telah berhasil diupdate");
                } else if (menu == 2) {
                    System.out.println("Masukkan id Barang yang ingin dihapus: ");
                    idBrg = input.nextInt();
                    System.out.println("Data barang id " + idBrg + " telah berhasil dihapus");

                } else {
                    System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih antara 1 atau 2");
                }

                break;
            case 3:
                System.out.println("=====Item Categorization=====");

                break;
            case 4:
                System.out.println("=====Supplier Management=====");

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
                System.out.println("Masukkan id Barang Yang Ingin Anda Scan: ");
                idBrg = input.nextInt();
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
            default:
                System.out.println("ngantuk??");
        }

    }
}

// if (fitur == 1) {
// System.out.println("=====Item Entry and Storage=====");
// System.out.println("Masukkan Nama Supplier: ");
// supplier = input.next();
// System.out.println("Masukkan Nama Barang: ");
// namaBrg = input.next();
// System.out.println("Masukkan Kategori Barang: ");
// tipeBrg = input.next();
// System.out.println("Masukkan Harga Barang: ");
// harga = input.nextDouble();
// System.out.println("Masukkan Tanggal Masuk Barang: ");
// inGdg = input.next().charAt(0);
// System.out.println("Masukkan Tanggal Produksi Barang: ");
// prdDate = input.next().charAt(0);
// System.out.println("Masukkan Tanggal Kadaluarsa Barang: ");
// expDate = input.next().charAt(0);
// System.out.println("Masukkan id Barang: ");
// idBrg = input.nextInt();
// System.out.println("Masukkan Jumlah Stok Barang: ");
// stokBrg = input.nextInt();
// System.out.println("Barang " + namaBrg + " dengan id " + idBrg + " dari
// supplier " + supplier
// + " telah berhasil ditambahkan");
// } else if (fitur == 2) {
// System.out.println("=====Item Entry and Storage=====");
// System.out.println("");
// } else {
// System.out.println("salah bang");
// }

import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBrg = "", tipeBrg = "", supplier = "", prdDate = "", expDate = "";
        double harga = 0.0;
        int stokBrg = 0, fitur = -1;

        while (fitur != 0) {
            System.out.println("===============Selamat Datang===============");
            System.out.println("1.Item Entry and Storage");
            System.out.println("2.Stock Quantity Management");
            System.out.println("3.Item Categorization");
            System.out.println("4.Supplier Management");
            System.out.println("5.Stock Checking");
            System.out.println("6.Code Scanning");
            System.out.println("7.Expiry Date Tracking ");
            System.out.println("0.Keluar dari Menu");
            System.out.print("Masukkan Nomor Menu: ");

            fitur = input.nextInt();

            switch (fitur) {
                case 1:
                    System.out.println("=====Item Entry and Storage=====");
                    // ... (input item details)
                    System.out.println("Barang " + namaBrg + " dari supplier " + supplier
                            + " telah berhasil ditambahkan");
                    break;
                case 2:
                    int menu = -1;
                    while (menu != 0) {
                        System.out.println("======Update Item Information======");
                        System.out.println("Silahkan Pilih");
                        System.out.println("1. Update");
                        System.out.println("2. Hapus");
                        System.out.println("0. Kembali ke Menu Utama");
                        System.out.print("Masukkan Nomor: ");
                        menu = input.nextInt();
                        input.nextLine();

                        if (menu == 1) {
                            // ... (update item information)
                        } else if (menu == 2) {
                            // ... (delete item)
                        } else if (menu == 0) {
                            System.out.println("Kembali ke Menu Utama.");
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("=====Item Categorization=====");
                    // ... (categorization)
                    break;
                case 4:
                    System.out.println("=====Supplier Management=====");
                    // ... (supplier management)
                    break;
                case 5:
                    System.out.println("=====Stock Checking=====");
                    // ... (stock checking)
                    break;
                case 6:
                    System.out.println("=====Code Scanning=====");
                    // ... (code scanning)
                    break;
                case 7:
                    System.out.println("=====Expiry Date Tracking=====");
                    // ... (expiry date tracking)
                    break;
                case 0:
                    System.out.println("!!Anda keluar dari menu!!");
                    break;
                default:
                    System.out.println("Nomor menu yang anda masukkan salah.");
            }
        }
    }
}

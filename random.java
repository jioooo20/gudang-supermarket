import java.util.Scanner;
public class random {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);

        String[] namaBrg = new String[5];
        String[] tipeBrg = new String[5];
        String[] prdDate = new String[5];
        String[] expDate = new String[5];
        String[] dateNow = new String[5];
        String[] supplier = new String[5];
        String[] konSupp = new String[5];
        String[] alamatSupp = new String[5];
        double[] harga = new double[5];
        int[] stokBrg = new int[5];
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
        System.out.println("0.Keluar dari Menu");
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
            supplier[i] = input.nextLine();
            input.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            namaBrg[i] = input.nextLine();
            System.out.print("Masukkan Kategori Barang: ");
            tipeBrg[i] = input.nextLine();
            System.out.print("Masukkan Tanggal Produksi Barang: ");
            prdDate[i] = input.next();
            input.nextLine();
            System.out.print("Masukkan Tanggal Kadaluarsa Barang: ");
            expDate[i] = input.next();
            input.nextLine();
            System.out.print("Masukkan Harga Barang: ");
            harga[i] = input.nextDouble();
            input.nextLine();
            System.out.print("Masukkan Jumlah Stok Barang: ");
            stokBrg[i] = input.nextInt();
            input.nextLine();
            System.out.println("===========================================================================");
            System.out.println("Barang telah berhasil ditambahkan");
            System.out.println("Masukkan data lagi?");
            System.out.println("1.Iya");
            System.out.println("0.Kembali ke menu");

            int pilihStop1 = input.nextInt();
            if( pilihStop1 == 0){
                stop = false; //kembali ke main menu
            }else{
                stop = true; // lanjut 
            }
            i++;
            }while (stop);    
            break;     
        }
        } while (fitur != 0);
    }
}

import java.util.Scanner;

public class uji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] array = { "Nilai 1", null, "", "Nilai 4", "Nilai 5", "", null, "Nilai 8" };

        int indeksNullPertama = -1;
        boolean foundNull = false;

        for (int i = 0; i < array.length; i++) {
            if (!foundNull && (array[i] == null || array[i].isEmpty())) {
                indeksNullPertama = i;
                foundNull = true;
                break; // Keluar dari loop setelah menemukan nilai null pertama
            }
        }

        if (indeksNullPertama != -1) {
            System.out.println("Indeks null pertama: " + indeksNullPertama);
        } else {
            System.out.println("Tidak ada nilai null dalam array.");
        }

    }
}

// String[] array = { "Nilai 1", null, "", "Nilai 4", "Nilai 5", "", null,
// "Nilai 8" };

// // Menyimpan indeks dengan nilai null atau kosong
// int[] indeksNullKosong = new int[array.length];
// int count = 0;

// for (int i = 0; i < array.length; i++) {
// if (array[i] == null || array[i].isEmpty()) {
// indeksNullKosong[count] = i;
// count++;
// }
// }

// for (int i = 0; i < array.length; i++) {

// }
// // Menampilkan indeks yang memiliki nilai null atau kosong
// System.out.println("Indeks dengan nilai null atau kosong:");
// for (int i = 0; i < count; i++) {
// System.out.println(indeksNullKosong[i]);
// }

// String[] namaBrg = {"Mie-Sedap-Goreng", "Teh-Rio"};
// String[] tipeBrg = {"Makanan", "Minuman"};
// String[] prdDate = {"22 September 2023", "23 September 2023"};
// String[] expDate = {"23 desember 2024", "24 desember 2025"};
// String[] dateNow = new String[5];
// String[] supplier = {"Wings", "Sayap"};
// String[] konSupp = {"08214141414", "08515151521"};
// String[] alamatSupp = {"Jawa", "Malang"};
// double[] harga = {110000, 22500};
// int[] stokBrg = {100, 200};

// int menu2;
// int stop2 = 0;
// do {
// System.out.println("======Update Item Information======");
// System.out.println("Silahkan Pilih");
// System.out.println("1. Update");
// System.out.println("2. Hapus");
// System.out.println("3. Tampilkan Item");//Sementara
// System.out.println("0. Kembali");
// System.out.print("Masukkan Nomor: ");
// menu2 = input.nextInt();
// input.nextLine();
// int index = -1;
// switch (menu2) {
// case 1:
// System.out.print("Masukkan Nama Barang yang ingin anda ubah: ");
// String namaBrgUpdate = input.nextLine();

// for (int i = 0; i < namaBrg.length; i++) {
// if (namaBrg[i].equalsIgnoreCase(namaBrgUpdate)) {
// index = i;
// break;
// }
// }

// if (index != -1) {
// System.out.println("============================");
// System.out.println("Part yang ingin anda ubah:");
// System.out.println("1. Nama Barang");
// System.out.println("2. Kategori Barang");
// System.out.println("3. Tanggal Produksi Barang");
// System.out.println("4. Tanggal Kadaluarsa Barang");
// System.out.println("5. Harga Barang");
// System.out.println("6. Jumlah Stok Barang");
// System.out.println("0. Selesai");
// System.out.print("Pilih menu: ");
// int pilihan = input.nextInt();
// input.nextLine(); // Consume newline character

// switch (pilihan) {
// case 1:
// System.out.print("Masukkan Nama Barang Baru: ");
// namaBrg[index] = input.nextLine();
// break;
// case 2:
// System.out.print("Masukkan Kategori Barang Baru: ");
// tipeBrg[index] = input.nextLine();
// break;
// case 3:
// System.out.print("Masukkan Tanggal Produksi Baru: ");
// prdDate[index] = input.nextLine();
// break;
// case 4:
// System.out.print("Masukkan Tanggal Kadaluarsa Baru: ");
// expDate[index] = input.nextLine();
// break;
// case 5:
// System.out.print("Masukkan Harga Barang Baru: ");
// harga[index] = input.nextDouble();
// break;
// case 6:
// System.out.print("Masukkan Jumlah Stok Barang Baru: ");
// stokBrg[index] = input.nextInt();
// break;
// case 0:
// System.out.println("+++++Anda telah selesai melakukan pembaruan data+++++");
// break;
// default:
// System.out.println("Pilihan tidak valid.");
// }
// System.out.println("Barang " + namaBrg[index] + " berhasil diperbarui ");
// } else {
// System.out.println("Barang tidak ditemukan");
// }
// break;
// case 2:
// System.out.print("Masukkan Nama Barang yang ingin dihapus: ");
// String namaBarangHapus = input.nextLine();

// int indexHapus = -1;
// for (int i = 0; i < namaBrg.length; i++) {
// if (namaBrg[i].equalsIgnoreCase(namaBarangHapus)) {
// indexHapus = i;
// break;
// }
// }

// if (indexHapus != -1) {
// for (int i = indexHapus; i < namaBrg.length - 1; i++) {
// namaBrg[i] = namaBrg[i + 1];
// tipeBrg[i] = tipeBrg[i + 1];
// prdDate[i] = prdDate[i + 1];
// expDate[i] = expDate[i + 1];
// supplier[i] = supplier[i + 1];
// konSupp[i] = konSupp[i + 1];
// alamatSupp[i] = alamatSupp[i + 1];
// harga[i] = harga[i + 1];
// stokBrg[i] = stokBrg[i + 1];
// }

// int lastIn = namaBrg.length - 1;
// namaBrg[lastIn] = null;
// tipeBrg[lastIn] = null;
// prdDate[lastIn] = null;
// expDate[lastIn] = null;
// supplier[lastIn] = null;
// konSupp[lastIn] = null;
// alamatSupp[lastIn] = null;
// harga[lastIn] = 0;
// stokBrg[lastIn] = 0;

// System.out.println("Data barang " + namaBarangHapus + " telah berhasil
// dihapus");
// } else {
// System.out.println("Barang tidak ditemukan");
// }
// break;
// case 3:
// for (int i = 0; i < namaBrg.length; i++) {
// System.out.println("Nama Barang: " + namaBrg[i]);
// System.out.println("Tipe Barang: " + tipeBrg[i]);
// System.out.println("Tanggal Produksi: " + prdDate[i]);
// System.out.println("Tanggal Kadaluarsa: " + expDate[i]);
// System.out.println("Supplier: " + supplier[i]);
// System.out.println("Kontak Supplier: " + konSupp[i]);
// System.out.println("Alamat Supplier: " + alamatSupp[i]);
// System.out.println("Harga: " + harga[i]);
// System.out.println("Stok: " + stokBrg[i]);
// System.out.println("====================");
// }
// break;
// case 0:
// break;
// default:
// System.out.println("Nomor menu yang anda masukkan salah, silahkan pilih
// antara 1, 2, atau 3");
// break;
// }
// } while (menu2 != stop2);
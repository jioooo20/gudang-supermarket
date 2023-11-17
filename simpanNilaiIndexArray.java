public class simpanNilaiIndexArray {
    public static void main(String[] args) {
        String[] arrayString = {"makanan", "minuman", "makanan", "permainan", "makanan", "buah", "makanan", "makanan", "hewan", "makanan"};
        String target = "makanan";

        int count = 0;  // Hitung berapa kali elemen target muncul
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(target)) {
                count++;
            }
        }

        if (count > 0) {
            int[] indeksMakanan = new int[count];  // Buat array untuk menyimpan indeks
            int currentIndex = 0;  // Indeks saat ini dalam array indeksMakanan

            for (int i = 0; i < arrayString.length; i++) {
                if (arrayString[i].equals(target)) {
                    indeksMakanan[currentIndex] = i;
                    currentIndex++;
                }
            }

            System.out.println("Indeks dari elemen '" + target + "': ");
            for (int i = 0; i < indeksMakanan.length; i++) {
                System.out.println(indeksMakanan[i]);
            }
        } else {
            System.out.println("Elemen '" + target + "' tidak ditemukan dalam array.");
        }
    }
}

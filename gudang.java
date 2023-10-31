import java.util.Scanner;

//note gudang lengkap
public class gudang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] nilaiMhs = new int [10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata - rata nilai = "+rata2);
       


    }
}

        // // Membuat array dengan 8 elemen
        // int[] array = new int[8];
        // for (int i = 0; i < 8; i++) {
        //     array[i] = i + 1;
        // }

        // // Menghitung jumlah
        // int sum = 0;
        // for (int i : array) {
        //     sum += i;
        // }

        // // Menghitung rata-rata
        // double average = (double) sum / array.length;

        // System.out.println("Rata-rata dari elemen array adalah: " + average); 
//////////////////////////////////

        // int[] element = new int[10];
        // for (int i = 0; i < 10; i++) {
        //     element[i] = i + 1;
        // }

        // System.out.println("Array sebelum dibalik:");
        // for (int i : element) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // // Membalik array
        // for (int i = 0; i < element.length / 2; i++) {
        //     int temp = element[i];
        //     element[i] = element[element.length - 1 - i];
        //     element[element.length - 1 - i] = temp;
        // }

        // System.out.println("Array setelah dibalik:");
        // for (int i : element) {
        //     System.out.print(i + " ");
        // }
       

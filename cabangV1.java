import java.util.Scanner;
public class cabangV1 {
    public static void main(String[] args) {     
        Scanner input = new Scanner(System.in);

        String[] namaBrg = {"Mie Sedap Goreng", "Teh Rio"};
        String[] tipeBrg = {"Makanan", "Minuman"};
        String[] prdDate = {"22 September 2023", "23 September 2023"};
        String[] expDate = {"23 desember 2024", "24 desember 2025"};
        String[] dateNow = new String[5];
        String[] supplier = {"Wings", "Sayap"};
        String[] konSupp = {"08214141414", "08515151521"};
        String[] alamatSupp = {"Jawa", "Malang"};
        double[] harga = {110000, 22500};
        int[] stokBrg = {100, 200};
        String[] cabang = {"Malang", "Blitar", "Tuban"};
        int[][] stokCabang = {
            {5,6},//malang
            {6,7},//blitar
            {8,9}//tuban
        };

        System.out.println("=====Stok Cabang=====");
        for(int i=0;i<stokCabang.length;i++){
            for(int j=0; j<stokCabang[i].length;j++){
                System.out.println("Stok "+namaBrg[j]+" pada cabang "+ cabang[i] + ": " + stokCabang[i][j]);
            }
        }

    }
}
 
import java.util.*;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah indeks : ");
        int n = sc.nextInt();
        int[] arrNilai = new int[n];
        int j = 0;
        for (j = 0; j < arrNilai.length; j++) {
            System.out.print("Masukkan nilai pada indeks ke-" + j + " : ");
            arrNilai[j] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang anda ingin cari : ");
        int key = sc.nextInt();
        int hasil = 0;
        j = 0;

        for (j = 0; j < arrNilai.length; j++) {
            if (key == arrNilai[j]) {
                hasil = j;
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
                break;
            } else if(j == (n-1)){
                System.out.println();
                System.out.println("Nilai tidak ditemukan!");
            }
        }
    }

}

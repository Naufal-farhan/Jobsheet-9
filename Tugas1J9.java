import java.util.*;

public class Tugas1J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int tertinggi = 0, terendah = 100,terkurang = 0, terpintar = 0;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i+" : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
                terpintar = i;
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
                terkurang = i;
            }
        }
        int rata2 = total/2;
        System.out.println();
        for (int j = 0; j < nilai.length; j++){
            System.out.println("Nilai Mahasiswa ke-"+j+" adalah : "+nilai[j]);
        }
        System.out.println( );
            System.out.println("Rata-Rata nilai Mahasiswa : "+rata2);
            System.out.println("Nilai terendah : "+terendah+", Dimiliki oleh Mahasiswa ke-"+ terkurang);
            System.out.println("Nilai Tertinggi : "+tertinggi+", Dimiliki oleh Mahasiswa ke-"+ terpintar);
    }
}

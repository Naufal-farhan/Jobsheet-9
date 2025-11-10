import java.util.*;

public class ArrayNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + (i + 1) + " adalah : " + nilaiAkhir[i]);
        }
    }
}

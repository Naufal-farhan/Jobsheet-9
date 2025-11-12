import java.util.*;

public class Tugas2J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Menu : ");
        int m = sc.nextInt();
        String[] jumlahMenu = new String[m];
        int[] HargaMenu = new int[m];

        for (int i = 0; i < m; i++) {
            sc.nextLine();
            System.out.print("Masukkan jenis menu indeks ke-" + i + " : ");
            jumlahMenu[i] = sc.nextLine();
            System.out.print("Masukkan harga untuk " + "[" + jumlahMenu[i] + "]" + " : ");
            HargaMenu[i] = sc.nextInt();
        }

        System.out.println("===LIST MENU===");
        for (int i = 0; i < m; i++) {
            System.out.println("Menu ke-" + i + " : " + jumlahMenu[i] + " : RP." + HargaMenu[i]);
        }
        System.out.print("Masukkan Jumlah Pesanan : ");
        int n = sc.nextInt();
        if(n>m){
            System.out.println("Pesanan anda meelebihi batas jumlah menu!!");
            return;
        }
        int[] pesanan = new int[n];
        String[] list = new String[n];

        int total = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Pilih jenis Menu ke-"+i+" : ");
            String pilihanMenu = sc.nextLine();

            if (pilihanMenu.equalsIgnoreCase(jumlahMenu[i])) {
                pesanan[i] = i;
                total += HargaMenu[i];
                list[i] = jumlahMenu[i];
            } else {
                System.out.println("Nama menu Salah!!");
                return;
            }
        }
        System.out.println("Pesanan : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Total harga : " + total);
    }
}

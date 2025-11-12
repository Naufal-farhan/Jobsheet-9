import java.util.*;
public class Tugas3J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Menu = {"NasGor","Bakmi", "Bakso", "Seblak","Ayam", "Bebek","Gacoan", "Kopi","Teh" };
        System.out.println("Daftar Menu : ");
        System.out.println(Arrays.toString(Menu));
        System.out.println();
        System.out.print("Masukkan Menu yang ingin anda cari : ");
        String key = sc.nextLine();

        for(int i = 0; i < Menu.length;i++){
            if(key.equalsIgnoreCase(Menu[i])){
                System.out.println("Menu yang anda cari tersedia pada indeks ke-"+i);
                return;
            }
            if(i == (Menu.length-1)){
                System.out.println("Menu yang anda cari tidak tersedia!!");
            }
        }
    }
}

import java.util.*;
public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0, rata2;
        int lulus=0, TLulus = 0;
        int rataLulus = 0, rataTLulus = 0;
        int totalLulus = 0, totalTLulus = 0;
        for(int i = 0 ; i < nilaiMhs.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i]; 

            if(nilaiMhs[i]>70){
                lulus++;
                totalLulus += nilaiMhs[i];
            }else{
                TLulus++;
                totalTLulus += nilaiMhs[i];
            }
        }
        rata2 = total/nilaiMhs.length;
        rataLulus = totalLulus/lulus;
        rataTLulus = totalTLulus/TLulus;
        System.out.println();
        System.out.println("Rata nilai mahasiswa adalah    : "+rata2);
        System.out.println();
        System.out.println("Rata rata nilai lulus                : "+rataLulus);
        System.out.println("Rata rata nilai tidak lulus          : "+rataTLulus);
    }
    
}

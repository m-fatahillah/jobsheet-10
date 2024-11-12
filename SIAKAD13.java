import java.util.Scanner;

public class SIAKAD13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p,q;

    System.out.print("Masukkan jumlah siswa : ");
    p = sc.nextInt();
    System.out.print("Masukkan jumlah mata kuliah : ");
    q = sc.nextInt();


    int[][] nilai = new int[p][q];

    for (int i = 0; i < nilai.length;i++){
        System.out.println("Input nilai mahasiswa ke-" + (i+1));
        double totalPersiswa = 0;
     

        for (int j = 0; j < nilai[i].length;j++){
            System.out.print("Nilai mata kuliah " + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            totalPersiswa += nilai[i][j];
    }

    System.out.println("Nilai rata-rata: " + totalPersiswa/q);
    }

    System.out.println("\n=================================");
    System.out.println("Rata-rata Nilai setiap Mata Kuliah");
    for (int j = 0; j < q; j++){
        double totalPerMatkul = 0;

        for (int i = 0; i<p ;i++){
            totalPerMatkul += nilai [i][j];
        }
        System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/nilai.length);
    }
}
    
}

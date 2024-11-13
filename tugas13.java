import java.util.Scanner;
public class tugas13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasilSurvey = new int[10][6];

        System.out.println("======Survey kepuasan pelanggan======");
        System.out.println("note : masing masing pertanyaan survet bernilai 1-5 poin");
        
        //a.menyimpan hasil survey
        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Penilaian orang ke-" + (i+1));
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.print("Nilai survey " + (j+1) + ": ");
                hasilSurvey[i][j] = sc.nextInt();
                if (hasilSurvey [i][j] > 5 || hasilSurvey[i][j] < 1) {
                    System.out.println("Nilai yang dimasukkan invalid");
                    j--;
                    continue;
                }
            }
            System.out.println();
        }

        //b. Menampilkan rata-rata untuk setiap responden
        for (int i = 0; i < hasilSurvey.length; i++) {
            int totalNilaiR = 0;
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                totalNilaiR += hasilSurvey[i][j];
            }
            double rataNilaiR = (double) totalNilaiR / 6;
            System.out.println("Rata-rata penilaian responden " + (i+1) + ": " + rataNilaiR);
        }

        //c.Menampilkan rata-rata untuk setiap pertanyaan
        System.out.println();
        for (int j = 0; j < 6; j++) {
            int totalNilaiP = 0;
            for (int i = 0; i < 10; i++) {
                totalNilaiP += hasilSurvey[i][j];
            }
            double rataNilaiP = (double) totalNilaiP / hasilSurvey.length;
            System.out.println("Rata-rata nilai pertanyaan " + (j+1) + ": " + rataNilaiP);
        }

        //d. Menampilkan nilai rata-rata secara keseluruhan
        System.out.println();
        int totalNilaiPR = 0;
        int jumlahPR = 6 *10;
        for (int i = 0; i < hasilSurvey.length; i++) {
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                totalNilaiPR += hasilSurvey[i][j];
            }
        }
        double rataNilaiPR = (double) totalNilaiPR / jumlahPR;
        System.out.println("Rata-rata nilai keseluruhan: " + rataNilaiPR);
    }
}
    

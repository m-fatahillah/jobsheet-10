import java.util.Scanner;
public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris =0,kolom =0,i;
        String nama,next;
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
    
        System.out.println("pilihan menu :");
        System.out.println("- Menu 1: Input data penonton");
        System.out.println("- Menu 2: Tampilkan daftar penonton");
        System.out.println("- Menu 3: Exit");
        System.out.print("Pilih menu(1/2/3): ");
        menu = sc.nextInt();
        sc.nextLine();

        while (menu == 1) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();   
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            
            if(next.equalsIgnoreCase("n")) {
                break;
            }
        }
        while (menu == 2) {
            System.out.println("daftar penonton : ");
            for(i=0; i < 4;i++){
                
            System.out.println("Baris " + (i+1) + ": ");
                for(int j=0;j < 2;j++) {
                    if (penonton[i][j] == null){ 
                        System.out.print("***\t");
                    }else{
                        System.out.print(penonton[i][j] + "\t");
                    }
                }
                System.out.println();
            }
            break;
        }
        while (menu == 3) {
            System.out.println("Terima kasih! Program selesai ");
            return;
        }
        while (menu < 1 && menu > 3){
            System.out.println("Menu tidak valid, silahkan pilih lagi");

        }
    }
    
    }
    
}

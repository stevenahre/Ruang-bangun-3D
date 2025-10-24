import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║  PROGRAM HITUNG BANGUN RUANG 3D       ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Bola");
            System.out.println("4. Keluar");
            System.out.print("\nPilih bangun ruang (1-4): ");
            pilihan = input.nextInt();
            
            switch(pilihan) {
                case 1:
                    hitungBalok(input);
                    break;
                case 2:
                    hitungKubus(input);
                    break;
                case 3:
                    hitungBola(input);
                    break;
                case 4:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while(pilihan != 4);
        
        input.close();
    }
    
    private static void hitungBalok(Scanner input) {
        System.out.println("\n--- INPUT BALOK ---");
        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();
        
        Balok balok = new Balok(panjang, lebar, tinggi);
        balok.tampilkanHasil();
    }
    
    private static void hitungKubus(Scanner input) {
        System.out.println("\n--- INPUT KUBUS ---");
        System.out.print("Masukkan panjang sisi (cm): ");
        double sisi = input.nextDouble();
        
        Kubus kubus = new Kubus(sisi);
        kubus.tampilkanHasil();
    }
    
    private static void hitungBola(Scanner input) {
        System.out.println("\n--- INPUT BOLA ---");
        System.out.print("Masukkan jari-jari (cm): ");
        double jariJari = input.nextDouble();
        
        Bola bola = new Bola(jariJari);
        bola.tampilkanHasil();
    }
}
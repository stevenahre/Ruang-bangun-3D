
public class Balok {

    private double panjang, lebar, tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
    public void tampilkanHasil() {
        System.out.println("\n=== HASIL PERHITUNGAN BALOK ===");
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Lebar: " + lebar + " cm");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("Volume: %.2f cm^3\n", hitungVolume());
        System.out.printf("Luas Permukaan: %.2f cm^2\n", hitungLuasPermukaan());
    }
}
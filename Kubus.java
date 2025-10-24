public class Kubus {
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
    
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
    
    public void tampilkanHasil() {
        System.out.println("\n=== HASIL PERHITUNGAN KUBUS ===");
        System.out.println("Panjang Sisi: " + sisi + " cm");
        System.out.printf("Volume: %.2f cm^3\n", hitungVolume());
        System.out.printf("Luas Permukaan: %.2f cm^2\n", hitungLuasPermukaan());
    }
}
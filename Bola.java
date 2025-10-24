public class Bola {
    private double jariJari;
    private static final double PI = 3.14159265359;
    
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungVolume() {
        return (4.0 / 3.0) * PI * Math.pow(jariJari, 3);
    }
    
    public double hitungLuasPermukaan() {
        return 4 * PI * Math.pow(jariJari, 2);
    }
    
    public void tampilkanHasil() {
        System.out.println("\n=== HASIL PERHITUNGAN BOLA ===");
        System.out.println("Jari-jari: " + jariJari + " cm");
        System.out.printf("Volume: %.2f cm^3\n", hitungVolume());
        System.out.printf("Luas Permukaan: %.2f cm^2\n", hitungLuasPermukaan());
    }
}

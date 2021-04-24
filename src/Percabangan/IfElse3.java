package Percabangan;

public class IfElse3 {
    public static void main(String[] args) {
        double totalBelanja = 145500;
        double uangDiDompet = 50000;

        if (uangDiDompet>totalBelanja) {
            System.out.println("Uang Kurang, Jangan Tapi Belanja");
        } else if (uangDiDompet<totalBelanja) {
            double kembali = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup,,, kembali : " + kembali);
        } else {
            System.out.println("Duit Pas,Tangkyu...");
        }
    }
}
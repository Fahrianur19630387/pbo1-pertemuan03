package Gabungan;

public class GSOP {
    public static void main(String[] args) {
        int N=6;
        switch (N){
            case 1:
                System.out.println("Angka 1.");
            case 2:
            case 4:
            case 8:
                System.out.println("Angka 2,4,atau 8.");
                System.out.println("(Kelipatan dari 2!)");
                break;
            case 3:
            case 6:
            case 9:
                System.out.println("Angka 3, 6, atau 9.");
                System.out.println("(Faktor dari 3!)");
                break;
            case 5:
                System.out.println("Angka 5.");
                break;
            default:
                System.out.println("Angka 7.");
                System.out.println("atau Angka Lebih dari range 1-9");
        }
    }
}

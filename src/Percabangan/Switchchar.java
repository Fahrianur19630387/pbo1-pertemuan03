package Percabangan;

public class Switchchar {
    public static void main(String[] args) {
        char nilai ='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs      :\"Terima Kasih pak\"");
                System.out.println("Dosen    :\"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs      :\"Selamat Siang Bu\"");
                System.out.println("Dosen    :\"iya,,, Siang !!\"");
                break;
            case 'C':
                System.out.println("Mhs      :\"Sudah Makan Siang Bu\"");
                System.out.println("Dosen    :\"Belum !!\"");
                System.out.println("Mhs      :\"Makan Bareng Yuk Bu\"");
                break;
            default:
                System.out.println("Dosen    :\"Makan Dimana\"");
                System.out.println("Mhs      :\"Bebas Bu, Asal Ibu Bahagia\"");
                System.out.println("Dosen    :\"Nilai Kamu saya Beri SSS\"");
                System.out.println("Mhs      :\"Terima Kasih Ibu, Ibu memang cantik\"");
                System.out.println("Mhs      :\"Ayo Kita Makan Siang Bu\"");
                break;
        }
    }
}

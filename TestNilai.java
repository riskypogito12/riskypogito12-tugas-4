import java.util.Scanner;
public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        System.out.println("1. Input Nilai ");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Masukkan Pilihan : ");
        int opsi = input.nextInt();
        switch(opsi){
            case 1:
                System.out.print("Masukkan Nilai : ");
                hitung.inputNilai(nilai);
                System.out.println("Daftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai : "+ hitung.rataNilai(banyakData));
                break;
            case 2:
                System.out.print("Masukkan Nilai Baru: ");
                hitung.inputNilaiBaru(banyakData);
                System.out.print("Daftar Nilai Baru : ");
                hitung.cetakNilaiBaru();
                break;
        }
    }
}
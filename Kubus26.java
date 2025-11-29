import java.util.Scanner;

public class Kubus26 {

    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        System.out.println("Volume Kubus = " + hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus = " + hitungLuasPermukaan(sisi));
    }
}

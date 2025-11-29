import java.util.Scanner;

public class RekapPenjualanCafe26B {

    static String[] menu;
    static int[][] penjualan;
    static int jumlahMenu;
    static int jumlahHari;

    public static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        sc.nextLine();

        System.out.println("\nINPUT DATA PENJUALAN:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("\nNama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    public static void tampilData() {
        System.out.println("\nREKAP DATA PENJUALAN");
        System.out.printf("%-20s", "Menu");

        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf("Hari %d\t", h);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilTerlaris() {
        int maxTotal = -1;
        String menuTerlaris = "";

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu Terlaris: " + menuTerlaris);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    public static void tampilRataRata() {
        System.out.println("\nRATA-RATA PENJUALAN PER MENU");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) jumlahHari;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        inputData();
        tampilData();
        tampilTerlaris();
        tampilRataRata();
    }
}

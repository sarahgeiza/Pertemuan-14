import java.util.Scanner;

public class RekapPenjualanCafe26 {

    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"
    };

    static int[][] penjualan = new int[5][7];

    public static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nINPUT DATA PENJUALAN:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilData() {
        System.out.println("\nREKAP DATA PENJUALAN");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("Hari %d\t", h);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilTerlaris() {
        int maxTotal = -1;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
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
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = total / 7.0;
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

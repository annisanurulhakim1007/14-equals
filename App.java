import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static boolean login(String username, String password) {
        String validUsername = "happymart";
        String validPassword = "1007";

        return validUsername.equals(username) && validPassword.equals(password);
    }

    public static String captcha() {
        return "07n34f";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validLogin = false;
        boolean validCaptcha = false;

        do {
            //Login
            System.out.print("Masukkan Username : ");
            String username = scanner.nextLine();

            System.out.print("Masukkan Password : ");
            String password = scanner.nextLine();

            //Validasi Login
            validLogin = login(username, password);

            if(!validLogin) {
                System.out.println("Login gagal. Silakan coba lagi!");
            }
        }
        while (!validLogin);

        do {
            //Captcha
            String expectedCaptcha = captcha();
            System.out.println("Captcha : " + expectedCaptcha);

            System.out.print("Masukkan Captcha : ");
            String masukkanCaptcha = scanner.nextLine();

            //Validasi Captcha
            validCaptcha = expectedCaptcha.equalsIgnoreCase(masukkanCaptcha);

            if(!validCaptcha) {
                System.out.println("Captcha salah. Silakan coba lagi");
            }
        }
        while (!validCaptcha);

        System.out.println("\nLOGIN BERHASIL\n");

        try {
            System.out.print("Masukkan No Faktur : ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Nama Pelanggan : ");
            String namaCustomer = scanner.nextLine();

            System.out.print("Masukkan No HP : ");
            String noHP = scanner.nextLine();

            System.out.print("Masukkan Alamat : ");
            String alamat = scanner.nextLine();

            System.out.print("Masukkan Kode Barang : ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang : ");
            String namaBarang = scanner.nextLine();

            double harga;
            while (true) {
                try {
                    System.out.print("Masukkan Harga Barang : ");
                    harga = scanner.nextDouble();
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("Input harga salah. Mohon masukkan dengan angka");
                    scanner.next();
                }
            }
            int jumlahBeli;
            while (true) {
                try {
                    System.out.print("Masukkan Jumlah Barang : ");
                    jumlahBeli = scanner.nextInt();
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("Input jumlah barang salah. Mohon masukkan dengan angka");
                    scanner.next();
                }
            }

            Date tanggal = new Date(System.currentTimeMillis());

            SimpleDateFormat hari = new SimpleDateFormat("'Hari/tanggal\t:' EEEEEEEEEE dd-MM-yyyy");
            SimpleDateFormat jam = new SimpleDateFormat("'Waktu\t\t:' hh:mm:ss z");

            System.out.println("\n====================================");
            System.out.println("============ HAPPY MART ============");
            System.out.println(hari.format(tanggal));
            System.out.println(jam.format(tanggal));
            System.out.println("No Faktur\t: " + noFaktur);
            System.out.println("====================================");
            System.out.println("\n---------- DATA PELANGGAN ----------");
            System.out.println("Nama Pelanggan\t: " + namaCustomer);
            System.out.println("No HP\t\t: " + noHP);
            System.out.println("Alamat\t\t: " + alamat);
            System.out.println("\n------- DATA PEMBELIAN BARANG -------");
            System.out.println("Kode Barang\t: " + kodeBarang);
            System.out.println("Nama Barang\t: " + namaBarang);
            System.out.println("Harga\t\t: " + harga);
            System.out.println("Jumlah\t\t: " + jumlahBeli);
            System.out.println("Total Bayar\t: " + harga*jumlahBeli);
            System.out.println("=====================================");
            System.out.println("Kasir\t\t: Annisa Nurul Hakim");

            System.out.println("\ntoUpperCase\t: " + namaCustomer.toUpperCase() + "\n");
        }
        finally {
            scanner.close();
        }
    }
}

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("                   MINI MARKET");
            System.out.println("=================================================");
            System.out.printf("Masukkan No Faktur\t\t: ");
            String noFaktur = scanner.nextLine();

            System.out.printf("Masukkan Nama Pelanggan\t\t: ");
            String namaPelanggan = scanner.nextLine();

            System.out.printf("Masukkan Nama Barang\t\t: ");
            String namaBarang = scanner.nextLine();

            System.out.printf("Masukkan Harga Barang\t\t: ");
            double hargaBarang = scanner.nextDouble();

            System.out.printf("Masukkan Jumlah Beli\t\t: ");
            int jumlahBeli = scanner.nextInt();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a zzz");
            Date date = new Date();

            System.out.printf("Tanggal Transaksi\t\t: %s\n", dateFormat.format(date));
            System.out.printf("Jam\t\t\t\t: %s\n", timeFormat.format(date));
            System.out.printf("Kasir\t\t\t\t: naufal\n");

            


        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memproses input: " + e.getMessage());
        }
    }
}

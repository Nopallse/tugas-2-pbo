import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Membuat objek BarangPembayaran
            BarangPembayaran barangPembayaran = new BarangPembayaran(namaBarang, hargaBarang, jumlahBeli);

            // Membuat objek Faktur
            Faktur faktur = new Faktur(noFaktur, namaPelanggan, barangPembayaran);

            // Menampilkan faktur
            faktur.cetakFaktur();
        } catch (Exception e) {
            // Menangkap exception yang terjadi selama input
            System.out.println("Terjadi kesalahan saat memproses input: " + e.getMessage());
        }
    }
}
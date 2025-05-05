import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Daffa_Main {

    static ArrayList<Daffa_Item> daftarItem = new ArrayList<>();
    static ArrayList<Daffa_Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Daffa_Order> daftarOrder = new ArrayList<>();

    public static void main(String[] args) {
        Daffa_TiketKonser tiket1 = new Daffa_TiketKonser("BTS World Tour 2024", 500000, "BTS", new Date(), "Seoul Olympic Stadium");
        Daffa_TiketKonser tiket2 = new Daffa_TiketKonser("EXO World Tour 2024", 450000, "EXO", new Date(), "Tokyo Dome");
        Daffa_Merchandise merchandise1 = new Daffa_Merchandise("T-Shirt BTS World Tour 2024", 300000, "BTS Merch", "Apparel");
        Daffa_Merchandise merchandise2 = new Daffa_Merchandise("Cap EXO World Tour 2024", 250000, "EXO Merch", "Headwear");
        Daffa_RekamanKonser rekaman1 = new Daffa_RekamanKonser("BTS World Tour 2024 Live Album", 0, "BTS", new Date(), "Seoul Olympic Stadium", "[link]");
        Daffa_RekamanKonser rekaman2 = new Daffa_RekamanKonser("EXO World Tour 2024 Live Album", 0, "EXO", new Date(), "Tokyo Dome", "[link]");

        daftarItem.add(tiket1);
        daftarItem.add(tiket2);
        daftarItem.add(merchandise1);
        daftarItem.add(merchandise2);
        daftarItem.add(rekaman1);
        daftarItem.add(rekaman2);

        menuUtama();
    }

    static void menuUtama() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== Menu Kasir Festival Musik =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Semua Barang");
            System.out.println("3. Daftar Pelanggan Baru");
            System.out.println("4. Buat Pesanan");
            System.out.println("5. Lihat Semua Pesanan");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahBarang(scanner);
                    break;
                case 2:
                    lihatSemuaBarang();
                    break;
                case 3:
                    daftarPelangganBaru(scanner);
                    break;
                case 4:
                    buatPesanan(scanner);
                    break;
                case 5:
                    lihatSemuaPesanan();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang sesuai.");
            }

            System.out.print("Tekan enter untuk melanjutkan...");
            scanner.nextLine();
            scanner.nextLine();
            System.out.println();

        } while (pilihan != 6);

        scanner.close();
    }

    static void tambahBarang(Scanner scanner) {
        System.out.println("===== Menu Tambah Barang =====");
        System.out.println("1. Tiket Konser");
        System.out.println("2. Merchandise");
        System.out.println("3. Rekaman Konser");
        System.out.println("4. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                tambahTiketKonser(scanner);
                break;
            case 2:
                tambahMerchandise(scanner);
                break;
            case 3:
                tambahRekamanKonser(scanner);
                break;
            case 4:
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih opsi yang sesuai.");
        }

        lihatSemuaBarang();
    }

    static void tambahTiketKonser(Scanner scanner) {
        System.out.print("Nama Tiket: ");
        scanner.nextLine();
        String nama = scanner.nextLine();

        System.out.print("Harga Tiket: ");
        float harga = scanner.nextFloat();

        System.out.print("Nama Artis: ");
        scanner.nextLine();
        String namaArtis = scanner.nextLine();

        System.out.print("Tanggal Konser (dd/mm/yyyy): ");
        String tanggalInput = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggal = null;
        try {
            tanggal = format.parse(tanggalInput);
        } catch (ParseException e) {
            System.out.println("Format tanggal tidak valid. Silakan coba lagi.");
            return;
        }

        System.out.print("Venue: ");
        String venue = scanner.nextLine();

        Daffa_Item item = new Daffa_TiketKonser(nama, harga, namaArtis, tanggal, venue);
        daftarItem.add(item);

        System.out.println("Tiket konser berhasil ditambahkan.");
    }

    static void tambahMerchandise(Scanner scanner) {
        System.out.print("Nama Merchandise: ");
        scanner.nextLine();
        String nama = scanner.nextLine();

        System.out.print("Harga Merchandise: ");
        float harga = scanner.nextFloat();

        System.out.print("Nama Merk: ");
        scanner.nextLine();
        String namaMerk = scanner.nextLine();

        System.out.print("Kategori: ");
        String kategori = scanner.nextLine();

        Daffa_Item item = new Daffa_Merchandise(nama, harga, namaMerk, kategori);
        daftarItem.add(item);

        System.out.println("Merchandise berhasil ditambahkan.");
    }

    static void tambahRekamanKonser(Scanner scanner) {
        System.out.print("Nama Rekaman Konser: ");
        scanner.nextLine();
        String nama = scanner.nextLine();

        System.out.print("Nama Artis: ");
        String namaArtis = scanner.nextLine();

        System.out.print("Tanggal Rekaman (dd/mm/yyyy): ");
        String tanggalInput = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggal = null;
        try {
            tanggal = format.parse(tanggalInput);
        } catch (ParseException e) {
            System.out.println("Format tanggal tidak valid. Silakan coba lagi.");
            return;
        }

        System.out.print("Venue: ");
        String venue = scanner.nextLine();

        System.out.print("Link Rekaman: ");
        String linkRekaman = scanner.nextLine();

        Daffa_Item item = new Daffa_RekamanKonser(nama, 0, namaArtis, tanggal, venue, linkRekaman);
        daftarItem.add(item);

        System.out.println("Rekaman konser berhasil ditambahkan.");
    }

    static void lihatSemuaBarang() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("===== Menu Lihat Semua Barang =====");
        System.out.println("1. Tiket Konser:");
        for (Daffa_Item item : daftarItem) {
            if (item instanceof Daffa_TiketKonser) {
                Daffa_TiketKonser tiket = (Daffa_TiketKonser) item;
                System.out.println(" - Nama: " + tiket.nama + ", Harga: " + currencyFormat.format(tiket.harga) + ", Stok: " + tiket.stok);
            }
        }

        System.out.println("2. Merchandise:");
        for (Daffa_Item item : daftarItem) {
            if (item instanceof Daffa_Merchandise) {
                Daffa_Merchandise merchandise = (Daffa_Merchandise) item;
                System.out.println(" - Nama: " + merchandise.nama + ", Harga: " + currencyFormat.format(merchandise.harga) + ", Stok: " + merchandise.stok);
            }
        }

        System.out.println("3. Rekaman Konser:");
        for (Daffa_Item item : daftarItem) {
            if (item instanceof Daffa_RekamanKonser) {
                Daffa_RekamanKonser rekaman = (Daffa_RekamanKonser) item;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println(" - Nama: " + rekaman.nama + ", Tanggal: " + sdf.format(rekaman.tanggalKonser) + ", Venue: " + rekaman.venue + ", Link: " + rekaman.linkRekaman);
            }
        }
    }

    static void daftarPelangganBaru(Scanner scanner) {
        System.out.print("Nama Pelanggan: ");
        scanner.nextLine();
        String nama = scanner.nextLine();

        String email;
        boolean emailValid = false;
        do {
            System.out.print("Email Pelanggan: ");
            email = scanner.nextLine();

            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                emailValid = true;
            } else {
                System.out.println("Error: Format email tidak valid. Silakan masukkan email dengan format yang benar (contoh: nama@example.com).");
            }
        } while (!emailValid);

        String noHp;
        boolean noHpValid = false;
        do {
            System.out.print("Nomor Telepon: ");
            noHp = scanner.nextLine();

            if (noHp.matches("^08\\d{10}$")) {
                noHpValid = true;
            } else {
                System.out.println("Error: Format nomor telepon tidak valid. Nomor telepon harus dimulai dengan '08' dan memiliki total 12 digit.");
            }
        } while (!noHpValid);

        int id = daftarPelanggan.size() + 1;
        Daffa_Pelanggan pelanggan = new Daffa_Pelanggan(id, nama, email, noHp);
        daftarPelanggan.add(pelanggan);

        System.out.println("Pelanggan baru berhasil didaftarkan.");
    }

    static void buatPesanan(Scanner scanner) {
        System.out.print("Masukkan ID Pelanggan: ");
        int customerId = scanner.nextInt();
        Daffa_Pelanggan customer = null;
        for (Daffa_Pelanggan pelanggan : daftarPelanggan) {
            if (pelanggan.customerId == customerId) {
                customer = pelanggan;
                break;
            }
        }

        if (customer == null) {
            System.out.println("Error: Pelanggan dengan ID " + customerId + " tidak ditemukan dalam database. Silakan daftarkan pelanggan terlebih dahulu.");
            return;
        }

        System.out.print("Masukkan ID Barang: ");
        int itemId = scanner.nextInt();
        if (itemId <= 0 || itemId > daftarItem.size()) {
            System.out.println("ID Barang tidak valid.");
            return;
        }
        Daffa_Item itemTerpilih = daftarItem.get(itemId - 1);

        if (itemTerpilih.stok <= 0) {
            System.out.println("Error: Maaf, stok " + itemTerpilih.nama + " habis. Silakan pesan barang lain atau coba lagi nanti.");
            return;
        }

        System.out.print("Masukkan Jumlah Item: ");
        int qtyItem = scanner.nextInt();

        if (qtyItem > itemTerpilih.stok) {
            System.out.println("Error: Jumlah pesanan melebihi stok barang yang tersedia.");
            return;
        }

        int orderId = daftarOrder.size() + 1;
        Daffa_Order order = new Daffa_Order(orderId, customer, itemTerpilih, qtyItem);
        daftarOrder.add(order);

        itemTerpilih.kurangiStok(qtyItem);

        System.out.println("Pesanan berhasil dibuat.");
    }

    static void lihatSemuaPesanan() {
        System.out.println("===== Daftar Semua Pesanan =====");
        for (Daffa_Order order : daftarOrder) {
            System.out.println("Order ID: " + order.orderId);
            System.out.println("Pelanggan: " + order.customer.nama);
            System.out.println("Barang: " + order.itemTerpilih.nama);
            System.out.println("Jumlah: " + order.qtyItem);
            System.out.println("Total Harga: Rp " + String.format(Locale.US, "%,.0f", order.hitungTotalHarga()));
            System.out.println();
        }
        System.out.print("Tekan enter untuk melanjutkan...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

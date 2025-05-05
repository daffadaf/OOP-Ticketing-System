import java.text.NumberFormat;
import java.util.Locale;

abstract class Daffa_Item {
    String itemId;
    String nama;
    float harga;
    int stok;

    String formatPrice(float price) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatter.format(price);
    }

    Daffa_Item(String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
        this.stok = 10;
        this.itemId = generateItemId();
    }

    void kurangiStok() {
        this.stok--;
    }

    void kurangiStok(int jumlah) {
        this.stok -= jumlah;
    }

    float hitungTotalDariJumlah(int jumlah) {
        return this.harga * jumlah;
    }

    String generateItemId() {
        return "ITEM" + System.currentTimeMillis();
    }

    abstract String getData();
}

import java.text.SimpleDateFormat;
import java.util.Date;

class Daffa_TiketKonser extends Daffa_Item {
    String namaArtis;
    Date tanggalKonser;
    String venue;

    Daffa_TiketKonser(String nama, float harga, String namaArtis, Date tanggalKonser, String venue) {
        super(nama, harga);
        this.namaArtis = namaArtis;
        this.tanggalKonser = tanggalKonser;
        this.venue = venue;
    }

    @Override
    String getData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "TiketKonser{" +
                "nama='" + nama + '\'' +
                ", harga=" + formatPrice(harga) +
                ", namaArtis='" + namaArtis + '\'' +
                ", tanggalKonser=" + sdf.format(tanggalKonser) +
                ", venue='" + venue + '\'' +
                ", stok=" + stok +
                '}';
    }

    int hitungJarakTanggalDenganHariIni() {
        Date now = new Date();
        long diff = tanggalKonser.getTime() - now.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
}

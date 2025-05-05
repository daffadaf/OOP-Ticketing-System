import java.text.SimpleDateFormat;
import java.util.Date;

class Daffa_RekamanKonser extends Daffa_Item {
    String namaArtis;
    Date tanggalKonser;
    String venue;
    String linkRekaman;

    Daffa_RekamanKonser(String nama, float harga, String namaArtis, Date tanggalKonser, String venue, String linkRekaman) {
        super(nama, harga);
        this.namaArtis = namaArtis;
        this.tanggalKonser = tanggalKonser;
        this.venue = venue;
        this.linkRekaman = linkRekaman;
    }

    @Override
    String getData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "RekamanKonser{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                ", namaArtis='" + namaArtis + '\'' +
                ", tanggalKonser=" + sdf.format(tanggalKonser) +
                ", venue='" + venue + '\'' +
                ", linkRekaman='" + linkRekaman + '\'' +
                ", stok=" + stok +
                '}';
    }
}

class Daffa_Merchandise extends Daffa_Item {
    String namaMerk;
    String kategori;

    Daffa_Merchandise(String nama, float harga, String namaMerk, String kategori) {
        super(nama, harga);
        this.namaMerk = namaMerk;
        this.kategori = kategori;
    }

    @Override
    String getData() {
        return "Merchandise{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                ", namaMerk='" + namaMerk + '\'' +
                ", kategori='" + kategori + '\'' +
                ", stok=" + stok +
                '}';
    }
}

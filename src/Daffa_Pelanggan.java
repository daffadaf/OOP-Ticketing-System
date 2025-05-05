class Daffa_Pelanggan {
    int customerId;
    String nama;
    String email;
    String noHp;

    Daffa_Pelanggan(int id, String nama, String email, String noHp) {
        this.customerId = id;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
    }

    String getDetailPelanggan() {
        return "Pelanggan{" +
                "customerId=" + customerId +
                ", nama='" + nama + '\'' +
                ", email='" + email + '\'' +
                ", noHp='" + noHp + '\'' +
                '}';
    }
}

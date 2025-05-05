class Daffa_Order {
    int orderId;
    Daffa_Pelanggan customer;
    Daffa_Item itemTerpilih;
    int qtyItem;
    double totalHarga;

    Daffa_Order(int id, Daffa_Pelanggan customer, Daffa_Item itemTerpilih, int qtyItem) {
        this.orderId = id;
        this.customer = customer;
        this.itemTerpilih = itemTerpilih;
        this.qtyItem = qtyItem;
        this.totalHarga = itemTerpilih.hitungTotalDariJumlah(qtyItem);
    }


    double hitungTotalHarga() {
        return itemTerpilih.hitungTotalDariJumlah(qtyItem);
    }
}

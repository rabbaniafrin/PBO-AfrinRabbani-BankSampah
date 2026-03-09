package sibas;

public class Transaksi {

    private String idTransaksi;
    private String tanggal;
    private double beratSampah;
    private double totalNominal;

    private Nasabah nasabah;
    private Sampah sampah;

    public Transaksi(String idTransaksi, String tanggal, double beratSampah, Nasabah nasabah, Sampah sampah) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.beratSampah = beratSampah;
        this.nasabah = nasabah;
        this.sampah = sampah;
    }

    public double hitungTotal() {
        return 0;
    }
}

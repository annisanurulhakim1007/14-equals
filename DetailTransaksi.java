public class DetailTransaksi extends Barang implements Pembayaran {
    public static final String TotalBayar = null;
    private String noFaktur;
    private String kodeBarang;
    private double totalBayar;

    public DetailTransaksi(String noFaktur, String kodeBarang, String namaBarang, double harga, int jumlahBeli) {
        super(namaBarang, harga, jumlahBeli); 
        this.noFaktur = noFaktur;
        this.kodeBarang = kodeBarang;
    }

    @Override
    public void hitungTotal() {
        totalBayar = getTotalHarga();
    }

    public String getTotalBayar(){
        return null;
    }
}
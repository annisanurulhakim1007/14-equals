public class Barang {
    private String namaBarang;
    private double harga;
    private int jumlahBeli;

    public Barang(String namaBarang, double harga, int jumlahBeli) {;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public double getTotalHarga(){
        return harga*jumlahBeli;
    }

    public String getNamaBarang(){
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public double getjumlahBeli() {
        return jumlahBeli;
    }
}
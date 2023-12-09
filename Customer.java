public class Customer  {
    private String namaCustomer;
    private String nomorHP;
    private String alamat;

    public Customer(String namaCustomer, String nomorHP, String alamat) {
        this.namaCustomer = namaCustomer;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNomorHP(){
        return nomorHP;
    }

    public String getAlamat(){
        return alamat;
    }
}
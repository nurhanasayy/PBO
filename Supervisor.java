public class Supervisor {
    
    //atribut
    private int id;
    private String nama;
    private String alamat;
    private String pekerjaan;
    private String warna;
   
    //konstruktor
    public Supervisor(int id, String nama, String alamat, String pekerjaan, String warna)
    {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.warna = warna;
    }
    
    //getter setter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
   
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    
    //cetak hasil
    // public void printsupervisor(){
    //     System.out.println("id: " + getId());
    //     System.out.println("nama: " + getNama());
    // }
}


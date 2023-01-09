public class Student {
    
    // atribut
    private int nim;
    private String nama;
    private String alamat;
    private String sekolah;
    private String warna;

    //konstruktor
    public Student(int nim, String nama, String alamat, String sekolah, String warna) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.sekolah = sekolah;
        this.warna = warna;
    }

    // getter setter
    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getSekolah() {
        return sekolah;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public class iterator {
    }
 
}


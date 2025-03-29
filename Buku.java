package Semester_2.SK01;

public class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean isDipinjam;

    public Buku(String idBuku, String judul, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
        System.out.println("Buku dengan ID " + idBuku + " berhasil dibuat!");
    }

    public void tampilInfoBuku() {
        System.out.println("ID Buku: " + idBuku + ", Judul: " + judul + ", Status: " + getDipinjam());
    }
    
    public boolean pinjamBuku() {
        if (!isDipinjam) {
            isDipinjam = true;
            return true;
        }
        return false;
    }

    public void kembalikanBuku() {
        isDipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public boolean isDipinjam() {
        return isDipinjam;
    }

    public String getDipinjam() {
        if (isDipinjam) {
            return "Dipinjam";
        }
        return "Tersedia";
    }
}

package Semester_2.SK01;

public class Anggota {
    private final String idAnggota;
    private String nama;
    private String email;

    public Anggota(String idAnggota, String nama, String email) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.email = email;
        System.out.println("Anggota dengan ID " + idAnggota + " berhasil dibuat!");
    }

    public void tampilInfoAnggota() {
        System.out.println("ID Anggota: " + idAnggota + ", Nama: " + nama);
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}

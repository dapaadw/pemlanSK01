package Semester_2.SK01;

import java.time.LocalDate;

public class TransaksiPeminjaman {
    private final String idTransaksi;
    private Anggota anggota;
    private Buku buku; 
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private boolean isSelesai;

    public TransaksiPeminjaman(String idTransaksi, Anggota anggota, Buku buku, LocalDate tanggalPinjam, LocalDate tanggalKembali) {
        this.idTransaksi = idTransaksi;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.isSelesai = false;
    }

    public void tampilInfoTransaksi() {
        System.out.println("ID: " + idTransaksi + ", Status: " + getSelesai());
    }

    public void Selesai() {
        isSelesai = true;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getSelesai() {
        if (isSelesai) {
            return "Selesai";
        }
        return "Belum Selesai";
    }
}

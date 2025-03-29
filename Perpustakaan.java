package Semester_2.SK01;

import java.time.LocalDate;

public class Perpustakaan {
    private static final int MAX_BUKU = 10;
    private static Buku[] listBuku = new Buku[MAX_BUKU];
    private static Anggota[] listAnggota = new Anggota[MAX_BUKU];
    private static TransaksiPeminjaman[] listTransaksi = new TransaksiPeminjaman[MAX_BUKU];
    private static int jumlahBuku = 0;
    private static int jumlahAnggota = 0;
    private static int jumlahTransaksi = 0;

    public static void tambahBuku(Buku buku) {
        if (jumlahBuku < MAX_BUKU) {
            listBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku dengan ID " + buku.getIdBuku() + " berhasil ditambahkan!");
        } else {
            System.out.println("Daftar buku penuh!");
            return;
        }
    }

    public static void tambahAnggota(Anggota anggota) {
        if (jumlahAnggota < MAX_BUKU) {
            listAnggota[jumlahAnggota] = anggota;
            jumlahAnggota++;
            System.out.println("Anggota dengan ID " + anggota.getIdAnggota() + " berhasil ditambahkan!");
        } else {
            System.out.println("Daftar anggota sudah penuh!");
        }
    }

    public static void pinjamBuku(String idAnggota, String idBuku) {
        if (jumlahTransaksi >= MAX_BUKU) {
            System.out.println("Daftar transaksi penuh!");
            return;
        }

        Anggota anggota = null;
        Buku buku = null;

        for (int i = 0; i < jumlahAnggota; i++) {
            if (listAnggota[i].getIdAnggota() == idAnggota) {
                anggota = listAnggota[i];
                break;
            }
        }
        
        if (anggota == null) {
            System.out.println("Anggota dengan ID " + idAnggota + " tidak ditemukan!");
            return;
        }
        
        for (int i = 0; i < jumlahBuku; i++) {
            if (listBuku[i].getIdBuku() == idBuku) {
                if (listBuku[i].isDipinjam()) {
                    System.out.println("Buku dengan ID " + idBuku + " tidak tersedia untuk dipinjam!");
                    return;
                }
                buku = listBuku[i];
                break;
            }
        }
        
        if (buku == null) {
            System.out.println("Buku dengan ID " + idBuku + " tidak ditemukan!");
            return;
        }

        if (anggota != null && buku != null && buku.pinjamBuku() && jumlahTransaksi < MAX_BUKU) {
            LocalDate tanggalPinjam = LocalDate.now();
            LocalDate tanggalKembali = tanggalPinjam.plusDays(7);
            listTransaksi[jumlahTransaksi++] = new TransaksiPeminjaman("T" + jumlahTransaksi, anggota, buku, tanggalPinjam, tanggalKembali);
            System.out.println("Transaksi dengan ID T" + jumlahTransaksi + " berhasil dibuat!");
        }
    }

    public static void kembalikanBuku(String idTransaksi) {
        for (int i = 0; i < jumlahTransaksi; i++) {
            if (listTransaksi[i] != null && listTransaksi[i].getIdTransaksi().equals(idTransaksi)) {
                listTransaksi[i].getBuku().kembalikanBuku();
                System.out.println("Transaksi buku dengan ID " + listTransaksi[i].getIdTransaksi() + " berhasil dikembalikan!");
                listTransaksi[i].Selesai();
                return;
            }
        }
        System.out.println("Transaksi dengan ID " + idTransaksi + " tidak ditemukan!");
    }

    public static void tampilSemuaTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < jumlahTransaksi; i++) {
            listTransaksi[i].tampilInfoTransaksi();
        }
    }

    public static void tampilSemuaBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            listBuku[i].tampilInfoBuku();
        }
    }

    public static void tampilSemuaAnggota() {
        System.out.println("Daftar Anggota:");
        for (int i = 0; i < jumlahAnggota; i++) {
            listAnggota[i].tampilInfoAnggota();
        }
    }
}

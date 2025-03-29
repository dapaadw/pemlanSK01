package Semester_2.SK01;

public class Main {
    public static void main(String[] args) {
        System.out.println("---TAHAP1---");
    Buku buku1 = new Buku("B1", "Pemrograman Java", "John Doe", 2020);
    Buku buku2 = new Buku("B2", "Struktur Data", "Jane Doe", 2019);
    Buku buku3 = new Buku("B3", "Basis Data", "Alice Smith", 2018);
    Buku buku4 = new Buku("B4", "Jaringan Komputer", "Bob Johnson", 2021);
    Buku buku5 = new Buku("B5", "Sistem Operasi", "Charlie Brown", 2017);
    Buku buku6 = new Buku("B6", "Algoritma", "David Wilson", 2022);
    Buku buku7 = new Buku("B7", "Pemrograman Web", "Eve Davis", 2020);
    Buku buku8 = new Buku("B8", "Keamanan Siber", "Frank Miller", 2019);
    Buku buku9 = new Buku("B9", "Kecerdasan Buatan", "Grace Lee", 2021);
    Buku buku10 = new Buku("B10", "Pemrograman Mobile", "Hank Green", 2018);
    Buku buku11 = new Buku("B11", "Manajemen Proyek", "Ivy White", 2022);
    Buku buku12 = new Buku("B12", "Pemrograman Python", "Jack Black", 2020);
    
    
    System.out.println("---TAHAP2---");
    Anggota anggota1 = new Anggota("A1", "Alice", "alice@example.com");
    Anggota anggota2 = new Anggota("A2", "Bob", "bob@example.com");
    Anggota anggota3 = new Anggota("A3", "Charlie", "charlie@example.com");
    Anggota anggota4 = new Anggota("A4", "David", "david@example.com");
    Anggota anggota5 = new Anggota("A5", "Eve", "eve@example.com");
    Anggota anggota6 = new Anggota("A6", "Frank", "frank@example.com");
    Anggota anggota7 = new Anggota("A7", "Grace", "grace@example.com");
    Anggota anggota8 = new Anggota("A8", "Hank", "hank@example.com");
    Anggota anggota9 = new Anggota("A9", "Ivy", "ivy@example.com");
    Anggota anggota10 = new Anggota("A10", "Jack", "jack@example.com");
    Anggota anggota11 = new Anggota("A11", "Kathy", "kathy@example.com");
    Anggota anggota12 = new Anggota("A12", "Leo", "leo@example.com");
    Anggota anggota13 = new Anggota("A13", "Mona", "mona@example.com");
    
    System.out.println("---TAHAP3---");
    Perpustakaan.tambahBuku(buku1);
    Perpustakaan.tambahBuku(buku2);
    Perpustakaan.tambahBuku(buku3);
    Perpustakaan.tambahBuku(buku4);
    Perpustakaan.tambahBuku(buku5);
    Perpustakaan.tambahBuku(buku6);
    Perpustakaan.tambahBuku(buku7);
    Perpustakaan.tambahBuku(buku8);
    Perpustakaan.tambahBuku(buku9);
    Perpustakaan.tambahBuku(buku10);
    Perpustakaan.tambahBuku(buku11);
    Perpustakaan.tambahBuku(buku12);
    
    System.out.println("---TAHAP4---");
    Perpustakaan.tambahAnggota(anggota1);
    Perpustakaan.tambahAnggota(anggota2);
    Perpustakaan.tambahAnggota(anggota3);
    Perpustakaan.tambahAnggota(anggota4);
    Perpustakaan.tambahAnggota(anggota5);
    Perpustakaan.tambahAnggota(anggota6);
    Perpustakaan.tambahAnggota(anggota7);
    Perpustakaan.tambahAnggota(anggota8);
    Perpustakaan.tambahAnggota(anggota9);
    Perpustakaan.tambahAnggota(anggota10);
    Perpustakaan.tambahAnggota(anggota11);
    Perpustakaan.tambahAnggota(anggota12);
    Perpustakaan.tambahAnggota(anggota13);
    
    System.out.println("---TAHAP5---");
    Perpustakaan.pinjamBuku("A1", "B5");
    Perpustakaan.pinjamBuku("A2", "B3");
    Perpustakaan.pinjamBuku("A3", "B7");
    Perpustakaan.pinjamBuku("A4", "B1");
    Perpustakaan.pinjamBuku("A5", "B9");
    Perpustakaan.pinjamBuku("A6", "B2");
    Perpustakaan.pinjamBuku("A7", "B7");
    Perpustakaan.pinjamBuku("A8", "B6");
    Perpustakaan.pinjamBuku("A9", "B8");
    Perpustakaan.pinjamBuku("A10", "B10");
    Perpustakaan.pinjamBuku("A11", "B2");
    Perpustakaan.pinjamBuku("A12", "B11");
    Perpustakaan.pinjamBuku("A13", "B1");
    Perpustakaan.pinjamBuku("A1", "B3");
    Perpustakaan.pinjamBuku("A2", "B6");

    System.out.println("---TAHAP6---");
    Perpustakaan.tampilSemuaAnggota();
    Perpustakaan.tampilSemuaBuku();
    Perpustakaan.tampilSemuaTransaksi();

    System.out.println("---TAHAP7---");
    Perpustakaan.kembalikanBuku("T1");
    Perpustakaan.kembalikanBuku("T5");
    Perpustakaan.kembalikanBuku("T8");
    Perpustakaan.kembalikanBuku("T3");
    Perpustakaan.kembalikanBuku("T12");

    System.out.println("---TAHAP8---");
    Perpustakaan.pinjamBuku("A3", "B2");
    Perpustakaan.pinjamBuku("A4", "B8");
    Perpustakaan.pinjamBuku("A5", "B4");
    Perpustakaan.pinjamBuku("A6", "B10");

    System.out.println("---TAHAP9---");
    Perpustakaan.kembalikanBuku("T2");
    Perpustakaan.kembalikanBuku("T6");
    Perpustakaan.kembalikanBuku("T9");
    Perpustakaan.kembalikanBuku("T4");
    Perpustakaan.kembalikanBuku("T7");
    Perpustakaan.kembalikanBuku("T11");
    
    System.out.println("---TAHAP10---");
    Perpustakaan.tampilSemuaAnggota();
    Perpustakaan.tampilSemuaBuku();
    Perpustakaan.tampilSemuaTransaksi();
    }
}

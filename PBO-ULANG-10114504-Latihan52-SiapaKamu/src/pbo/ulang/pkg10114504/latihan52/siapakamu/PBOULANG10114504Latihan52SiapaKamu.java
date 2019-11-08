/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program untuk Menampilkan data dosen dan mahasiswa
 */
public class PBOULANG10114504Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
       
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMatakuliah("PBO");
        System.out.println("NIP Dosen : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10114504");
        mhs.setNama("Sandy Akbar");
        mhs.setKelas("PBO-Ulang");
        mhs.setUmur(17);
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan52.siapakamu;

/**
 *
 * @author NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program untuk Menampilkan data dosen dan mahasiswa
 */
class Mahasiswa {
    private String nim;
private String kelas;
    private String nama;
    private String umur;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang "
                + "belajar dikelas "+ kelas);    
    }

    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }

  
    void setNama(String nindi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setUmur(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

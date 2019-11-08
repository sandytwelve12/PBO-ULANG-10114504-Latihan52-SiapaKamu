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
public class Dosen extends Manusia {
    private String nip;
private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    public void mengajarApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang "
                + "mengajar matakuliah "+matakuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen"); 
    }

}

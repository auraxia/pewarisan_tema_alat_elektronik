/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

import java.time.LocalDate;

public class AlatElektronik
{
    // instance variables - replace the example below with your own
    protected String nama;
    protected String merek;
    protected int tahunProduksi;
    protected double daya;

    public AlatElektronik(String nama, String merek, int tahunProduksi, double daya)
    {
        this.nama = nama;
        this.merek = merek;
        this.daya = daya;
        this.tahunProduksi = tahunProduksi;
    }

    public void hitungBiayaOperasional(double jamPakaiHarian, double tarifListrik)
    {
        double BO = (daya * jamPakaiHarian / 1000) * tarifListrik;
        System.out.println("Biaya operasional harian " +nama+ ": Rp" +BO);
    }
    
    public int hitungUsiaPerangkat(){
        int tahunSekarang = LocalDate.now().getYear();
        return tahunSekarang - tahunProduksi;
    }
    
    public void tampilData(){
        System.out.println("Nama              : " + nama);
        System.out.println("Merek             : " + merek);
        System.out.println("Tahun Produksi    : " + tahunProduksi);
        System.out.println("Usia Perangkat    : " + hitungUsiaPerangkat() + " tahun");
        System.out.println("Daya              : " + daya + " watt");
    }
}

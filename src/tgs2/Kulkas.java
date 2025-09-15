/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

public class Kulkas extends PerangkatRumahTangga{
    private int jumlahPintu;
    
    public Kulkas (String nama, String merek, int tahunProduksi, double daya, String areaPenggunaan, int jumlahPintu)
    {
        super(nama, merek, tahunProduksi, daya, areaPenggunaan);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void cekPenyimpanan(){
        if(jumlahPintu>1){
            System.out.println(nama + " memiliki kapasitas penyimpanan besar");
        }else if(jumlahPintu == 1){
            System.out.println(nama + " cocok untuk kebutuhan dasr");
        }
    }
    
    public void tampilDataKulkas(){
        super.tampilDataRT();
    }
}

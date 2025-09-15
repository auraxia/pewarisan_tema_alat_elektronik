/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

/**
 *
 * @author MyLaptop
 */
public class Smartphone extends PerangkatMobile{
    private int kameraMp;
    
    public Smartphone(String nama, String merek, int tahunProduksi, double daya, int kapasitasBaterai, int kameraMp)
    {
        super(nama, merek, tahunProduksi, daya, kapasitasBaterai);
        this.kameraMp = kameraMp;
    }
    
    public void cekKualitasKamera(){
        if(kameraMp>48){
            System.out.println(nama + " memiliki kamera kualitas high-end");
        }else if(kameraMp<=48 && 12<=kameraMp){
            System.out.println(nama + " memiliki kamera kualitas menengah");
        }else{
            System.out.println(nama + " memiliki kamera kualitas dasar");
        }
    }
     
    public void tampilDataSmartphone() {
        super.tampilDataMobile();
    }
}

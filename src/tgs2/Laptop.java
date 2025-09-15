/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

/**
 *
 * @author MyLaptop
 */
public class Laptop extends PerangkatKomputer{
    private double ukuranLayar;
    
    public Laptop(String nama, String merek, int tahunProduksi, double daya, String tipeProcessor, double ukuranLayar)
    {
        super(nama, merek, tahunProduksi, daya, tipeProcessor);
        this.ukuranLayar = ukuranLayar;
    }
    
    public void cekKenyamananLayar(){
        if(ukuranLayar>16){
            System.out.println(nama + " memiliki layar besar, cocok untuk desain");
        }else if(ukuranLayar<=16 && 13<=ukuranLayar){
            System.out.println(nama + " memiliki ukuran layar ideal untuk produktivitas");
        }else if (ukuranLayar<13){
            System.out.println(nama + " memiliki layar compact, cocok untuk mobilitas");
        }
    }
    
    public void tampilDataLaptop(){
        super.tampilDataKomputer();
    }
}

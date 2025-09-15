/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

public class Tablet extends PerangkatMobile{
    private boolean supportStylus;
    
    public Tablet(String nama, String merek, int tahunProduksi, double daya, int kapasitasBaterai, boolean supportStylus)
    {
        super(nama, merek, tahunProduksi, daya, kapasitasBaterai);
        this.supportStylus = supportStylus;
    }
    
    public void cekKapabilitasLayar(){
        if(supportStylus == true){
            System.out.println(nama + " mendukung aktivitas menggambar digital");
        }else{
            System.out.println(nama + " kurang cocok untuk menggambar digital");
        }
    }
     
    public void tampilDataTablet() {
        super.tampilDataMobile();
    }
}

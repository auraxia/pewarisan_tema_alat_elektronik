/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

/**
 *
 * @author MyLaptop
 */
public class PC extends PerangkatKomputer{
    private String jenisStorage;
    
    public PC(String nama, String merek, int tahunProduksi, double daya, String tipeProcessor, String jenisStorage)
    {
        super(nama, merek, tahunProduksi, daya, tipeProcessor);
        this.jenisStorage = jenisStorage;
    }
    
    public void cekKecepatanStorage(){
        if(jenisStorage.equals("SSD") ){
            System.out.println(nama + " menggunakan SSD  - Kecepatan baca/tulis tinggi");
        }else if (jenisStorage.equals("HDD")){
            System.out.println(nama + " menggunakan HDD  - Kecepatan sedang dengan kapasitas besar");
        }else{
            System.out.println(nama + " tipe storage tidak dikenali");
        }
    }
    
    public void tampilDataPC(){
        super.tampilDataKomputer();
    }
    
}

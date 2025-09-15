/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

public class PerangkatKomputer extends AlatElektronik
{
    protected String tipeProcessor;
    
    public PerangkatKomputer(String nama, String merek, int tahunProduksi, double daya, String tipeProcessor)
    {
        super(nama, merek, tahunProduksi, daya);
        this.tipeProcessor = tipeProcessor;
    }

    public void hitungPerforma()
    {
        int usiaPerangkat = 2025 - tahunProduksi;
        
        if (usiaPerangkat < 2){
            System.out.println(nama+ " performanya sangat lambat (" +usiaPerangkat+ "tahun)");
        }else if(usiaPerangkat >= 2 && usiaPerangkat <= 7){
            System.out.println(nama+ " performanya menurun (" +usiaPerangkat+ "tahun)");
        }else if (usiaPerangkat < 7){
            System.out.println(nama+ " performanya masih optimal  (" +usiaPerangkat+ "tahun)");
        }
    }
    
    public void tampilDataKomputer()
    {
        super.tampilData();
        System.out.println("Processor         : " + tipeProcessor);
    }
    
    
}

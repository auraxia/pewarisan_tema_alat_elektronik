/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;


public class PerangkatMobile extends AlatElektronik
{
    protected int kapasitasBaterai;
    
    public PerangkatMobile(String nama, String merek, int tahunProduksi, double daya, int kapasitasBaterai)
    {
        super(nama, merek, tahunProduksi, daya);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void cekStatusBaterai(double persentaseBaterai)
    {
        if (persentaseBaterai < 20){
            System.out.println("Baterai " +nama+ " lemah (" +persentaseBaterai+ "%)");
        }else if(persentaseBaterai >= 20 && persentaseBaterai <= 80){
            System.out.println("Baterai " +nama+ " cukup (" +persentaseBaterai+ "%)");
        }else if (persentaseBaterai < 80){
            System.out.println("Baterai " +nama+ " penuh (" +persentaseBaterai+ "%)");
        }
    }
        
    public void tampilDataMobile()
    {
        super.tampilData();
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
    }
}

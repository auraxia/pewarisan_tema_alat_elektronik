/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;


public class PerangkatRumahTangga extends AlatElektronik
{
    protected String areaPenggunaan;
    
    public PerangkatRumahTangga(String nama, String merek, int tahunProduksi, double daya, String areaPenggunaan)
    {
        super(nama, merek, tahunProduksi, daya);
        this.areaPenggunaan = areaPenggunaan;
    }

    public void hitungEfisiensiEnergi(double luasRuangan)
    {
        double efisiensi = daya / luasRuangan;
        
        if (efisiensi < 10){
            System.out.println(nama+ " sangat efisien untuk " +areaPenggunaan);
        }else if(efisiensi >= 10 && efisiensi <= 20){
            System.out.println(nama+ " sangat efisien untuk " +areaPenggunaan);
        }else if (efisiensi < 20){
            System.out.println(nama+ " sangat efisien untuk " +areaPenggunaan);
        }
    }
    
    public void tampilDataRT()
    {
        super.tampilData();
        System.out.println("Area Penggunaan   : " + areaPenggunaan);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2_c_12515;

public class MesinCuci extends PerangkatRumahTangga{
    private double kapasitasCuci;
    
    public MesinCuci (String nama, String merek, int tahunProduksi, double daya, String areaPenggunaan, double kapasitasCuci)
    {
        super(nama, merek, tahunProduksi, daya, areaPenggunaan);
        this.kapasitasCuci = kapasitasCuci;
    }
    
    public void hitungWaktuCuci(double beratPakaian){
        double estimasi = (beratPakaian / kapasitasCuci) * 60;
        
        System.out.println(nama + " memiliki estimasi waktu cuci: " + estimasi + " menit, berat pakaian: " +beratPakaian +" kg");
    }
    
    public void tampilDataMesinCuci(){
        super.tampilDataRT();
    }
}

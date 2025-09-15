/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs2_c_12515;

/**
 *
 * @author Dina
 */
public class TGS2_C_12515 {

    public static void main(String[] args) {
        Smartphone[] s = new Smartphone[3];
        s[0] = new Smartphone("Galaxy S23", "Samsung", 2023, 15.0, 4000, 108);
        s[1] = new Smartphone("iPhone 15", "Apple", 2023, 18.0, 3200, 48);
        s[2] = new Smartphone("Redmi 10", "Apple", 2023, 18.0, 3200, 8);

        Tablet[] t = new Tablet[2];
        t[0] = new Tablet("iPad Pro", "Apple", 2022, 30.0, 7500, true);
        t[1] = new Tablet("Galaxy Tab S8", "Samsung", 2023, 25.0, 8000, false);

        PC[] k = new PC[3];
        k[0] = new PC("Office PC", "Dell", 2020, 350.0, "Intel i5", "SSD");
        k[1] = new PC("Gaming PC", "ASUS", 2023, 550.0, "Ryzen 9", "HDD");
        k[2] = new PC("School PC", "Acer", 2024, 450.0, "Intel i9", "NVMe");

        Laptop[] l = new Laptop[2];
        l[0] = new Laptop("MacBook Pro", "Apple", 2021, 65.0, "M1 Pro", 12);
        l[1] = new Laptop("ThinkPad X1", "Lenovo", 2022, 45.0, "Intel i7", 13.3);

        Kulkas[] klks = new Kulkas[2];
        klks[0] = new Kulkas("Side by Side", "LG", 2021, 200.0, "Dapur", 4);
        klks[1] = new Kulkas("Mini Fridge", "Sharp", 2022, 120.0, "Kamar", 10);

        MesinCuci[] mc = new MesinCuci[2];
        mc[0] = new MesinCuci("Front Load", "Panasonic", 2020, 300.0, "Laundry", 8.0);
        mc[1] = new MesinCuci("Top Load", "Samsung", 2023, 280.0, "Laundry", 10.0);

        System.out.println("===== TAMPIL DATA SMARTPHONE =====");
        for (int i = 0; i < s.length; i++) {
            s[i].tampilDataMobile();
            System.out.println("");
        }

        System.out.println("===== TAMPIL DATA TABLET =====");
        for (int i = 0; i < t.length; i++) {
            t[i].tampilDataMobile();
            System.out.println("");
        }

        System.out.println("===== TAMPIL DATA PC =====");
        for (int i = 0; i < k.length; i++) {
            k[i].tampilDataKomputer();
            System.out.println("");
        }
        
        System.out.println("===== TAMPIL DATA LAPTOP =====");
        for (int i = 0; i < l.length; i++) {
            l[i].tampilDataKomputer();
            System.out.println("");
        }

        System.out.println("===== TAMPIL DATA KULKAS =====");
        for (int i = 0; i < klks.length; i++) {
            klks[i].tampilDataRT();
            System.out.println("");
        }

        System.out.println("===== TAMPIL DATA MESIN CUCI =====");
        for (int i = 0; i < mc.length; i++) {
            mc[i].tampilDataRT();
            System.out.println();
        }

        System.out.println("===== CEK KUALITAS KAMERA SMARTPHONE =====");
        for (Smartphone hp : s) {
            hp.cekKualitasKamera();
        }
        System.out.println("");

        System.out.println("===== CEK KAPABILITAS TABLET =====");
        for (Tablet tablet : t) {
            tablet.cekKapabilitasLayar();
        }
        System.out.println("");

        System.out.println("===== CEK KECEPATAN STORAGE PC =====");
        for (PC komputer : k) {
            komputer.cekKecepatanStorage();
        }
        System.out.println("");

        System.out.println("===== CEK KENYAMANAN LAYAR LAPTOP =====");
        for (Laptop laptop : l) {
            laptop.cekKenyamananLayar();
        }
        System.out.println("");

        System.out.println("===== CEK PENYIMPANAN KULKAS =====");
        for (Kulkas kulkas : klks) {
            kulkas.cekPenyimpanan();
        }
        System.out.println("");

        System.out.println("===== HITUNG WAKTU CUCI MESIN CUCI =====");
        mc[0].hitungWaktuCuci(5.0);
        mc[1].hitungWaktuCuci(8.5);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan60_akatsuki;

/**
 *
 * @author Geo Syah Alkautsar
 */
public class Kakuzu extends Akatsuki{
    private String kekuatan;
    private String topeng;
    
    @Override
    public void jurus(){
        System.out.println("Hidan memiliki kekuatan khusus yaitu : ");
        System.out.println("1. Doton Domu No Jutsu");
        System.out.println("2. Katon Zukokku No Jutsu");
        System.out.println("3. Raiton Gian No Jutsu");
        System.out.println("4. Futon Atsugai No Jutsu");
        System.out.println("5. Suiton Suijinheki No Jutsu");
        System.out.println("6. Mizu Bunshin No Jutsu");
        
        System.out.println("");
    }

    public String getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(String kekuatan) {
        this.kekuatan = kekuatan;
    }
    
}

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
class Itachi extends Akatsuki{
    private String sharingan;
    
    @Override
    public void jurus(){
        System.out.println("Jurus Utama : ");
        System.out.println("1. Mangekyou Sharingan");
        System.out.println("2. Amateratsu");
        System.out.println("3. Susanoo");
        System.out.println("4. Katon Gokyaku No Jutsu");
        System.out.println("5. Genjutsu Tsukiyomi");
        System.out.println("");
    }

    public String getSharingan() {
        return sharingan;
    }

    public void setSharingan(String sharingan) {
        this.sharingan = sharingan;
    }
    
}

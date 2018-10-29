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
class Hidan extends Akatsuki{
    private String ritual;
    private String senjata;
    
    @Override
    public void jurus(){
        System.out.println("Kekuatan : ");
        System.out.println("KEABADIAN");
        System.out.println("");
    }

    public String getRitual() {
        return ritual;
    }

    public void setRitual(String ritual) {
        this.ritual = ritual;
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }
    
}

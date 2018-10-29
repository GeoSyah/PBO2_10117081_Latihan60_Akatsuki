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
class Kisame extends Akatsuki{
    private String samehada;
    private String senjata;
    
    @Override
    public void jurus(){
        System.out.println("Jurus Utama : ");
        System.out.println("1. Mizu Bunshin no Justu");
        System.out.println("2. Suiro Sameodori no Justu");
        System.out.println("3. Suiro no Justu");
        System.out.println("4. Suiton Senjikizame");
        System.out.println("5. Suiton Bakusui Shoha");
        System.out.println("");
    }

    public String getSamehada() {
        return samehada;
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSamehada(String samehada) {
        this.samehada = samehada;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }
    
}

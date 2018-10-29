/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan60_akatsuki;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan identitas anggota AKATSUKI
 */
public class PBO2_10117081_Latihan60_Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Itachi itachi = new Itachi();
        itachi.setNama("Uchiha Itachi");
        itachi.setAsalDesa("Konohagakure");
        itachi.setElemen("Api");
        itachi.setPartner("Kisame Hosigaki");
        itachi.setSharingan("Mangekyo Sharingan");
        System.out.println("Nama : "+itachi.getNama());
        System.out.println("Asal Desa : "+itachi.getAsalDesa());
        System.out.println("Elemen Utama : "+itachi.getElemen());
        System.out.println("Nama Partner : "+itachi.getPartner());
        System.out.println("Kekuatan Khusus : "+itachi.getSharingan());
        itachi.jurus();
        
        Kisame kisame = new Kisame();
        kisame.setNama("Hosigaki Kisame");
        kisame.setAsalDesa("Kirigakure");
        kisame.setElemen("Air");
        kisame.setPartner("Uchiha Itachi");
        kisame.setSamehada("Bijuu Tanpa Ekor");
        kisame.setSenjata("Samehada");
        System.out.println("Nama : "+kisame.getNama());
        System.out.println("Asal Desa : "+kisame.getAsalDesa());
        System.out.println("Elemen Utama : "+kisame.getElemen());
        System.out.println("Nama Partner : "+kisame.getPartner());
        System.out.println("Kekuatan Khusus : "+kisame.getSamehada());
        System.out.println("Senjata Khsusus : "+kisame.getSenjata());
        kisame.jurus();
        
        Hidan hidan = new Hidan();
        hidan.setNama("Hidan");
        hidan.setAsalDesa("Amegakure");
        hidan.setElemen("Tidak Punya Elemen");
        hidan.setPartner("Kakuzu");
        hidan.setRitual("Lingkaran Ritual Kematian");
        hidan.setSenjata("Pedang Ritual Kematian");
        System.out.println("Nama : "+hidan.getNama());
        System.out.println("Asal Desa : "+hidan.getAsalDesa());
        System.out.println("Elemen Utama : "+hidan.getElemen());
        System.out.println("Nama Partner : "+hidan.getPartner());
        System.out.println("Kekuatan Khusus : "+hidan.getRitual());
        System.out.println("Senjata Khusus : "+hidan.getSenjata());
        hidan.jurus();
        
        Kakuzu kakuzu = new Kakuzu();
        kakuzu.setNama("Kakuzu");
        kakuzu.setAsalDesa("Takigakure");
        kakuzu.setElemen("Tanah, Api, Angin, Air, Listrik");
        kakuzu.setPartner("Hidan");
        kakuzu.setKekuatan("4 Topeng Berelemen");
        System.out.println("Nama : "+ kakuzu.getNama());
        System.out.println("Asal Desa : "+ kakuzu.getAsalDesa());
        System.out.println("Elemen Utama : "+ kakuzu.getElemen());
        System.out.println("Nama Partner : "+ kakuzu.getPartner());
        System.out.println("Kekuatan Khusus : "+ kakuzu.getKekuatan());
        kakuzu.jurus();
        
        
    }
    
}

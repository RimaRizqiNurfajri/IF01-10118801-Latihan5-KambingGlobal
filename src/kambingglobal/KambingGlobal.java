/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      : 10118801
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * Jumlah kambing menggunakan varibel instance 
 * 
 */
public class KambingGlobal {
    // Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing:" + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
        
    }
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}

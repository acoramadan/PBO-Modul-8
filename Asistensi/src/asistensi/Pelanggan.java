/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asistensi;

import java.time.LocalDate;
import java.util.Date;
public class Pelanggan {
    private String nama;
    private String makanan;
    private int id_user;
    private int id_pesanan;
    private String minuman;
    private double harga = 0;
    public double jumlah = 0;
    public String getNama(){
        return nama;
    }
    public String getMakanan(){
        return makanan;
    }
    public int getid_user(){
        return id_user;
    }
    public int getId_pesanan(){
        return id_pesanan;
    }
    public String getMinuman(){
        return minuman;
    }
    
    public double getTotalHarga(){
        return jumlah * harga;
    }
    public double getHarga(){
        return harga;
    }
    
    public void setMakanan(String makanan){
        this.makanan = makanan;

    }
    public void setMinuman(String minuman){
        this.minuman = minuman;
    }
    public void setUser(String user){
        this.nama = user;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setHargaMakanan(String makanan){
        switch(makanan){
            case "Coto":
                this.harga += 15000.00;
                break;
            case "Palubasa":
                this.harga += 20000.00;
                break;
            case "Batagor":
                this.harga += 10000.00;
                break;
            default:
                System.out.println("Tidak ada pilihan!");
        }
    }
    public void setHargaMinuman(String minuman){
        switch(minuman){
            case "es_teh":
                this.harga += 5000.00;
                break;
            case "nutrisari":
                this.harga += 6000.00;
                break;
            case "aqua":
                this.harga += 3000.00;
                break;
            default:
                System.out.println("Tidak ada pilihan!");
        }
    }
   
}

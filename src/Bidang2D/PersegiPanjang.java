/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang2D;
import Bidang.Bidang;

/**
 *
 * @author anaskhalifm
 */
public class PersegiPanjang extends Bidang{
    protected double panjang, lebar;
    protected void setPersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }
    
    protected double getPanjang(){
        return panjang;
    }
    
    protected double getLebar(){
        return lebar;
    }
    
    protected double hitungLuas(){
        double L = panjang * lebar;
        return L;
    }
    
    protected double hitungKeliling(){
        double K = 2 * (panjang + lebar);
        return K;
    }
    
    public void infoPersegiPanjang(double p, double l){
        super.setBidang("Persegi Panjang", "Bidang 2 Dimensi");
        System.out.println("Nama : "+super.getNama());
        System.out.println("Jenis : "+super.getJenis());
        setPersegiPanjang(p,l);
        System.out.println("Luas persegi panjang dengan panjang : "+getPanjang()
        +" dan lebar : "+getLebar()+" adalah "+hitungLuas());
        System.out.println("Keliling persegi panjang dengan panjang "+getPanjang()
        +" dan lebar : "+getLebar()+" adalah "+hitungKeliling());
        System.out.println("--------------------------------------------------");
    }
}

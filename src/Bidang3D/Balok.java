/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang3D;
import Bidang.Bidang;
import Bidang2D.PersegiPanjang;

/**
 *
 * @author anaskhalifm
 */
public class Balok extends PersegiPanjang {
    protected double tinggi;
    protected void setBalok(double t){
        tinggi = t;
    }
    
    protected double getTinggi(){
        return tinggi;
    }
    
    protected double hitungVolume(){
        double V = super.hitungLuas() * tinggi;
        return V;
    }
    
    public void infoBalok(double p, double l, double t){
        super.setBidang("Balok", "Bidang 3 Dimensi");
        System.out.println("Nama : "+super.getNama());
        System.out.println("Jenis : "+super.getJenis());
        super.setPersegiPanjang(p, l);
        setBalok(t);
        System.out.println("Volume Balok dengan panjang : "+super.getPanjang()
        +" dan lebar "+super.getLebar()+" dan tinggi "+getTinggi()
        +" adalah "+hitungVolume());
        System.out.println("--------------------------------------------------");
    }
}

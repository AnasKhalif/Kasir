/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang3D;
import Bidang.Bidang;
import Bidang2D.Lingkaran;

/**
 *
 * @author anaskhalifm
 */
public class Tabung extends Lingkaran{
    protected double tinggi;
    protected void setTabung(double t){
        tinggi = t;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    protected double hitungVolume(){
        double V = super.hitungLuas() * tinggi;
        return V;
    }
    
    public void infoTabung(double r, double t){
    super.setBidang("Balok", "Bidang 3 Dimensi");
    System.out.println("Nama : "+super.getNama());
    System.out.println("Jenis : "+super.getJenis());
    super.setLingkaran(r);
    setTabung(t);
    System.out.println("Volume Tabung dengan radius : "+super.getRadius()
    +" dan tinggi "+getTinggi()+" adalah "+hitungVolume());
    System.out.println("------------------------------------------------");
    }
}

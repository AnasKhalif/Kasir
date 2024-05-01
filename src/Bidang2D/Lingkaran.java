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
public class Lingkaran extends Bidang{
    protected double radius;
    protected void setLingkaran(double r){
        radius = r;
    }
    
    protected double getRadius(){
        return radius;
    }
    
    protected double hitungLuas(){
        double L = Math.PI * radius * radius;
        return L;
    }
    
    protected double hitungKeliling(){
        double K = 2 * Math.PI *radius;
        return K;
    }
    
    public void infoLingkaran(double r){
        super.setBidang("Lingkaran", "Bidang 2 Dimensi");
        System.out.println("Nama : "+super.getNama());
        System.out.println("Jenis : "+super.getJenis());
        setLingkaran(r);
        System.out.println("Luas Lingkaran dengan radius : "+getRadius()
        +" adalah "+hitungLuas());
        System.out.println("Keliling lingkaran dengan radius : "+getRadius()
        +" adalah "+hitungKeliling());
        System.out.println("------------------------------------------------");
    }
}

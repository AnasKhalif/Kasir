/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FungsiUtama;
import Bidang2D.*;
import Bidang3D.*;
import java.util.Scanner;

/**
 *
 * @author anaskhalifm
 */
public class FungsiUtama {
    
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran ling = new Lingkaran();
        Balok bal = new Balok();
        Tabung tab = new Tabung();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang : ");
        double p = input.nextDouble();
        System.out.println("Masukkan lebar : ");
        double l = input.nextDouble();
        System.out.println("Masukkan tinggi : ");
        double t = input.nextDouble();
        System.out.println("Masukkan radius : ");
        double r = input.nextDouble();
        
        pp.infoPersegiPanjang(p, l);
        ling.infoLingkaran(r);
        bal.infoBalok(p, l, t);
        tab.infoTabung(r, t);
    }
    
}

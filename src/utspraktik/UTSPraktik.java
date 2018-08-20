/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspraktik;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class UTSPraktik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //deklarasi
       int kodebarang, diskon, jumlahbarang;
       double hasildiskon;
       String namabarang, kasir;
       System.out.println("toko JOS");
       System.out.println("Jl.Angan");
       System.out.println("Habiskan Uangmu Disini");
       
       //membuat scanner
       Scanner input = new Scanner(System.in);
       
       //deskripsi
      
       //pensil
       int s = 2000;
       int pensil = 2000;
       System.out.println ("harga buku = " +"Rp " +s);
       
       //buku
       int f = 2500;
       int buku = 2500;
       System.out.println ("harga buku = " +"Rp " +f);
       
       //penggaris
       int g = 1500;
       int penggaris = 1500;
       System.out.println ("harga penggaris = " +"Rp " +g);
       
       //penghapus
       int h = 500;
       int penghapus = 500;
       System.out.println ("harga penghapus = " +"Rp " +h);
       
       //tepak
       int e = 15000;
       int tepak = 15000;
       System.out.println ("harga tepak = " +"Rp " +e);
       
       //papantulis
       int t = 45000;
       int papantulis = 45000;
       System.out.println ("harga papantulis = " +"Rp " +t);
       
       //pulpen
       int p = 8000;
       int pulpen = 8000;
       System.out.println ("harga pulpen = " +"Rp " +p);
       
       //kertasa4
       int k = 30000;
       int kertasa4 = 30000;
       System.out.println ("harga kertasa4 = " +"Rp " +k);
       
       //binder
       int r = 20000;
       int binder = 20000;
       System.out.println ("harga binder = " +"Rp " +r);
       
       //pensil
       System.out.println ("Jumlah pensil yang akan anda beli = ");
       int jumlahpensil = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahpensil);
       int jumlahhargapensil = s*jumlahpensil;
       System.out.println ("totalharga = " +"Rp" + jumlahhargapensil);
       
       //buku
       System.out.println ("Jumlah buku yang akan anda beli = ");
       int jumlahbuku = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahbuku);
       int jumlahhargabuku = f*jumlahbuku;
       System.out.println ("totalharga = " +"Rp" + jumlahhargabuku);
       
       //penggaris
       System.out.println ("Jumlah penggaris yang akan anda beli = ");
       int jumlahpenggaris = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahpenggaris);
       int jumlahhargapenggaris = g*jumlahpenggaris;
       System.out.println ("totalharga = " +"Rp" + jumlahhargapenggaris);
       
       //penghapus
       System.out.println ("Jumlah penghapus yang akan anda beli = ");
       int jumlahpenghapus = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahpenghapus);
       int jumlahhargapenghapus = h*jumlahpenghapus;
       System.out.println ("totalharga = " +"Rp" + jumlahhargapenghapus);
       
       //tepak
       System.out.println ("Jumlah tepak yang akan anda beli = ");
       int jumlahtepak = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahtepak);
       int jumlahhargatepak = e*jumlahtepak;
       System.out.println ("totalharga = " +"Rp" + jumlahhargatepak);
       
       //papantulis
       System.out.println ("Jumlah papantulis yang akan anda beli = ");
       int jumlahpapantulis = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahpapantulis);
       int jumlahhargapapantulis = t*jumlahpapantulis;
       System.out.println ("totalharga = " +"Rp" + jumlahhargapapantulis);
       
       //pulpen
       System.out.println ("Jumlah pulpen yang akan anda beli = ");
       int jumlahpulpen = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahpulpen);
       int jumlahhargapulpen = p*jumlahpulpen;
       System.out.println ("totalharga = " +"Rp" + jumlahhargapulpen);
       
       //kertasa4
       System.out.println ("Jumlah kertasa4 yang akan anda beli = ");
       int jumlahkertasa4 = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahkertasa4);
       int jumlahhargakertasa4 = k*jumlahkertasa4;
       System.out.println ("totalharga = " +"Rp" + jumlahhargakertasa4);
       
       //binder
       System.out.println ("Jumlah binder yang akan anda beli = ");
       int jumlahbinder = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahbinder);
       int jumlahhargabinder = r*jumlahbinder;
       System.out.println ("totalharga = " +"Rp" + jumlahhargabinder);
       
       int jumlahharga = jumlahhargapensil + jumlahhargabuku + jumlahhargapenggaris + jumlahhargapenghapus + jumlahhargatepak + jumlahhargapapantulis + jumlahhargapulpen + jumlahhargakertasa4 + jumlahhargabinder;
       
       System.out.println("===Jumlahharga===");
       
       if(jumlahharga >= 500000){
           System.out.println("harga awal = "+"Rp "+ jumlahharga);
           System.out.println("total harga belanja lebih dari 500000 maka diskon 50%");
           int hargadidiskon = (jumlahharga/2);
           System.out.println("total harga =" + "Rp" +hargadidiskon);
           
           
       }
       else if(jumlahharga >= 200000){
           System.out.println("harga awal = "+"Rp "+ jumlahharga);
           System.out.println("total harga belanja lebih dari 200000 maka diskon 20%");
           int hargadidiskon = (jumlahharga-jumlahharga*2/10);
           System.out.println("total harga =" + "Rp" +hargadidiskon);
      }
      else if(jumlahharga >= 100000){
           System.out.println("harga awal = "+"Rp "+ jumlahharga);
           System.out.println("total harga belanja lebih dari 100000 maka diskon 10%");
           int hargadidiskon = (jumlahharga-jumlahharga*1/10);
           System.out.println("total harga =" + "Rp" +hargadidiskon);
       }   
       else System.out.println("totalharga = " + "Rp" + jumlahharga);
              
    System.out.println("nama kasir galih");
    
       }
       
    }
    

 
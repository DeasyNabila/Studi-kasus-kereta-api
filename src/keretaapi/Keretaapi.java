/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keretaapi;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Keretaapi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
  
  //Masukan tipe Data
  String Tiket,Tujuan;
  int Jumlah_Tiket, Harga_Satuan, Total_Harga, Total_Bayar = 0;
  
        System.out.println("DAFTAR HARGA TIKET");
        System.out.println("Malang-Jogja = " + 45000);
        System.out.println("Malang-Lamongan = " + 30000);
        System.out.println("Malang-Bandung = " + 60000);
  
  //Input
  System.out.println("\nPEMBELIAN ");
  System.out.print("Tiket  : ");
  Tujuan = scan.nextLine();
  System.out.print("Jumlah Tiket  : ");
  Jumlah_Tiket = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  Harga_Satuan = scan.nextInt();
  
  //proses
  Total_Harga = Harga_Satuan * Jumlah_Tiket;
  
  //output
  System.out.print("Total Bayar  : "+Total_Harga);
    
}

        
        
                
        
        

    
}

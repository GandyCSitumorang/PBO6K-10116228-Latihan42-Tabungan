/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan42.tabungan;
import java.util.Scanner;
/**
 * Nama : Gandy Christian Situmorang
 * Kelas: PBO-6K
 * NIM  : 10116228
 * Deskripsi Program : program ini berisi program penarikan uang pada saldo
 * tabungan
 */
public class PBO6K10116228Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        tabungan tbg = new tabungan();
        int jumlah;
        int saldo;
   
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : Rp ");
        saldo = scn.nextInt();
        System.out.print("Jumlah uang yang diambil : Rp ");
        jumlah = scn1.nextInt();
        
        System.out.println("");
        System.out.println("Saldo Anda Sekarang : Rp " + tbg.ambilUang(saldo - jumlah));
    }
}

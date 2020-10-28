/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Nilai Terbesar Dan Terkecil
 */
public class PBOIF210119077Latihan23NilaiTerbesarDanTerkecil {

    
    public static void main(String[] args) {
        int[] nilai = new int[10];
        int n,max,min;
        String nama;
        
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Pengguna : ");
        nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n = input.nextInt();
        
        for(int i=1; i <=n; i++){
            System.out.print("Nilai Mahasiswa Ke-"+i+" = ");
            nilai[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for(int i=1; i<=n; i++){
            System.out.println("Nilai Mahasiswa Ke="+i+" = "+nilai[i]);
        }
        max=nilai[1];
        min=nilai[1];
        for (int i=1;i<=n; i++){
            if(nilai[i]>max){
                max=nilai[i];
            }
            if(nilai[i]<min){
                min=nilai[i];
            }

        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min);
        System.out.println("");
        System.out.println("Petugas : "+nama);
    }
    
}

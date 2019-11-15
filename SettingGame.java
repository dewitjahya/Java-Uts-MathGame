/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;

import java.util.Scanner;

/**
 *
 * @author anas-pc
 */
public class SettingGame {
    public int pilihan_menu, pilihan_menu_dua, last_level, last_score;

    public void Playthegame() {
        Scanner in = new Scanner(System.in);
        MenuGame cplus = new MenuGame();
        MenuGame cmin = new GameMin();
        System.out.println("****************************");
        System.out.println("         Math Game          ");
        System.out.println("****************************");
        System.out.println("Silakan pilih permainan anda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("Pilih no menu :");
        pilihan_menu = in.nextInt();
        if (pilihan_menu == 1) {
            System.out.println("****************************");
            System.out.println("   Math Game - Penjumlahan  ");
            System.out.println("****************************");
            System.out.println("1. Start");
            System.out.println("2. Select");
            System.out.println("Pilih no menu :");
            pilihan_menu_dua = in.nextInt();
            if (pilihan_menu_dua == 1) {
                cplus.Soal();
            } else if (pilihan_menu_dua == 2) {
                System.out.println("****************************");
                System.out.println("   Math Game - Penjumlahan  ");
                System.out.println("****************************");
                System.out.println("Masukkan Level Terakhir : ");
                last_level = in.nextInt();
                System.out.println("Masukkan Skor Terakhir : ");
                last_score = in.nextInt();
                cplus.Play(last_score, last_level);
            }
        } else if (pilihan_menu == 2) {
            System.out.println("****************************");
            System.out.println("   Math Game - Pengurangan  ");
            System.out.println("****************************");
            System.out.println("1. Start");
            System.out.println("2. Select");
            System.out.println("Pilih no menu :");
            pilihan_menu_dua = in.nextInt();
            if (pilihan_menu_dua == 1) {
                cmin.Soal();
            } else if (pilihan_menu_dua == 2) {
                System.out.println("****************************");
                System.out.println("   Math Game - Pengurangan  ");
                System.out.println("****************************");
                System.out.println("Masukkan Level Terakhir : ");
                last_level = in.nextInt();
                System.out.println("Masukkan Skor Terakhir : ");
                last_score = in.nextInt();
                cmin.Play(last_score, last_level);
            }
        } else {

        }

    }
}

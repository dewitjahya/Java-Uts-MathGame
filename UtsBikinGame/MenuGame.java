/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsBikinGame;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class MenuGame extends DataGame{
     protected String tampil_angka, tampil_angka2;
    public void Soal() {
        
        //instansiasi
        FormatNumber mf1 = new FormatNumber();
        FormatNumber mf2 = new FormatNumber();
        MenuGame data = new MenuGame();
        MenuGame random1 = new MenuGame();
        MenuGame random2 = new MenuGame();
        Scanner in = new Scanner(System.in);
        Scanner in_user = new Scanner(System.in);
        
        //Input nama User
        System.out.println("Masukkan nama anda : ");
        String username = in_user.next();
        
        //data skor, lives, level
        data.setLevel(1);
        data.setLives(3);
        data.setScore(0);
        int score = data.getScore();
        int lives = data.getLives();
        int lvl = data.getLevel();
        int lvl_2 = lvl + 1;
        int lvl_3 = lvl_2 + 1;
        
        while (true) {
            while (score >= 0 && score < 101) {
                if (lives > 0) {
                    random1.setRandom(11);
                    random2.setRandom(11);
                    int bilangan1 = random1.getRandom();
                    int bilangan2 = random2.getRandom();
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    tampil_angka = mf1.getFormat();
                    tampil_angka2 = mf2.getFormat();
                    
//                    User Interface
                    System.out.println("****************************");
                    System.out.println("   Math Game - Penjumlahan  ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + tampil_angka + " + " + tampil_angka2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Selamat " + username + ", Anda benar][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Maaf " + username + ", Anda salah][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mencoba kembali game ini]");
                    break;
                }
            }
            if (score == -1) {
                System.out.println("[Maaf " + username + " skor kamu tidak valid]");
                break;
            }
            while (score > 100 && score < 201) {
                if (lives > 0) {
                    random1.setRandom(11);
                    random2.setRandom(11);
                    int bilangan1 = -1 * (1 + random1.getRandom());
                    int bilangan2 = -1 * (1 + random2.getRandom());
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    tampil_angka = mf1.getFormat();
                    tampil_angka2 = mf2.getFormat();
                    
//                    UserInterface
                    System.out.println("****************************");
                    System.out.println("   Math Game- Penjumlahan   ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + tampil_angka + " + " + tampil_angka2+ " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Selamat " + username + ", Anda benar][Score: " + score + "][Lives: " + lives + "][level: " + lvl_2 + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Maaf " + username + ", Anda salah][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl_2 + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mencoba kembali game ini]");
                    break;
                }
            }
            while (score > 200 && score <= 300) {
                if (lives > 0) {
                    random1.setRandom(20);
                    random2.setRandom(20);
                    int bilangan1 = random1.getRandom() - 10;
                    int bilangan2 = random2.getRandom() - 10;
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    tampil_angka = mf1.getFormat();
                    tampil_angka2 = mf2.getFormat();
                    
//                    User Interface
                    System.out.println("****************************");
                    System.out.println("   Math Game - Penjumlahan  ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + tampil_angka + " + " + tampil_angka2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Selamat " + username + ", Anda benar][Score: " + score + "][Lives: " + lives + "][level: " + lvl_3 + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Maaf " + username + ", Anda salah][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl_3 + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mencoba kembali game ini]");
                    break;
                }
                if (score > 300) {
                    System.out.println("[Selamat " + username + ", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                    break;
                }
            }
            break;
        }
    }
//    Overloading method

    public void Play(int s, int l) {
//        Instansiasi
        FormatNumber mf1 = new FormatNumber();
        FormatNumber mf2 = new FormatNumber();
        MenuGame data = new MenuGame();
        MenuGame random1 = new MenuGame();
        MenuGame random2 = new MenuGame();
        Scanner in = new Scanner(System.in);
        Scanner input_user = new Scanner(System.in);
//        
//
        System.out.println("Masukkan nama kamu :");
        String username = input_user.next();
        data.setLevel(l);
        data.setLives(3);
        data.setScore(s);
        int score = data.getScore();
        int lives = data.getLives();
        int lvl = data.getLevel();
        while (true) {
            while (score >= 0 && score < 101) {
                if (lives > 0) {
                    random1.setRandom(11);
                    random2.setRandom(11);
                    int bilangan1 = random1.getRandom();
                    int bilangan2 = random2.getRandom();
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    tampil_angka = mf1.getFormat();
                    tampil_angka2 = mf2.getFormat();
//                    User Interface
                    System.out.println("****************************");
                    System.out.println("   Math Game - Penjumlahan  ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + tampil_angka + " + " + tampil_angka2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Selamat " + username + ", Anda benar][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Maaf " + username + ", Anda salah][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mencoba kembali game ini]");
                    break;
                }
            }
            if (score == -1) {
                System.out.println("[Maaf " + username + " skor kamu tidak valid]");
                break;
            }
            while (score > 100 && score < 201) {
                if (lives > 0) {
                    random1.setRandom(11);
                    random2.setRandom(11);
                    int bilangan1 = -1 * (1 + random1.getRandom());
                    int bilangan2 = -1 * (1 + random2.getRandom());
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    tampil_angka = mf1.getFormat();
                    tampil_angka2 = mf2.getFormat();
//                    
                    System.out.println("****************************");
                    System.out.println("   Math Game - Penjumlahan  ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + tampil_angka + " + " + tampil_angka2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Selamat " + username + ", Anda benar][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Maaf " + username + ", Anda salah][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mencoba kembali game ini]");
                    break;
                }
            }
            while (score > 200 && score <= 300) {
                if (lives > 0) {
                    random1.setRandom(20);
                    random2.setRandom(20);
                    int bilangan1 = random1.getRandom() - 10;
                    int bilangan2 = random2.getRandom() - 10;
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    tampil_angka = mf1.getFormat();
                    tampil_angka2 = mf2.getFormat();
//                    
                    System.out.println("****************************");
                    System.out.println("   Math Game - Penjumlahan  ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + tampil_angka + " + " + tampil_angka2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Selamat " + username + ", Anda benar][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Maaf " + username + ", Anda salah][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mencoba kembali game ini]");
                    break;
                }
                if (score > 300) {
                    System.out.println("[Selamat " + username + ", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                    break;
                }
            }
            break;
        }
    }
}


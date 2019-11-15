/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsBikinGame;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class DataGame {
     //    attribut

    private int NumRandom, score, lives, level;
    public int hasilPenjumlahan, hasilPengurangan;
//   encapsulation

    public void setLevel(int lvl) {
        level = lvl;
    }

    public int getLevel() {
        return level;
    }

    public void setScore(int sc) {
        score = sc;
    }

    public int getScore() {
        return score;
    }

    public void setLives(int lvs) {
        lives = lvs;
    }

    public int getLives() {
        return lives;
    }

    public void setRandom(int range) {
        Random b1 = new Random();
        NumRandom = b1.nextInt(range);
    }

    public int getRandom() {
        return NumRandom;
    }
}



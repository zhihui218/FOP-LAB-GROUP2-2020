/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author TING WEI JING
 */
public class Pokemon {

    private int HP = 10;
    private int ATK = 1;

    public Pokemon() {

    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void decHP(int amount) {
        this.HP -= amount;
    }

    public void intHP(int amount) {
        this.HP += amount;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public void battle(Pokemon pok1) {

    }

    public void battle(Pokemon pok2, Pokemon pok3, Pokemon pok4) {
                
        this.HP -= pok2.getATK();
//        this.HP -= pok1.getATK();
               
    }

}

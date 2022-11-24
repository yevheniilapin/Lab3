package Droid;

import java.util.Random;

public class Droid {
    protected String name;
    protected int HP;
    protected int damage;
    protected int armor;
    protected int dodge;
    public Droid(String name,int HP ,int damage,int armor,int dodge){
        this.name = name;
        this.HP = HP;
        this.damage= damage;
        this.armor = armor;
        this.dodge = dodge;
    }
    public Droid(){
        this.name = "BaseDroid";
        this.HP = 100;
        this.damage= 10;
        this.armor = 0;
        this.dodge = 1;
    }
    public boolean isAlive(){return HP>0;}
    public int Hit(int dmg){
        special();
        Random random = new Random();
        int rd = dmg - armor;
        if(rd<=0){rd = 1;}
        if(random.nextInt(100)>dodge){
            HP-=rd;
        }
        if(HP<0)HP=0;
        else System.out.println("Attack dodged");
        return rd;
    }
    public void special(){}
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public int getHP() {
        return HP;
    }
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", damage=" + damage +
                ", armor=" + armor +
                ", dodge=" + dodge +
                '}';
    }
    public void out(){
        System.out.println(this.toString());
    }
}

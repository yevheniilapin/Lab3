package Droid;

public class DD extends Droid{
    public DD(){
        this.name = "Damager";
        this.HP = 75;
        this.damage= 25;
        this.armor = 0;
        this.dodge = 30;
    }
    public void special() {
        if(getHP()<50)damage+=5;
        System.out.println(name+" Became stronger");
    }
}

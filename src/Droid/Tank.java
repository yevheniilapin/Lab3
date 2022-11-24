package Droid;

public class Tank extends Droid{
    public Tank(){
        this.name = "Tank";
        this.HP = 500;
        this.damage= 5;
        this.armor = 10;
        this.dodge = 0;
    }
    public void special() {
        HP+=5;
        System.out.println(name+" restored"+" 5HP");
    }
}

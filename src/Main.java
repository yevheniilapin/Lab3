import Droid.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Танк, 2 - Боець, 3 - Стандарт");
        System.out.println("Виберіть першого робота:");
        int i = scanner.nextInt();
        Droid droid1 = Choose(i);
        droid1.out();
        System.out.println("Виберіть другого робота:");
        i = scanner.nextInt();
        Droid droid2 = Choose(i);
        droid2.out();
        System.out.println("Переможець: "+Battle(droid1,droid2));

    }
    static public Droid Choose(int i){
        switch (i){
            case 1:return new Tank();
            case 2:return new DD();
            default:return new Droid();
        }
    }
    static public String Battle(Droid d1,Droid d2){
        while(d1.isAlive()&& d2.isAlive()){
            System.out.println(d1.getName()+" наносить "+d2.Hit(d1.getDamage())+"dmg");
            d2.out();
            System.out.println("-----------------------");
            if(!d2.isAlive())break;
            System.out.println(d2.getName()+" наносить "+d1.Hit(d2.getDamage())+"dmg");
            d1.out();
            System.out.println("-----------------------");
        }
        if(d1.isAlive())return d1.getName();
        else return d2.getName();
    }
}
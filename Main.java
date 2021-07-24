package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        player1 player=new player1("Abhay","m24", 100);
//        System.out.println("Player Name Is" +  player.getName());
//        System.out.println("Player Health is" +" "+ player.getHealth());
//        System.out.println("player Weapon Name"+player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.heal();


//        player.damageByGun1();
//        player.damageByGun1();

//        player2 betterplayer=new player2("prajakt","akm",80,false);
//        betterplayer.damageByGun1();




    }
}

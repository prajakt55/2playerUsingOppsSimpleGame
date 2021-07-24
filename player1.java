package com.company;



    public class player1 {
        private String name;
        private String weapon;
        private int health;

        public player1(String name, String weapon, int health) {
            this.name = name;
            this.weapon = weapon;
            if(health<0 || health >100){  //this if loop is used when user inputs the health more than 100 then this
//                                            loop is used to set the default health to 100,
                this.health = 100;          //when we create the game first time then the default health in all game health is 100
            }
            else{
                this.health = health;
            }

        }


        //this is for gun1
        public void damageByGun1() {
            this.health -= 30;  //this is damage by gun1 if we fire gun1
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got Hit By Gun1.Health is reduced by 30." + " " + "New Health is" +" "+ this.health);

            if (this.health == 0) {
                System.out.println(getName() + " " + " Is Dead");
            }
        }

        //this is for gun2
        public void gotDamageByGun2() {  //this is damage by gun2 if we fire gun2
            this.health -= 50;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got Hit By Gun2.Health is reduced by 30." + " " + "New Health is" +" "+ this.health);

            if (this.health == 0) {
                System.out.println(getName() + " " + " Is Dead");
            }
        }

        public void heal(){
            if(this.health <= 0){
                System.out.println("Player Is Dead . Heal Is Not Possible");
            }else{
                this.health = 100;
                System.out.println("Healing Is Done"+" "+ "Now Health Is"+" "+this.health);


            }
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

    }

package projectg;

import java.util.Scanner;

public class MyBattle extends MyCreature implements Battle {
	private MyPlayer player;
	private MyMonster monster;
	Scanner scnr = new Scanner(System.in);
	String input;


	public MyBattle(MyPlayer player,MyMonster monster) {
		this.player = player;
		this.monster = monster;

	}

	@Override
	public void run() {
		System.out.println("A Battle is going to start now : "+player.getDescription()+" " +
				player.getName() + " VS " + monster.getName());

		while( player.isAlive() == true && monster.isAlive() == true) 
			//here it is saying if one is died then game is over.so game will run when both is alive.
		{
			System.out.println("                                                     ");
			System.out.println(player.getName() + ": " + player.getHitPoints() + " vs " +
					monster.getName() + ": " + monster.getHitPoints()); 

			// displaying player and monster hitpoints
			System.out.println("                                                     ");

			System.out.println(player.getName() + " will go now ");
			System.out.println("Do you want to Attack(press: a/A) or you want to Heal(Press: h/H) now? ");
			System.out.println("                                                        ");
			input = scnr.next(); //now user input
			if(input.equals("a") || input.equals("A")) {
				monster.takeDamage(player.getDamage());// my creature
				//here player get damage will be the damage of monster.so monster will lose the same
				//amount of health which is equal to player damage amount.
				if (monster.isAlive() == true) { 


					System.out.println("                                                   ");   
					System.out.println(monster.getName() + " will go now ");
					//so after player hit,monster going to hit back.if he is alive.
					System.out.println("                                                 ");

					if(monster.canEnrage()) //canEnrage is the method from my monster.which has the condition
						                    //hitpoints<thrshld
					{
						monster.enrage();//mymonster
						player.takeDamage(monster.getDamage());
					} 
					else {
						player.takeDamage(monster.getDamage()); 
					}
				}


			}

			else if (input.equals("H") || input.equals("h")) {
				player.heal();//MyPlayer
			}

			else {

				System.out.println("                                       ");
				System.out.println("Oops not valid! Enter a valid input (a/h?) ");
				System.out.println("                                        ");  

			}


			if(monster.isAlive() == false) {
				System.out.println("                                          ");
				System.out.println("Monster " +monster.getName() +" has DIED. ");
				System.out.println("                                         ");

			} 
			else if (player.isAlive() == false) {

				System.out.println("                                                "); 
				System.out.println("Sorry! You are DESTROYED by monster :( ");
				System.out.println("                                                  ");

			} 

		}


	}}





//	A MyBattle class that implements interface Battle and has attributes player 
//	and monster. There is a run() method that let player and monster battle against 
//	each other until one of them dies. In each player turn, the method displays player 
//	hitPoints and monster hitPoints, then attack or heal following player’s command, 
//	and checks if monster is killed. In each monster turn, the method checks 
//	if the monster is going to enrage, then let the monster attack the player 
//	and checks if player is killed.5



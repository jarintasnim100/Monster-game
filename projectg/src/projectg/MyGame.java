package projectg;


public class MyGame implements Game {



	public MyPlayer player;
	public MyBattle fight1;
	public MyBattle fight2;
	public MyBattle fight3;
	public MyRoom[] dungeon;
	private MyMonster monster1;
	private MyMonster monster2; 
	private MyMonster monster3;
	private MyRoom room1;
	private MyRoom room2;
	private MyTreasureRoom treasureRoom;


	public MyGame()  {



		player = new MyPlayer("Kratos ", "a powerful warrior", 100, 15, 30);//hitpoints,damage,heallamount
		monster1 = new MyMonster("Orc","covered with green blood", 20,5,0); 
		
		fight1 = new MyBattle(player, monster1);
		room1 = new MyRoom(0," a room with an unbearable smell ",monster1);

		monster2 = new MyMonster("Skeleton ","funny how it moves", 40,10,10 );
		//HITPOINTS,damage,threshld
		fight2 = new MyBattle(player, monster2);
		room2 = new MyRoom(1,"dark and cold",monster2);
		monster3 = new MyMonster("Fire dragon","spout fire with each breath", 100,20,40);
		fight3 = new MyBattle(player, monster3);
		treasureRoom = new MyTreasureRoom(2,"a giant hall with something shiny on the other end",
				monster3," a large pile of gold .");

		dungeon = new MyRoom[] {room1,room2,treasureRoom};

	}
	public void play() {
		
		if(monster1.isAlive()) {
			room1.enter(player); //myRoom
			fight1.run();//mybattle

		}
		if(monster2.isAlive()) {
			room2.enter(player);
			fight2.run();
		}
		if(monster3.isAlive()) {
			treasureRoom.enter(player);
			fight3.run();
		}
		if(monster3.isAlive() == false) {
			System.out.print("Congratulations! You have got the treasure! "+ treasureRoom.getTreasure()+"!");
		}

	}



	public static void main(String[] args) {
		MyGame game = new MyGame();
		game.play();
	}


}
